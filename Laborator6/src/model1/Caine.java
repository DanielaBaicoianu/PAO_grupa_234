package model1;

import SERVICE.FisaMedicalaService;

public class Caine implements Animal{
    public String nume;
    public String rasa;

    @Override
    public String vorbeste(){
        return "Cainele " + this.nume + " latra";

    }

    @Override
    public FisaMedicala getFisaMedicala(){
        return new FisaMedicala();
    }



}
