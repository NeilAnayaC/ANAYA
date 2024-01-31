package TALLER.MSSeguridad.Exception;

public class UsuarioNotFoundException extends RuntimeException{
    public UsuarioNotFoundException(String message){
        super(message);
    }
}
