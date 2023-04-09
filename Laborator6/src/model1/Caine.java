package model1;

public class Caine implements Animal{
    private String nume;

    private String rasa;
    private FisaMedicala fisaMedicala;


    public FisaMedicala getFisaMedicala() {
        return fisaMedicala;
    }

    public String vorbeste(){
        return "Cainele " + this.nume + " latra";
    }

}
