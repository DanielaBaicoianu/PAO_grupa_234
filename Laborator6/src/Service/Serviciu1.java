package Service;

import Model.Animal;
import Exceptii.Exceptie1;

import java.util.List;

import static Constants.Constante.LISTA_ANIMALE_GOALA;

public class Serviciu1 {

    public List<Animal> animale;

    public void addAnimal(Animal animal){
        animale.add(animal);
    }

    public static Boolean utile(List<Object> listaAnimale){
        if(listaAnimale.isEmpty())
            throw new Exceptie1(LISTA_ANIMALE_GOALA);
        return true;
    }

}
