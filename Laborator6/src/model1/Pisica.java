package SERVICE;

public class Pisica {
    private String nume;
    private int varsta;
    private FisaMedicala fisaMedicala;

    public Pisica(String nume, int varsta, FisaMedicala fisaMedicala) {
        this.nume = nume;
        this.varsta = varsta;
        this.fisaMedicala = fisaMedicala;
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

    public FisaMedicala getFisaMedicala() {
        return fisaMedicala;
    }

    public void setFisaMedicala(FisaMedicala fisaMedicala) {
        this.fisaMedicala = fisaMedicala;
    }

    @Override
    public String toString() {
        return "Pisica{" +
                "\nnume: " + nume +
                "\nvarsta: " + rasa +
                "\nfisaMedicala: " + fisaMedicala +
                '}';
    }

    public String vorbeste(){
        return "Pisica " + this.nume + " miauna";
    }

}
