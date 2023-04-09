package Models;

import java.util.List;
import java.util.ArrayList;

public class FisaMedicala {

    private List<Vaccin> vaccinuri;
    private String numeMedic;

    public FisaMedicala(String numeMedic) {
        this.vaccinuri = new ArrayList<Vaccin>();
        this.numeMedic = numeMedic;
    }

    public FisaMedicala() {
        this.vaccinuri = new ArrayList<Vaccin>();
        this.numeMedic = "Necunoscut";
    }

    public List<Vaccin> getVaccinuri() {
        return vaccinuri;
    }

    public void setVaccinuri(List<Vaccin> vaccinuri) {
        this.vaccinuri = vaccinuri;
    }

    public String GetNumeMedic() {
        return numeMedic;
    }

    public void setNumeMedic(String numeMedic) {
        this.numeMedic = numeMedic;
    }

    public void addVaccin(Vaccin vaccin){
        this.vaccinuri.add(vaccin);
    }

    @Override
    public String toString() {
        return "FisaMedicala{" +
                "vaccinuri=" + vaccinuri +
                ", numeMedic='" + numeMedic + '\'' +
                '}';
    }
}
