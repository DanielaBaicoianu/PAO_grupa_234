package SERVICE;

public class Pisica {

    private String nume;
    private int Varsta;


    public Pisica(String nume){
        this.nume = nume;
    }

    public Pisica(int v){
        this.Varsta = v;
    }

    public Pisica(){

    }

    private void setNume(String n){
        this.nume = nume;
        this.Varsta = 1;
    }

    public String vorbeste(){
        return "Pisica " + this.nume + " miauna";
    }

}
