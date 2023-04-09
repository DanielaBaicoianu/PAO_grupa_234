package Utile;

import Exceptions.ExceptieListaAnimaleGoala;
import Exceptions.ExceptieListaVaccinuriGoala;
import Models.Animal;

import java.util.List;

public class Utile {

    public static String pisicaVorbeste(){
        return " miau";
    }
    public static String caineleVorbeste() {return " latra";}
    public static void checkLista(List<Animal> listaAnimale) throws ExceptieListaVaccinuriGoala {
        if(listaAnimale.size() == 0)
            throw new ExceptieListaAnimaleGoala(Constants.Constants.LISTA_ANIMALE_GOALA);
    }

}
