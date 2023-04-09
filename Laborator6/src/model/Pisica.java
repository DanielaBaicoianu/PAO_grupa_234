package model;

public class Pisica implements Animal{

    private String nume;
    private int varsta;
    private FisaMedicala fisaMedicala;

    public Pisica(String nume, int varsta, FisaMedicala fisa) {
        this.nume = nume;
        this.varsta = varsta;
        this.fisaMedicala = fisa;
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

    @Override
    public FisaMedicala getFisaMedicala() {
        return this.fisaMedicala;
    }

    @Override
    public void setFisaMedicala(FisaMedicala fisaMedicala) {
        this.fisaMedicala = fisaMedicala;
    }

    @Override
    public String vorbeste(){
        return "Pisica " + this.nume + " miauna";
    }

}
