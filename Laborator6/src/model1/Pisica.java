package model1;

public class Pisica implements Animal {
    private String nume;
    private int varsta;
    private FisaMedicala fisaMedicala;

    public Pisica(String nume, int varsta, FisaMedicala fisaMedicala) {
        this.nume = nume;
        this.varsta = varsta;
        this.fisaMedicala = fisaMedicala;
    }

    public Pisica(String nume){
        this.nume = nume;
    }

    public Pisica(int v){
        this.varsta = v;
    }

    public Pisica(){

    }

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

    public void setFisaMedicala(FisaMedicala fisaMedicala) {
        this.fisaMedicala = fisaMedicala;
    }

    @Override
    public String vorbeste(){
        return "Pisica " + this.nume + " miauna";
    }

    @Override
    public FisaMedicala getFisaMedicala() {
        return fisaMedicala;
    }
}
