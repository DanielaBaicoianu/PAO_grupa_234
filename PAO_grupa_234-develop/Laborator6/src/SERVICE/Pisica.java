package SERVICE;

public class Pisica implements Animal {

    public String nume;
    private int Varsta;

    public Pisica(String nume, int varsta) {
        this.nume = nume;
        Varsta = varsta;
    }


    public int getVarsta() {
        return Varsta;
    }


    public String get_Nume() {
        return nume;
    }

    public void setVarsta(int varsta) {
        Varsta = varsta;
    }

    public Pisica(String nume) {
        this.nume = nume;
    }

    public Pisica(int v) {
        this.Varsta = v;
    }


    private void setNume(String n) {
        this.nume = nume;
        this.Varsta = 1;
    }

    public String vorbeste() {
        return "Pisica " + this.nume + " miauna";
    }

    public String info() {
        return "Pisica " + this.NUME + " are varsta " + this.Varsta;
    }
}
