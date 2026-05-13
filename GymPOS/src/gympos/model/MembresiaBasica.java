package gympos.model;

import java.time.LocalDate;

public class MembresiaBasica extends Membresia {

    public MembresiaBasica(LocalDate fechaInicio) {
        super("Basica", 400, fechaInicio);
    }

    @Override
    public double calcularPrecioFinal() {
        return precio;
    }
}