package model1;

import java.util.List;

public class FisaMedicala {

    private List<Vaccin> vaccinuri;
    private String numeMedic;


    public List<Vaccin> getVaccinuri() {
        return vaccinuri;
    }

    public void setVaccinuri(List<Vaccin> vaccinuri) {
        this.vaccinuri = vaccinuri;
    }

    public String GETNumemedic() {
        return numeMedic;
    }

    public void setNumemedic(String numemedic) {
        this.numeMedic = numemedic;
    }

    public void addVaccin(Vaccin vaccin){
        this.vaccinuri.add(vaccin);
    }
}
