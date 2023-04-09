package Models;

import Constants.Constants;
import Exceptions.ExceptieListaVaccinuriGoala;

public class Animal {
    private FisaMedicala fisaMedicala;

    public Animal(FisaMedicala fisaMedicala) {
        this.fisaMedicala = fisaMedicala;
        try {
            verificaFisa();
        } catch (ExceptieListaVaccinuriGoala exceptie1) {
            System.out.println(exceptie1.getMessage());
        }
    }

    public String vorbeste(){
        return "Animalul vorbeste";
    };

    public FisaMedicala getFisaMedicala() {
        return fisaMedicala;
    }

    public void setFisaMedicala(FisaMedicala fisaMedicala) {
        this.fisaMedicala = fisaMedicala;
    }

    protected void verificaFisa(){
        if(this.fisaMedicala.getVaccinuri().size() == 0){
            throw new ExceptieListaVaccinuriGoala(Constants.LISTA_VACCINURI_GOALA);
        }
    }
}
