package SERVICE;

public class Pisica {

    public String nume;
    private int Varsta;

    public Pisica(String nume, int varsta) {
        this.nume = nume;
        Varsta = varsta;
    }
    
    public String vorbeste(){
        return "Pisica " + this.nume + " miauna";
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return Varsta;
    }

    public void setVarsta(int varsta) {
        Varsta = varsta;
    }
}
