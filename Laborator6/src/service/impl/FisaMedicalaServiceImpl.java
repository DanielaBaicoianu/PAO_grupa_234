package service.impl;

import exceptions.ListaVaccinuriGoalaExceptie;
import exceptions.VaccinIntarziatExceptie;
import model.Animal;
import model.FisaMedicala;
import model.Vaccin;
import service.FisaMedicalaService;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import static constants.Constants.LISTA_VACCINURI_GOALA;
import static constants.Constants.VACCIN_INTARZIAT;

public class FisaMedicalaServiceImpl implements FisaMedicalaService {

    private FisaMedicala fisaMedicala;
    public FisaMedicalaServiceImpl(FisaMedicala fisa){
        this.fisaMedicala = fisa;
    }


    public void adaugareVaccin(Vaccin vaccin){
        boolean listaVaccinuriGoala = this.util(Collections.singletonList(fisaMedicala.getVaccinuri()));

        try{
            if(!listaVaccinuriGoala)
                fisaMedicala.addVaccin(vaccin);
            else throw new ListaVaccinuriGoalaExceptie(LISTA_VACCINURI_GOALA);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public boolean verificareVaccin(Animal animal){

        try{
            if(animal.getFisaMedicala() == null)
                throw new ListaVaccinuriGoalaExceptie(LISTA_VACCINURI_GOALA);

            Calendar calendar = Calendar.getInstance(Locale.FRANCE);
            calendar.set(Calendar.YEAR, LocalDate.now().getYear());
            Calendar calendar1 = Calendar.getInstance(Locale.FRANCE);

            List<Vaccin> vaccinuri = animal.getFisaMedicala().getVaccinuri();
            for(Vaccin v: vaccinuri)
            {
                calendar1.set(Calendar.YEAR, v.getData().getYear());
                if(calendar1.get(Calendar.YEAR) < calendar.get(Calendar.YEAR))
                    throw new VaccinIntarziatExceptie(VACCIN_INTARZIAT);
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return true;
    }

    public Boolean util(List<Object> listaVaccinuri){
        if(listaVaccinuri.isEmpty())
            throw new VaccinIntarziatExceptie(VACCIN_INTARZIAT);
        return true;
    }
}
