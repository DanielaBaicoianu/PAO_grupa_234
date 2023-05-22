package Model;

public class Caine implements Animal {
    private String nume;
    private FisaMedicala fisaMedicala;

    private String rasa;

    public Caine() {
    }

    public Caine(String nume, String rasa) {
        this.nume = nume;
        this.fisaMedicala = new FisaMedicala();
        this.rasa = rasa;
    }

    public String getNUME() {
        return nume;
    }

    public void setNUME(String nume) {
        this.nume = nume;
    }

    public void setFisaMedicala(FisaMedicala fisaMedicala) {
        this.fisaMedicala = fisaMedicala;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String vorbeste() {
        return "Cainele " + this.nume + " latra";
    }

    @Override
    public FisaMedicala getFisaMedicala() {
        return this.fisaMedicala;
    }

    @Override
    public String toString() {
        return "Caine{" +
                "NUME='" + nume + '\'' +
                ", fisaMedicala=" + fisaMedicala +
                ", rasa='" + rasa + '\'' +
                '}';
    }
}
