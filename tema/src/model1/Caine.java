package model1;

public class Caine implements Animal {
    private String NUME;

    private String rasa;
    private FisaMedicala fisaMedicala;

    public Caine(String NUME, String rasa,FisaMedicala fisaMedicala) {
        this.NUME = NUME;
        this.rasa = rasa;
        this.fisaMedicala=fisaMedicala;
    }

    public String getNUME() {
        return NUME;
    }

    public void setNUME(String NUME) {
        this.NUME = NUME;
    }

    public String getRasa() {
        return rasa;
    }

    public void setFisaMedicala(FisaMedicala fisaMedicala) {
        this.fisaMedicala = fisaMedicala;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    @Override
    public FisaMedicala getFisaMedicala() {
        return fisaMedicala;
    }

    public String vorbeste(){
        return "Cainele " + this.NUME + " latra";

    }

    @Override
    public String toString() {
        return "Caine{" +
                "NUME='" + NUME + '\'' +
                ", rasa='" + rasa + '\'' +
                ", fisaMedicala=" + fisaMedicala +
                '}';
    }
}
