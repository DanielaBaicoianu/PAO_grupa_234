package SERVICE;

public class Caine implements Animal {
    public String NUME;

    public String rasa;

    public Caine(String NUME, String rasa) {
        this.NUME = NUME;
        this.rasa = rasa;
    }

    public void changeNUME(String NUME) {
        this.NUME = NUME;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    //aici nu puteam face ca la pisica deoarece numele si rasa sunt tot string
//sper ca am inteles corect
    public String get_nume() {
        return NUME;
    }


    public String getRasa() {
        return rasa;
    }

    private void setNume(String n) {
        this.NUME = nume;
        this.rasa = "-/-";
    }
    //am pus si aici

    public String vorbeste() {
        return "Cainele " + this.NUME + " latra";

    }

    public String info() {
        return "Cainele " + this.NUME + "are rasa " + this.rasa;
    }

}
