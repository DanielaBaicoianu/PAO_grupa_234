package SERVICE;

import model1.Animal;
import model1.FisaMedicala;
import model1.Vaccin;
import model1.exceptii.Exceptie2;
import model1.exceptii.VaccinIntarziatexceptie;

import java.time.LocalDate;
import java.util.*;

import static Constants.constante.listavaccinurigoala;

public class FisaMedicalaService {

    private FisaMedicala fisa;


    public FisaMedicala getFisa() {
        return fisa;
    }

    public void FisaMedicalaService(FisaMedicala fisa){
        this.fisa = fisa;
    }

    public void adaugareVaccin(Vaccin v){
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
        Vaccin va = v.get(v.size()-1);
        Calendar calendar = Calendar.getInstance(Locale.FRANCE);
        calendar.set(Calendar.YEAR, LocalDate.now().getYear());
        Calendar calendar1 = Calendar.getInstance(Locale.FRANCE);
        calendar1.set(Calendar.YEAR, va.getData().getYear());
        if(calendar1.get(Calendar.YEAR) < calendar.get(Calendar.YEAR))
            throw new VaccinIntarziatexceptie("Vaccin intarziat");
        try{
            return false;
        }catch (Exception e){

        }
        return true;
    }

}
