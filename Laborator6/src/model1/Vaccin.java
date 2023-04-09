package model1;

import java.util.Date;

public class Vaccin {

    private String denumireVaccin;
    public Date data;

    public Vaccin() {
    }

    public Vaccin(String denumireVaccin, Date data) {
        this.denumireVaccin = denumireVaccin;
        this.data = data;
    }

    public String getdenumireVaccin() {
        return denumireVaccin;
    }

    public void setdenumireVaccin(String denumireVaccin) {
        this.denumireVaccin = denumireVaccin;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Vaccin{" +
                "denumireVaccin='" + denumireVaccin + '\'' +
                ", data=" + data +
                '}';
    }
}
