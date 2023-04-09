package Models;

public class Pisica {

    private String nume;
    private int varsta;
    private FisaMedicala fisaMedicala;


    public Pisica(String nume, int varsta) {
		this.nume = nume;
		this.varsta = varsta;
		this.fisaMedicala = new FisaMedicala();
	}

    public String getNume() {
        return nume;
        }

    private void setNume(String n){
        this.nume = nume;
        
    }

    public int getVarsta() {
		return varsta;
	}

    public void setVarsta(int varsta) {
        this.varsta = varsta;
        }



    public String vorbeste(){
        return "Pisica " + this.nume + " miauna";
    }

    @Override

    public String toString() {

    return "Pisica [nume=" + nume + ", varsta=" + varsta + ", fisaMedicala=" + fisaMedicala + "]";

    @Override

    public FisaMedicala getFisaMedicala() {
		return fisaMedicala;
	}

}
