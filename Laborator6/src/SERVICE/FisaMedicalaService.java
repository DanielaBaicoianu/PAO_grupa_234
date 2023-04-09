package SERVICE;

import Utile.Utile;
import exceptii.Exceptie1;
import model1.Animal;
import model1.FisaMedicala;
import model1.Vaccin;
import exceptii.Exceptie2;
import exceptii.VaccinIntarziatexceptie;

import java.time.LocalDate;
import java.util.*;

import static Constants.Constante.listavaccinurigoala;

public class FisaMedicalaService {

    private FisaMedicala fisa;

    public FisaMedicalaService(FisaMedicala fisa){
        fisa = fisa;
    }

    protected void adaugareVaccin(Vaccin v){
        try{
            boolean listaVaccinuriGoala = Serviciu1.utile(Collections.singletonList(fisa.getVaccinuri()));
        }
        catch(Exceptie1 ex){
            System.out.println(ex.getMessage());
            fisa.setVaccinuri(new ArrayList<>());
        }
        fisa.addVaccin(v);
    }

    public boolean verificareVaccin(Animal animal){
        try{
            if(animal.getFisaMedicala() == null)
                throw new Exceptie2(listavaccinurigoala);}
        catch(Exceptie2 e){
            System.out.println(e.getMessage());
            return false;
        }
        List<Vaccin> v = animal.getFisaMedicala().getVaccinuri();
        Vaccin va = v.get(v.size());
        Calendar calendar = Calendar.getInstance(Locale.FRANCE);
        calendar.set(Calendar.YEAR, LocalDate.now().getYear());
        Calendar calendar1 = Calendar.getInstance(Locale.FRANCE);
        calendar1.set(Calendar.YEAR, va.getData().getYear());
        try{
            if(calendar1.get(Calendar.YEAR) < calendar.get(Calendar.YEAR))
                throw new VaccinIntarziatexceptie("Vaccin intarziat");
        }catch (VaccinIntarziatexceptie e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

}
