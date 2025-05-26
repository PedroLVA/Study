package practice.exceptions;

public class EventoNotValidException extends RuntimeException {
    public EventoNotValidException(String message){
        super(message);
    }
}
