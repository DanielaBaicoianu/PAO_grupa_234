package model1;

public class Pisica implements Animal {

    private String nume;
    private int Varsta;
    private FisaMedicala fisaMedicala;


    public Pisica(String nume, int varsta, FisaMedicala fisaMedicala) {
        this.nume = nume;
        Varsta = varsta;
        this.fisaMedicala = fisaMedicala;
    }

    public Pisica(){

    }

    private void setNume(String n){
        this.nume = nume;
    }

    @Override
    public FisaMedicala getFisaMedicala() {
        return fisaMedicala;
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

    public void setFisaMedicala(FisaMedicala fisaMedicala) {
        this.fisaMedicala = fisaMedicala;
    }

    public String vorbeste(){
        return "Pisica " + this.nume + " miauna";
    }

    @Override
    public String toString() {
        return "Pisica{" +
                "nume='" + nume + '\'' +
                ", Varsta=" + Varsta +
                ", fisaMedicala=" + fisaMedicala +
                '}';
    }
}
