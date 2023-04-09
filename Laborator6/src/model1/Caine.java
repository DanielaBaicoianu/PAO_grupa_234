package model1;

public class Caine implements Animal{
    private String Nume;

    private String rasa;

    private FisaMedicala fisa;

    @Override
    public FisaMedicala getFisaMedicala() {
        return fisa;
    }

    public String vorbeste(){
        return "Cainele " + this.Nume + " latra";

    }

    public void setFisa(FisaMedicala fisa) {
        this.fisa = fisa;
    }

    public Caine(String nume, String rasa) {
        Nume = nume;
        this.rasa = rasa;
    }

    public String getNume() {
        return Nume;
    }

    public void setNume(String nume) {
        this.Nume = nume;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }
}
