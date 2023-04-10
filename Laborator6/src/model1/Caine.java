package model1;

public class Caine implements Animal {
    private String nume;

    private String rasa;

    public Caine(String nume, String rasa) {
        this.nume = nume;
        this.rasa = rasa;
    }

    @Override
    public FisaMedicala getFisaMedicala() {
        FisaMedicala fisaMedicala = new FisaMedicala();
        return fisaMedicala;
    }

    public String vorbeste(){
        return "Cainele " + this.nume + " latra";

    }

}
