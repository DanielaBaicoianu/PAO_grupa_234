package exception;

public class AnimalListEmptyException extends RuntimeException{

    public AnimalListEmptyException(String message){
        super(message);
    }
}
