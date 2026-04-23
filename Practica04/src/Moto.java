package practica04;

public class Moto extends Vehiculo {

    private boolean casco;

    public Moto() {
        super();
        casco = true;
    }

    public Moto(String marca, String modelo, int velocidad, boolean casco) {
        super(marca, modelo, velocidad);
        this.casco = casco;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Usa casco: " + casco);
    }

    @Override
    public void arrancar() {
        System.out.println("La moto arranco.");
    }

    @Override
    public void frenar() {
        System.out.println("La moto freno.");
    }
}