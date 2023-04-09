package model1;

public class Caine implements Animal{
    private String nume;

    private String rasa;

	private	FisaMedicala fisaMedicala;

    public String vorbeste(){
        return "Cainele " + this.nume + " latra";

    }

    public Caine(String NUME, String rasa) {
		this.nume = nume;
		this.rasa = rasa;
		this.fisaMedicala = new FisaMedicala();

	}

    public String getNUME() {
		return nume;
	}

    public void setNUME(String nume) {
		nume = nume;
	}

    public String getRasa() {
		return rasa;
	}
	public void setRasa(String rasa) {
		this.rasa = rasa;
	}

	@Override

	public FisaMedicala getFisaMedicala() {
		return fisaMedicala;
	}

	@Override

	public String toString() {
		return "Caine [nume=" + nume + ", rasa=" + rasa + ", fisaMedicala=" + fisaMedicala + "]";
	}

	@Override

	public String vorbeste() {
		return "Cainele " + this.nume + " face ham";
	}

}
