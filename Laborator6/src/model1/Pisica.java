package model1;

public class Pisica implements Animal{

    private String nume;
    private int Varsta;


    public Pisica(String nume){
        this.nume = nume;
    }

    public Pisica(int v){
        this.Varsta = v;
    }

    public Pisica(){

    }

    private void setNume(String n){
        this.nume = nume;
        this.Varsta = 1;
    }

    @Override
    public FisaMedicala getFisaMedicala() {
        FisaMedicala fisaMedicala = new FisaMedicala();
        return fisaMedicala;
    }

    public String vorbeste(){
        return "Pisica " + this.nume + " miauna";
    }

}
