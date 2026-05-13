package gympos.exception;

public class ClienteInvalidoException extends GymPOSException {

    public ClienteInvalidoException(String mensaje) {
        super("Cliente invalido: " + mensaje);
    }
}