package practica05;

public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {
        super("Circulo");
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return 3.1416 * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * 3.1416 * radio;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Datos del circulo");
        System.out.println("Radio: " + radio);
    }

    public void cambiarRadio(double radio) {
        this.radio = radio;
    }

    public void cambiarRadio(int radio) {
        this.radio = radio;
    }

    public void cambiarRadio(double radio, boolean mostrarMensaje) {
        this.radio = radio;
        if (mostrarMensaje) {
            System.out.println("Radio cambiado a: " + radio);
        }
    }
}