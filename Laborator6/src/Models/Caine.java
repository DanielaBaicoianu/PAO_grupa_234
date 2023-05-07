package Models;

import Constants.Constante;
import Exceptions.ListaVaccinuriGoalaExceptie;

public class Caine implements Animal{
    private String nume;
    private FisaMedicala fisaMedicala;
    private String rasa;

    public Caine(String nume, String rasa) {
        this.nume = nume;
        this.rasa = rasa;
        this.fisaMedicala = new FisaMedicala();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public FisaMedicala getFisaMedicala() {
        return fisaMedicala;
    }

    public void setFisaMedicala(FisaMedicala fisaMedicala) {
        if(fisaMedicala == null)
            throw new ListaVaccinuriGoalaExceptie(Constante.LISTA_VACCINURI_GOALA);
        this.fisaMedicala = fisaMedicala;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String vorbeste(){
        return Utile.Utile.caineVorbeste(this.nume);
    }

    @Override
    public String toString() {
        return "Caine{" +
                "nume='" + nume + '\'' +
                ", fisaMedicala=" + fisaMedicala +
                ", rasa='" + rasa + '\'' +
                '}';
    }
}
