package model1;

import java.util.Date;

public class Vaccin {

    private String DENUMIRE_VACCIN;
    private Date data;


    public Vaccin(String DENUMIRE_VACCIN, Date data) {
        this.DENUMIRE_VACCIN = DENUMIRE_VACCIN;
        this.data = data;
    }

    public String getDENUMIRE_VACCIN() {
        return DENUMIRE_VACCIN;
    }

    public void setDENUMIRE_VACCIN(String DENUMIRE_VACCIN) {
        this.DENUMIRE_VACCIN = DENUMIRE_VACCIN;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
