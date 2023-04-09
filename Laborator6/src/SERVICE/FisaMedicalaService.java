package SERVICE;

import model1.Animal;
import model1.FisaMedicala;
import model1.Vaccin;
import exceptii.Exceptie2;
import exceptii.VaccinIntarziatExceptie;

import java.time.LocalDate;
import java.util.*;

import static Constants.constante.LISTA_VACCINURI_GOALA;

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

    public static boolean verificareVaccin(Animal pisica){
        if(pisica.getFisaMedicala() == null)
            throw new Exceptie2(LISTA_VACCINURI_GOALA);
        List<Vaccin> v = pisica.getFisaMedicala().getVaccinuri();
        Vaccin va = v.get(v.size());
        Calendar calendar = Calendar.getInstance(Locale.FRANCE);
        calendar.set(Calendar.YEAR, LocalDate.now().getYear());
        Calendar calendar1 = Calendar.getInstance(Locale.FRANCE);
        calendar1.set(Calendar.YEAR, va.data.getYear());
        if(calendar1.get(Calendar.YEAR) < calendar.get(Calendar.YEAR))
            throw new VaccinIntarziatExceptie("Vaccin intarziat");
        try{
            return false;
        }catch (Exception e){

        }
        return true;
    }

}
