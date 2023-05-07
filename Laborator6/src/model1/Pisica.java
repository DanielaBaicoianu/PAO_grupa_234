package model1;

import model1.FisaMedicala;

public class Pisica implements Animal{
    private String nume;
    private int varsta;
    private FisaMedicala fisaMedicala;


    public Pisica(String nume){
        this.nume = nume;
    }

    public Pisica(int v){
        this.varsta = v;
    }


    public Pisica(){
    }
    public void setNume(String n){
        this.nume = nume;
        this.varsta = 1;
    }
    public FisaMedicala getFisaMedicala() {
        return fisaMedicala;
    }
    public String vorbeste(){
        return "Pisica " + this.nume + " miauna";
    }

}
