package gympos.exception;

public class MembresiaVencidaException extends GymPOSException {

    public MembresiaVencidaException(String idCliente) {
        super("La membresia del cliente " + idCliente + " esta vencida.");
    }
}