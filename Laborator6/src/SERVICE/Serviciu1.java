package SERVICE;

import model1.Animal;
import model1.exceptii.Exceptie1;

import java.util.List;
import java.util.Objects;

public class Serviciu1 {

    public List<Animal> animale;

    public Serviciu1() {
    }

    public Serviciu1(List<Animal> animale) {
        this.animale = animale;
    }

    public void setAnimale(List<Animal> animale) {
        this.animale = animale;
    }

    public void getAnimale(Animal animal) {
        animale.add(animal);
    }

    public static Boolean utile(List<Object> listaAnimale) {
        if (listaAnimale.isEmpty())
            throw new Exceptie1("Niciun animal in lista");
        return true;
    }

    @Override
    public String toString() {
        return "Serviciu1{" +
                "animale=" + animale +
                '}';
    }
}
