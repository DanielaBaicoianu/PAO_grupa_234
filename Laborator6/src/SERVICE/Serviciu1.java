package SERVICE;

import model1.Animal;
import exceptii.Exceptie1;

import java.util.List;

public class Serviciu1 {

    public List<Animal> animale;

    private void getAnimale(Animal animal){
        animale.add(animal);
    }


    public static Boolean utile(List<Object> listaAnimale){
        if(listaAnimale.isEmpty())
            throw new Exceptie1("Niciun animal in lista");
        return true;
    }

}
