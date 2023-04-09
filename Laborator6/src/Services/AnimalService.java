package SERVICE;

import model1.Animal;
import model1.exceptii.Exceptie1;

import java.util.List;
import java.util.Objects;

public class ServiciuAnimale {

    public List<Animal> animale = new ArrayList<>();

    private void addAnimal(Animal animal){
        animale.add(animal);
    }

    public static Boolean utile(List<Object> listaAnimale) throws Exception{
        if(listaAnimale.isEmpty())
            throw new Exceptie1(Constants.LISTA_ANIMALE_GOALA);
        return true;
    }

}
