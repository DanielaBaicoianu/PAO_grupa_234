package Models;

import java.util.ArrayList;
import java.util.List;

public class FisaMedicala {

    private List<Vaccin> vaccinuri = new ArrayList<>();
    private String numeMedic;

    public FisaMedicala(String numeMedic){
        this.numeMedic = numeMedic;
    }

    public FisaMedicala(List<Vaccin> vaccinuri, String numeMedic) {
        this.vaccinuri = vaccinuri;
        this.numeMedic = numeMedic;
    }

    public List<Vaccin> getVaccinuri() {
        return vaccinuri;
    }

    public void setVaccinuri(List<Vaccin> vaccinuri) {
        this.vaccinuri = vaccinuri;
    }

    public String getNumeMedic() {
        return numeMedic;
    }

    public void setNumeMedic(String numeMedic) {
        this.numeMedic = numeMedic;
    }

    public void addVaccin(Vaccin vaccin){
        this.vaccinuri.add(vaccin);
    }
}
