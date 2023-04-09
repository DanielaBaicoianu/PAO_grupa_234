import Models.*;
import Services.AnimalService;
import Services.FisaMedicalaService;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
        Date data = new Date(2019, 10, 10);
        Vaccin va = new Vaccin("Rabie", data);
        FisaMedicala fisa = new FisaMedicala("Popescu Mihai");
        FisaMedicalaService fisaMedicalaService = new FisaMedicalaService(fisa);
        fisaMedicalaService.adaugareVaccin(va);
        Animal pisica = new Pisica("Tom", 2, fisa);
        System.out.println(pisica.vorbeste());

        AnimalService animalService = new AnimalService();
        animalService.addAnimal(pisica);
    }
}