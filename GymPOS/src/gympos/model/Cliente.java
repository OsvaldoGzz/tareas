package gympos.model;

import java.io.Serializable;

public class Cliente implements Serializable {

    private String id;
    private String nombre;
    private String telefono;
    private String correo;
    private int puntos;

    public Cliente(String id, String nombre, String telefono, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.puntos = 0;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void agregarPuntos(int cantidad) {
        if (cantidad > 0) {
            puntos += cantidad;
        }
    }

    @Override
    public String toString() {
        return id + " | " + nombre + " | " + telefono + " | " + correo + " | puntos: " + puntos;
    }
}