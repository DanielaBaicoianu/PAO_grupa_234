package SERVICE;

import Constants.constante;
import model1.Animal;
import model1.exceptii.Exceptie1;

import java.util.List;
import java.util.Objects;

public class Serviciu1 {

    public List<Animal> animale;

    private List<Animal> getAnimale(){
        return animale;
    }

    public static Boolean utile(List<Object> listaAnimale){
        try {
            if (listaAnimale.isEmpty())
                throw new Exceptie1(constante.LISTA_ANIMALE_GOALA);
        }
        catch (Exceptie1 exceptie1)
        {
            System.out.println(exceptie1.getMessage());
            return false;
        }
        return true;
    }

}
