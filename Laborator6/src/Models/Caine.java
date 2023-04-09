package Models;
import Utile.Utile;

public class Caine extends Animal{
    private String nume;
    private String rasa;
    public Caine(String nume, String rasa, FisaMedicala fisaMedicala) {
        super(fisaMedicala);
        this.nume = nume;
        this.rasa = rasa;
    }

    public String vorbeste(){
        return "Cainele " + this.nume + Utile.caineleVorbeste();

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

}
