package gympos.service;

import gympos.exception.PagoRechazadoException;
import java.util.Random;

public class ProcesadorPagos {

    private Random random;

    public ProcesadorPagos() {
        random = new Random();
    }

    public boolean procesarPago(String idCliente, double monto) throws PagoRechazadoException {
        if (monto <= 0) {
            throw new PagoRechazadoException("monto invalido");
        }

        int resultado = random.nextInt(10);

        if (resultado < 2) {
            throw new PagoRechazadoException("fallo en la simulacion del banco");
        }

        System.out.println("Pago aprobado para cliente " + idCliente + " por $" + monto);
        return true;
    }
}