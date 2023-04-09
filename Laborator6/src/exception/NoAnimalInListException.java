package exception;

public class NoAnimalInListException extends RuntimeException{

    public NoAnimalInListException(String message){
        super(message);
    }

}
