package model1;

import Utile.Utile;

public class Caine implements Animal{
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

    @Override
    public FisaMedicala getFisaMedicala() {
        return fisaMedicala;
    }

    @Override
    public String vorbeste(){
        return "Cainele " + this.nume + " " + Utile.caineVorbeste();

    }

}
