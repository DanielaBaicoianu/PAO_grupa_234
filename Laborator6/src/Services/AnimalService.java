package Services;

import Models.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalService {

    private List<Animal> animale = new ArrayList<>();

    public AnimalService() {
    }

    public AnimalService(List<Animal> animale) {
        this.animale = animale;
    }

    public void addAnimal(Animal animal) {
        animale.add(animal);
    }

    public List<Animal> getAnimale() {
        return animale;
    }

    public void setAnimale(List<Animal> animale) {
        this.animale = animale;
    }
}
