import model.Animal;
import model.Caine;
import model.Pisica;
import model.Vaccin;
import service.AnimalService;
import service.FisaMedicalaService;
import service.impl.AnimalServiceImpl;
import service.impl.FisaMedicalaServiceImpl;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Animal myFirstDog = new Caine("Grivei", "Labrador");
        Animal myCat = new Pisica("Felix", 5);
        Animal mySecondDog = new Caine("Spike", "Ogar");

        AnimalService animalService = new AnimalServiceImpl();
        animalService.addAnimal(myFirstDog);
        animalService.addAnimal(myCat);
        animalService.addAnimal(mySecondDog);
        myCat.getFisaMedicala().setNumeMedic("Popescu Marian");
        myFirstDog.getFisaMedicala().setNumeMedic("Mihalcea Andrei");
        mySecondDog.getFisaMedicala().setNumeMedic("Antonescu Ioana");
        FisaMedicalaService myCatFisaMedicalaService = new FisaMedicalaServiceImpl(myCat.getFisaMedicala());
        Vaccin catVaccine = new Vaccin("Vaccin tetravalent", new Date());
        Vaccin dogVaccine = new Vaccin("Vaccin antirabic", new Date());
        myCatFisaMedicalaService.addVaccin(catVaccine);
        FisaMedicalaService myDogFisaService = new FisaMedicalaServiceImpl(myFirstDog.getFisaMedicala());
        myDogFisaService.addVaccin(dogVaccine);
        FisaMedicalaService myDogFisaService2 = new FisaMedicalaServiceImpl(mySecondDog.getFisaMedicala());
        myDogFisaService2.addVaccin(dogVaccine);

        System.out.println(myCat.getFisaMedicala());
        System.out.println();

        List<Animal> animalList= animalService.getAnimals();
        for(Animal animal: animalList) {
            System.out.println(animal);
            System.out.println(animal.vorbeste());
        }


    }
}