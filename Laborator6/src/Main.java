import Models.*;
import Service.AnimalService;
import Service.FisaMedicalaService;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Vaccin vaccin = new Vaccin("Vaccin1", new Date(2022, Calendar.DECEMBER,12));
        FisaMedicala fisaMedicala = new FisaMedicala("Dr. Marcoci");
        fisaMedicala.addVaccin(vaccin);
        FisaMedicalaService fisaMedicalaService = new FisaMedicalaService(fisaMedicala);
        fisaMedicalaService.adaugareVaccin(vaccin);
        Pisica p = new Pisica("Pisica1", 2);
        p.setFisaMedicala(fisaMedicala);
        System.out.println(p);
        Caine c = new Caine("Caine1", "Labrador");

        AnimalService animalService = new AnimalService();
        animalService.adaugareAnimal(p);
        animalService.adaugareAnimal(c);


    }
}