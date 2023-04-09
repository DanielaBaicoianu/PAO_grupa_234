package model1;

public class Pisica implements Animal {

    public String nume;
    private int varsta;

    private FisaMedicala fisaMedicala;


    public Pisica() {
    }

    public Pisica(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
        this.fisaMedicala = new FisaMedicala();
    }

    public void setNume(String n) {
        this.nume = nume;
    }

    public String getNume() {
        return this.nume;
    }

    public int getVarsta() {
        return this.varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Pisica{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }

    public String vorbeste() {
        return "Pisica " + this.nume + " miauna";
    }

    public void setFisaMedicala(FisaMedicala fisaMedicala) {
        this.fisaMedicala = fisaMedicala;
    }

    @Override
    public FisaMedicala getFisaMedicala() {
        return this.fisaMedicala;
    }

}
