package service;

import model.Animal;
import model.Vaccin;

public interface FisaMedicalaService {

    void adaugareVaccin(Vaccin v);

    boolean verificareVaccin(Animal pisica);

}
