package service.impl;

import exception.AnimalListEmptyException;
import model.Animal;
import exception.NoAnimalInListException;
import service.AnimalService;
import constant.Constante;
import java.util.ArrayList;
import java.util.List;

public class AnimalServiceImpl implements AnimalService {

    public List<Animal> animals;

    @Override
    public void addAnimal(Animal animal){
        if (animals == null) {
            this.animals = new ArrayList<>();
        }
        this.animals.add(animal);
    }

    @Override
    public List<Animal> getAnimals() {
        try {
            if (animals == null) {
                throw new NoAnimalInListException(Constante.LISTA_ANIMALE_GOALA);
            } else {
                return animals;
            }
        } catch (NoAnimalInListException exception) {
            System.out.println(exception.getMessage());
        }
        return null;
    }


}
