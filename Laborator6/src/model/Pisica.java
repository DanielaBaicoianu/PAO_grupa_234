package model;

import constant.Constante;
import exception.InvalidAgeException;
import validation.AnimalValidation;

public class Pisica implements Animal {

    public String nume;
    private int varsta;
    private FisaMedicala fisaMedicala;

    public Pisica(String nume, int varsta) {
        this.nume = nume;
        this.fisaMedicala = new FisaMedicala();
        try {
            if (!AnimalValidation.validateAge(varsta)) {
                throw new InvalidAgeException(Constante.VARSTA_INVALIDA);
            }
            this.varsta = varsta;
        } catch (InvalidAgeException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        try {
            if (!AnimalValidation.validateAge(varsta)) {
                throw new InvalidAgeException(Constante.VARSTA_INVALIDA);
            }
            this.varsta = varsta;
        } catch (InvalidAgeException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public void setFisaMedicala(FisaMedicala fisaMedicala) {
        this.fisaMedicala = fisaMedicala;
    }

    @Override
    public String toString() {
        return "Pisica{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", fisaMedicala=" + fisaMedicala +
                '}';
    }

    private void setNume(String nume){

        this.nume = nume;
    }

    @Override
    public FisaMedicala getFisaMedicala() {
        return fisaMedicala;
    }

    public String vorbeste(){
        return "Pisica " + this.nume + " miauna";
    }

}
