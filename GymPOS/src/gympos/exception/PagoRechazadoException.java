package gympos.exception;

public class PagoRechazadoException extends GymPOSException {

    public PagoRechazadoException(String mensaje) {
        super("Pago rechazado: " + mensaje);
    }
}