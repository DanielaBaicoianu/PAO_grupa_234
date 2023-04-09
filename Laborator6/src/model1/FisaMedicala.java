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

    public String GETNumemedic() {
        return numemedic;
    }

    public void setNumemedic(String numemedic) {
        this.numemedic = numemedic;
    }

    public void addVaccin(Vaccin vaccin){
        if (vaccin == null){
			throw new IllegalArgumentException("Vaccinul nu poate fi null");
		}

        this.vaccinuri.add(vaccin);
    }

   @Override

   public String toString() {
		return " FisaMedicala [vaccinuri=" + vaccinuri + ", nume medic=" + numemedic + "]";
	}


}
