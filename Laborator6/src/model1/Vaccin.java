package model1;

import java.util.Date;

public class Vaccin {

    private String denumireVaccin;
    private Date data;

    public Vaccin(String denumireVaccin, Date data) {
        this.denumireVaccin = denumireVaccin;
        this.data = data;
    }

    public String getDenumireVaccin() {
        return denumireVaccin;
    }

    public Date getData() {
        return data;
    }
}
