package ro.ase.cts.pacienti;

public class AuthorizationCodeAlreadySetException extends RuntimeException{
    public AuthorizationCodeAlreadySetException (String message){
        super(message);
    }
}
