package Models;
import Utile.Utile;

public class Pisica extends Animal{

    private String nume;
    private int varsta;
    public Pisica(String nume, int varsta, FisaMedicala fisaMedicala) {
        super(fisaMedicala);
        this.nume = nume;
        this.varsta = varsta;
    }

    public String vorbeste(){
        return "Pisica " + this.nume + Utile.pisicaVorbeste();
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
}
