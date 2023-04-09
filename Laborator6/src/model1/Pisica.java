package model1;

import Utile.Utile;

public class Pisica implements Animal{

    public String nume;
    private int Varsta;
    private FisaMedicala fisaMedicala;

    public Pisica(String nume, int varsta, FisaMedicala fisaMedicala) {
        this.nume = nume;
        Varsta = varsta;
        this.fisaMedicala = fisaMedicala;
    }

    public Pisica(String nume){
        this.nume = nume;
    }

    public Pisica(int v){
        this.Varsta = v;
    }

    public Pisica(){

    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return Varsta;
    }

    public void setVarsta(int varsta) {
        Varsta = varsta;
    }

    private void setNume(String n){
        this.nume = nume;
        this.Varsta = 1;
    }

    @Override
    public String vorbeste(){
        return "Pisica " + this.nume + " " + Utile.pisicaVorbeste();
    }

    @Override
    public FisaMedicala getFisaMedicala() {
        return fisaMedicala;
    }
}
