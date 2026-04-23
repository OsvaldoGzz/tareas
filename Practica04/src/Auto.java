package practica04;

public class Auto extends Vehiculo {

    protected int puertas;

    public Auto() {
        super();
        puertas = 4;
    }

    public Auto(String marca, String modelo, int velocidad, int puertas) {
        super(marca, modelo, velocidad);
        this.puertas = puertas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Puertas: " + puertas);
    }

    @Override
    public void arrancar() {
        System.out.println("El auto encendio.");
    }

    @Override
    public void frenar() {
        System.out.println("El auto freno.");
    }
}