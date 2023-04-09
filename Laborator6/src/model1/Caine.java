package model1;

public class Caine extends Animal{
    private String nume;
    private String rasa;
    private FisaMedicala fisaMedicala;

    public Caine(String nume, String rasa, FisaMedicala fisaMedicala) {
        this.nume = nume;
        this.rasa = rasa;
        this.fisaMedicala = fisaMedicala;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public FisaMedicala getFisaMedicala() {
        return fisaMedicala;
    }

    public void setFisaMedicala(FisaMedicala fisaMedicala) {
        this.fisaMedicala = fisaMedicala;
    }

    @Override
    public String toString() {
        return "Caine{" +
                "\nnume: " + nume +
                "\nrasa: " + rasa +
                "\nfisaMedicala: " + fisaMedicala +
                '}';
    }

    public String vorbeste(){
        return "Cainele " + this.NUME + " latra";
    }

}
