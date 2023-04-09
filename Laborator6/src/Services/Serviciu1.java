package Services;

import Models.Animal;
import Models.exceptii.Exceptie1;

import java.util.List;
import java.util.Objects;

public class Serviciu1 {

    private List<Animal> animale;

    private void addAnimale(Animal animal){
        animale.add(animal);
    }

    public static Boolean eInLista(List<Object> listaAnimale){
        if(listaAnimale.isEmpty())
            throw new Exceptie1("Niciun animal in lista");
        return true;
    }

}
