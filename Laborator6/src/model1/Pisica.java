package model1;

public class Pisica implements Animal {

    private String nume;
    private int Varsta;

    private FisaMedicala fisaMedicala;

    public Pisica(String nume, int Varsta) {
        this.nume = nume;
        this.Varsta = Varsta;
        this.fisaMedicala = new FisaMedicala();
    }

    public Pisica(){

    }

    private void setNume(String n){
        this.nume = nume;
        this.Varsta = 1;
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

    public FisaMedicala getFisaMedicala() {
        return fisaMedicala;
    }

}
