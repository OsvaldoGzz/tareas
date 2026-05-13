package gympos.model;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Membresia implements Serializable {

    protected String nombre;
    protected double precio;
    protected LocalDate fechaInicio;
    protected LocalDate fechaFin;

    public Membresia(String nombre, double precio, LocalDate fechaInicio) {
        this.nombre = nombre;
        this.precio = precio;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaInicio.plusMonths(1);
    }

    public abstract double calcularPrecioFinal();

    public boolean estaVencida() {
        return LocalDate.now().isAfter(fechaFin);
    }

    public void renovar() {
        fechaInicio = LocalDate.now();
        fechaFin = fechaInicio.plusMonths(1);
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    @Override
    public String toString() {
        return nombre + " | $" + calcularPrecioFinal() + " | vence: " + fechaFin;
    }
}