package model1;

import java.util.Date;

public class Vaccin {
    private String denumireVaccin;
    private Date data;
    public Vaccin(String DENUMIRE_VACCIN, Date data) {
        this.denumireVaccin = DENUMIRE_VACCIN;
        this.data = data;
    }

    public String getDenumireVaccin() {
        return denumireVaccin;
    }

    public void setDenumireVaccin(String denumireVaccin) {
        this.denumireVaccin = denumireVaccin;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }





}
