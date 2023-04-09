import Models.*;
import Services.*;
import Constants.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Caine myDog = new Caine("Rex", "Labrador");

        Pisica myCat = new Pisica("Mittens", 2);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(myDog);
        animalList.add(myCat);

        FisaMedicala dogMedicalRecord = myDog.getFisaMedicala();
        List<Vaccin> dogVaccines = new ArrayList<>();
        dogVaccines.add(new Vaccin("Vaccin 1", new Date()));
        dogVaccines.add(new Vaccin("Vaccin 2", new Date()));
        dogMedicalRecord.setVaccinuri(dogVaccines);

        FisaMedicala catMedicalRecord = myCat.getFisaMedicala();
        catMedicalRecord.addVaccin(new Vaccin("Vaccin 3", new Date()));

       
        for (Animal animal : animalList) {
            System.out.println(animal.toString());
            System.out.println("Medical record: " + animal.getFisaMedicala().toString());
            System.out.println(animal.vorbeste());
        }

        try {
            throw new Exceptie2("This is an exception!");
        } catch (Exceptie2 e) {
            System.out.println(e.getMessage());
        }

        System.out.println(constante.listavaccinurigoala);
    }
}