package model1;

import java.util.List;

public class FisaMedicala {

    private List<Vaccin> vaccinuri;
    private String numemedic;

    public FisaMedicala(List<Vaccin> vaccinuri, String numemedic) {
        this.vaccinuri = vaccinuri;
        this.numemedic = numemedic;
    }

    public List<Vaccin> getVaccinuri() {
        return vaccinuri;
    }

    public void setVaccinuri(List<Vaccin> vaccinuri) {
        this.vaccinuri = vaccinuri;
    }

    public String GETNumemedic() {
        return numemedic;
    }

    public void setNumemedic(String numemedic) {
        this.numemedic = numemedic;
    }

    public void addVaccin(Vaccin vaccin){
        this.vaccinuri.add(vaccin);
    }

    @Override
    public String toString() {
        return "FisaMedicala{" +
                "vaccinuri=" + vaccinuri +
                ", numemedic='" + numemedic + '\'' +
                '}';
    }
}
