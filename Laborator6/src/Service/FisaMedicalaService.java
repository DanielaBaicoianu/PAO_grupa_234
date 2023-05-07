package Service;

import Constants.Constante;
import Models.Animal;
import Models.FisaMedicala;
import Models.Vaccin;
import Exceptions.Exceptie2;
import Exceptions.VaccinIntarziatExceptie;

import java.time.LocalDate;
import java.util.*;

public class FisaMedicalaService {

    private FisaMedicala fisa;

    public FisaMedicalaService(FisaMedicala fisa){
        this.fisa = fisa;
    }

    public void adaugareVaccin(Vaccin v){

        try{
            verificareVaccin(v);
            fisa.addVaccin(v);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public boolean verificareVaccin(Vaccin v){

        Calendar calendar = Calendar.getInstance(Locale.FRANCE);
        calendar.set(Calendar.YEAR, LocalDate.now().getYear());
        Calendar calendar1 = Calendar.getInstance(Locale.FRANCE);
        calendar1.set(Calendar.YEAR, v.getData().getYear());
        if(calendar1.get(Calendar.YEAR) < calendar.get(Calendar.YEAR))
            throw new VaccinIntarziatExceptie("Vaccin intarziat");
        return true;
    }

}
