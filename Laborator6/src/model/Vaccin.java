package model;

import java.util.Date;

public class Vaccin {

    private String numeVaccin;
    private Date data;

    public Vaccin(String numeVaccin, Date data) {
        this.numeVaccin = numeVaccin;
        this.data = data;
    }

    public String getNumeVaccin() {
        return numeVaccin;
    }

    public void setNumeVaccin(String numeVaccin) {
        this.numeVaccin = numeVaccin;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
