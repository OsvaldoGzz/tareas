package practica04;

public class Camion extends Vehiculo {

    private double carga;

    public Camion() {
        super();
        carga = 0;
    }

    public Camion(String marca, String modelo, int velocidad, double carga) {
        super(marca, modelo, velocidad);
        this.carga = carga;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Carga: " + carga + " toneladas");
    }

    @Override
    public void arrancar() {
        System.out.println("El camion arranco.");
    }

    @Override
    public void frenar() {
        System.out.println("El camion freno.");
    }
}