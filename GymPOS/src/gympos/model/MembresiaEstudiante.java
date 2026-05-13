package gympos.model;

import java.time.LocalDate;

public class MembresiaEstudiante extends Membresia {

    public MembresiaEstudiante(LocalDate fechaInicio) {
        super("Estudiante", 350, fechaInicio);
    }

    @Override
    public double calcularPrecioFinal() {
        return precio * 0.85;
    }
}