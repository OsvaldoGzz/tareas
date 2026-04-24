package practica05;

public abstract class Figura implements Calculable {

    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public abstract void mostrarDatos();

    public void mostrarResumen() {
        System.out.println("Figura: " + nombre);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }

    public void procesarFigura() {
        mostrarDatos();
        mostrarResumen();
        System.out.println("------------------");
    }
}