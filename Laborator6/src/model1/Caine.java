package model1;

public class Caine {
    private String NUME;

    private String rasa;

    public String vorbeste(){
        return "Cainele " + this.NUME + " latra";

    }

    public Caine(String NUME, String rasa) {
		this.NUME = NUME;
		this.rasa = rasa;
	}

    public String getNUME() {
		return NUME;
	}

    public void setNUME(String nUME) {
		NUME = nUME;
	}

    public String getRasa() {
		return rasa;
	}
	public void setRasa(String rasa) {
		this.rasa = rasa;
	}

}
