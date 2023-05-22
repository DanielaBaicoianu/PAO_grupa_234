package Service;

import Model.Animal;
import Model.FisaMedicala;
import Model.Vaccin;
import Exceptions.Exceptie2;
import Exceptions.VaccinIntarziatexceptie;

import java.time.LocalDate;
import java.util.*;

import static Constants.constante.listavaccinurigoala;

public class FisaMedicalaService {

    private FisaMedicala fisa;

    public FisaMedicalaService(FisaMedicala fisa) {
        this.fisa = fisa;
    }

    protected void adaugareVaccin(Vaccin v) {
        boolean listaVaccinuriGoala = Serviciu1.utile(Collections.singletonList(fisa.getVaccinuri()));

        try {
            fisa.addVaccin(v);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public boolean verificareVaccin(Animal pisica) {
        if (pisica.getFisaMedicala() == null)
            throw new Exceptie2(listavaccinurigoala);
        List<Vaccin> v = pisica.getFisaMedicala().getVaccinuri();
        Vaccin va = v.get(v.size() - 1);
        Calendar calendar = Calendar.getInstance(Locale.FRANCE);
        calendar.set(Calendar.YEAR, LocalDate.now().getYear());
        Calendar calendar1 = Calendar.getInstance(Locale.FRANCE);
        calendar1.set(Calendar.YEAR, va.data.getYear());
        if (calendar1.get(Calendar.YEAR) < calendar.get(Calendar.YEAR))
            throw new VaccinIntarziatexceptie("Vaccin intarziat");
        try {
            return false;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

}
