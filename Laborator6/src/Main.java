import model.Caine;
import model.FisaMedicala;
import model.Pisica;
import model.Vaccin;
import service.impl.AnimalServiceImpl;
import service.impl.FisaMedicalaServiceImpl;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Vaccin v1 = new Vaccin("nume_vaccin1", new Date());
        Vaccin v2 = new Vaccin("nume_vaccin2", new Date());
        ArrayList<Vaccin> vaccinuri1 = new ArrayList<>();
        vaccinuri1.add(v1);
        vaccinuri1.add(v2);

        FisaMedicala fisa1 = new FisaMedicala(vaccinuri1, "doctor1");
        Caine caine1 = new Caine("nume_caine1", "rasa1", fisa1);
        Pisica pisica1 = new Pisica("nume_pisica1", 15, fisa1);

        AnimalServiceImpl animal_service = new AnimalServiceImpl();
        animal_service.addAnimal(caine1);
        animal_service.addAnimal(pisica1);

        FisaMedicalaServiceImpl fisa_service = new FisaMedicalaServiceImpl(pisica1.getFisaMedicala());
        fisa_service.adaugareVaccin(new Vaccin("abc", new Date()));

        System.out.println(caine1.vorbeste());
        System.out.println(pisica1.vorbeste());

        fisa_service.verificareVaccin(caine1);
    }
}