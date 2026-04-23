package practica04;

public class Vehiculo {

    protected String marca;
    protected String modelo;
    protected int velocidad;

    public Vehiculo() {
        marca = "Sin marca";
        modelo = "Sin modelo";
        velocidad = 0;
    }

    public Vehiculo(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad: " + velocidad);
    }

    public void arrancar() {
        System.out.println("El vehiculo arranco.");
    }

    public void frenar() {
        System.out.println("El vehiculo freno.");
    }
}