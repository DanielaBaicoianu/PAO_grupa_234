package model1;

import java.util.Date;

public class Vaccin {

    private String denumire_vaccin;
    private Date data;

    public Vaccin(String denumire_vaccin, Date data) {
		this.denumire_vaccin = denumire_vaccin;
		this.data = data;
	}

	public String getdenumire_vaccin() {
		return denumire_vaccin;
	}
	public void setdenumire_vaccin(String denumire_vaccin) {
		this.denumire_vaccin = denumire_vaccin;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Vaccin{" + "denumire vaccin=" + denumire_vaccin + ", data=" + data + '}';
	}




}
