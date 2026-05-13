package gympos.model;

import java.io.Serializable;

public class ClaseGrupal implements Serializable {

    private String nombre;
    private String horario;
    private int cupo;

    public ClaseGrupal(String nombre, String horario, int cupo) {
        this.nombre = nombre;
        this.horario = horario;
        this.cupo = cupo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getHorario() {
        return horario;
    }

    public int getCupo() {
        return cupo;
    }

    @Override
    public String toString() {
        return nombre + " | " + horario + " | cupo: " + cupo;
    }
}