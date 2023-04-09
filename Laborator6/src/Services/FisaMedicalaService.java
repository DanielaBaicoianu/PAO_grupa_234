package Services;

import Models.FisaMedicala;
import Models.Vaccin;
import Exceptions.ExceptieVaccinIntarziat;

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

    protected void verificareVaccin(Vaccin va) throws ExceptieVaccinIntarziat{
        Calendar calendar = Calendar.getInstance(Locale.FRANCE);
        calendar.set(Calendar.YEAR, LocalDate.now().getYear());
        Calendar calendar1 = Calendar.getInstance(Locale.FRANCE);
        calendar1.set(Calendar.YEAR, va.getData().getYear());
        if(calendar1.get(Calendar.YEAR) < calendar.get(Calendar.YEAR))
            throw new ExceptieVaccinIntarziat("Vaccin intarziat");
    }

    public FisaMedicala getFisa() {
        return fisa;
    }

    public void setFisa(FisaMedicala fisa) {
        this.fisa = fisa;
    }
}
