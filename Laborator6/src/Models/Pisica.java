package Models;

import Constants.Constante;
import Exceptions.ListaVaccinuriGoalaExceptie;

public class Pisica implements Animal{

    private String nume;
    private int varsta;

    private FisaMedicala fisaMedicala;

    public Pisica(String nume){
        this.nume = nume;
    }

    public Pisica(int varsta){
        this.varsta = varsta;
    }

    public Pisica(){

    }

    public Pisica(String nume, int varsta){
        this.nume = nume;
        this.varsta = varsta;
    }

    private void setNume(String nume){
        this.nume = nume;
    }

    @Override
    public FisaMedicala getFisaMedicala() {
        return this.fisaMedicala;
    }

    public String vorbeste(){
        return Utile.Utile.pisicaVorbeste(this.nume);
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setFisaMedicala(FisaMedicala fisaMedicala) {
        if(fisaMedicala == null)
            throw new ListaVaccinuriGoalaExceptie(Constante.LISTA_VACCINURI_GOALA);
        this.fisaMedicala = fisaMedicala;
    }

    @Override
    public String toString() {
        return "Pisica{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
