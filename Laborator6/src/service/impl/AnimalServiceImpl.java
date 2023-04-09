package service.impl;

import exceptions.ListaAnimaleGoalaExceptie;
import model.Animal;
import service.AnimalService;

import java.util.ArrayList;
import java.util.List;

import static constants.Constants.LISTA_ANIMALE_GOALA;

public class AnimalServiceImpl implements AnimalService {
    public List<Animal> animale;

    public void addAnimal(Animal animal){
        if (animale == null || animale.isEmpty()) {
            this.animale = new ArrayList<>();
        }
        animale.add(animal);
    }

    public Boolean util(List<Object> listaAnimale){
        if(listaAnimale.isEmpty())
            throw new ListaAnimaleGoalaExceptie(LISTA_ANIMALE_GOALA);
        return true;
    }
}
