package exception;

public class NoVaccinInListException extends RuntimeException{
    public NoVaccinInListException(String message){
        super(message);
    }

}
