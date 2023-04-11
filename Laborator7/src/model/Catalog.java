package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Catalog {

    private HashMap<String, List<Integer>> listaNotePerMaterie;

    public Catalog(){
        this.listaNotePerMaterie = new HashMap<>();
    }

    public void addNote(String materie, Integer nota){
        if(!listaNotePerMaterie.containsKey(materie)){
            listaNotePerMaterie.put(materie, Arrays.asList(nota));
        }
        else{
            List<Integer> noteMaterie = new ArrayList<>(listaNotePerMaterie.get(materie));
            noteMaterie.add(nota);
            listaNotePerMaterie.put(materie, noteMaterie);
        }
    }

    public List<Integer> getNotePerMaterie(String materie){
        if(listaNotePerMaterie.containsKey(materie))
            return listaNotePerMaterie.get(materie);
        return new ArrayList<>();
    }

    public void afisareNote(){
        for(String materie : listaNotePerMaterie.keySet()) {
            List<Integer> note = listaNotePerMaterie.get(materie);
            note.stream()
                    .filter(nota -> nota > 5 )
                    .map(nota -> nota.byteValue())
                    .forEach(System.out::println);

        }
    }

    public List<String> toStringNote() {
        List<String> toateNotele = new ArrayList<>();
        for(String materie : listaNotePerMaterie.keySet()) {
            toateNotele.add( listaNotePerMaterie.get(materie).stream()
                    .map(nota -> materie +  " " + nota.toString())
                    .collect(Collectors.toList()).toString());
        }
        return toateNotele;
    }
}
