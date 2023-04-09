package model1;

import java.util.Date;

public class Pisica implements Animal{

    private String nume;
    private int varsta;
    private FisaMedicala fisaMedicala;

    public Pisica(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
        this.fisaMedicala = new FisaMedicala();
    }

    public Pisica(){}

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public FisaMedicala getFisaMedicala() {
        return this.fisaMedicala;
    }

    public String vorbeste(){
        return "Pisica " + this.nume + " miauna";
    }

    @Override
    public String toString() {
        return "Pisica{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}