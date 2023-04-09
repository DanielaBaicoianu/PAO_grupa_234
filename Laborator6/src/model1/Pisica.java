package model1;

public class Pisica {

    public String nume;
    private int varsta;


    public Pisica(String nume){
        this.nume = nume;
    }

    public Pisica(int v){
        this.varsta = v;
    }

    public Pisica(){

    }

    private void setNume(String nume){
        this.nume = nume;
        this.varsta = 1;
    }

    public String vorbeste(){
        return "Pisica " + this.nume + " miauna";
    }

}
