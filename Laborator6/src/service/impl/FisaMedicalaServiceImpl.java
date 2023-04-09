package service.impl;

import exception.NoVaccinInListException;
import model.Animal;
import model.FisaMedicala;
import model.Vaccin;
import exception.AnimalListEmptyException;
import exception.DelayedVaccineException;
import service.FisaMedicalaService;
import java.time.LocalDate;
import java.util.*;

import static constant.Constante.*;

public class FisaMedicalaServiceImpl implements FisaMedicalaService {

    private final FisaMedicala fisa;

    public FisaMedicalaServiceImpl(FisaMedicala fisa){
        this.fisa = fisa;
    }

    public List<Vaccin> getVaccinuriFromFisa() {
        return fisa.getVaccinuri();
    }

    @Override
    public void addVaccin(Vaccin v){
        fisa.addVaccin(v);
    }

    public boolean checkLatestVaccine() {
        try {
            if (this.getVaccinuriFromFisa() == null) {
                throw new NoVaccinInListException(LISTA_VACCINURI_GOALA);
            }
            List<Vaccin> vaccinList = getVaccinuriFromFisa();
            Vaccin vaccin = vaccinList.get(vaccinList.size() - 1);
            Calendar calendar = Calendar.getInstance(Locale.FRANCE);
            calendar.set(Calendar.YEAR, LocalDate.now().getYear());
            Calendar calendar1 = Calendar.getInstance(Locale.FRANCE);
            calendar1.setTime(vaccin.getData());

            if (calendar1.get(Calendar.YEAR) < calendar.get(Calendar.YEAR)) {
                throw new DelayedVaccineException(VACCIN_INTARZIAT);
            }
        } catch (AnimalListEmptyException | DelayedVaccineException exception) {
            System.out.println(exception.getMessage());
            return false;
        }
        return true;
    }

}
