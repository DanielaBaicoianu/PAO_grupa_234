package SERVICE;

import SERVICE.Animal;
import SERVICE.exceptii.Exceptie1;

import java.util.List;
import java.util.Objects;

public class Serviciu1 {

    public List<Animal> animale;

    private void getAnimale(Animal animal) {
        animale.add(animal);
    }

    public static Boolean utile(List<Object> listaAnimale) {
        if (listaAnimale.isEmpty())
            throw new Exceptie1(LISTA_ANIMALE_GOALA);
        return true;
    }

    public static void Afiseaza(List<Object> listaAnimale) {
        if (utile(listaAnimale)) {
            for (Object animal : listaAnimale) {
                animal.info();
            }
        } else {
            throw new Exceptie1(LISTA_ANIMALE_GOALA1);
        }
    }

    public static void Gaseste_Animal(List<Object> listaAnimale, String nume) {
        if (utile(listaAnimale)) {
            for (Object animal : listaAnimale) {
                if (animal.get_nume() == nume)
                    return NUME_GASIT;
            }
        } else {
            throw new Exceptie1(LISTA_ANIMALE_GOALA1);
        }
        throw new Exceptie1(NUMELE_NU_A_FOST_GASIT);
    }

}
