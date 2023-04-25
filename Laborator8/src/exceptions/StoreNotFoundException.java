package exceptions;

public class StoreNotFoundException extends RuntimeException{

    public  StoreNotFoundException(String exceptionMessage){
        super(exceptionMessage);
    }
}
