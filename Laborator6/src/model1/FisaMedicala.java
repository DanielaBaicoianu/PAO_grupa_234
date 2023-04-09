package model1;

import java.util.List;

public class FisaMedicala {
    private List<Vaccin> vaccinuri;
    private String numemedic;


    public List<Vaccin> getVaccinuri() {
        return vaccinuri;
    }

    public void setVaccinuri(List<Vaccin> vaccinuri) {
        this.vaccinuri = vaccinuri;
    }

    public String getNumeMedic() {
        return numemedic;
    }

    public void setNumeMedic(String numemedic) {
        this.numemedic = numemedic;
    }

    public void addVaccin(Vaccin vaccin){
        if (vaccinuri == null | vaccinuri.isEmpty()) {
            this.vaccinuri = new ArrayList<>();
        }
        this.vaccinuri.add(vaccin);
    }

    @Override
    public String toString() {
        return "FisaMedicala{" +
                "\nvaccinuri:" + vaccinuri +
                "\nnumeMedic:'" + numeMedic  +
                '}';
    }


}
