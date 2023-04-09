package Services;

import Models.Animal;
import Models.FisaMedicala;
import Models.Vaccin;
import Models.exceptii.Exceptie2;
import Models.exceptii.VaccinIntarziatexceptie;

import java.time.LocalDate;
import java.util.*;

import static Constants.Constante.listavaccinurigoala;

public class FisaMedicalaService {

    private FisaMedicala fisa;

    public FisaMedicalaService(FisaMedicala fisa){
        this.fisa = fisa;
    }

    protected void adaugareVaccin(Vaccin v){
        boolean listaVaccinuriGoala = Serviciu1.utile(Collections.singletonList(fisa.getVaccinuri()));

        try{
            fisa.addVaccin(v);
        }
        catch(Exception ex){

        }
    }


    public boolean verificareVaccin(Animal pisica){
        if(pisica.getFisaMedicala() == null)
            throw new Exceptie2(listavaccinurigoala);

        List<Vaccin> v = pisica.getFisaMedicala().getVaccinuri();
        Vaccin va = v.get(v.size());
        Calendar calendar = Calendar.getInstance(Locale.FRANCE);
        calendar.set(Calendar.YEAR, LocalDate.now().getYear());
        Calendar calendar1 = Calendar.getInstance(Locale.FRANCE);
        calendar1.set(Calendar.YEAR, va.data.getYear());
        if(calendar1.get(Calendar.YEAR) < calendar.get(Calendar.YEAR))
            throw new VaccinIntarziatexceptie("Vaccin intarziat");
        try{
            return false;
        }catch (Exception e){

        }
        return true;


    }



}
