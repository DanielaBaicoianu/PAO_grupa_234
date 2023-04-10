package SERVICE;

import SERVICE.Animal;
import SERVICE.FisaMedicala;
import SERVICE.Vaccin;
import SERVICE.exceptii.Exceptie2;
import SERVICE.exceptii.VaccinIntarziatexceptie;

import java.time.LocalDate;
import java.util.*;

import static Constants.constante.listavaccinurigoala;

public class FisaMedicalaService {

    private FisaMedicala fisa;

    public FisaMedicalaService(FisaMedicala fisa){
        fisa = fisa;
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
            throw new Exceptie2(LISTA_VACCINURI_GOALA);
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
    public boolean verificareVaccin(Animal caine){
        if(caine.getFisaMedicala() == null)
            throw new Exceptie2(LISTA_VACCINURI_GOALA);
        List<Vaccin> v = caine.getFisaMedicala().getVaccinuri();
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
