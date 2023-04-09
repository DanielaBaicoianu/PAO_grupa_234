package Service;

import Exceptions.ListaVaccinuriGoalaExceptie;
import Models.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalService {

    private List<Animal> animale;

    public AnimalService(List<Animal> animale){
        this.animale = animale;
    }

    public AnimalService(){
        this.animale = new ArrayList<>();
    }

    public List<Animal> getAnimale(){
        return animale;
    }

    public void setAnimale(List<Animal> animale){
        this.animale = animale;
    }

    public void adaugareAnimal(Animal animal) {
        animale.add(animal);
    }

    public static Boolean utile(List<Object> listaAnimale){
        if(listaAnimale.isEmpty())
            throw new ListaVaccinuriGoalaExceptie("Niciun animal in lista");
        return true;
    }

}
