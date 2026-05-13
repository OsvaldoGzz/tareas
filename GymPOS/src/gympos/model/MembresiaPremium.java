package gympos.model;

import java.time.LocalDate;

public class MembresiaPremium extends Membresia {

    public MembresiaPremium(LocalDate fechaInicio) {
        super("Premium", 700, fechaInicio);
    }

    @Override
    public double calcularPrecioFinal() {
        return precio * 0.90;
    }
}