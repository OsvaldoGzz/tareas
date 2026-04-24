package practica05;

public class Rectangulo extends Figura {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        super("Rectangulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Datos del rectangulo");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
    }

    public void cambiarMedidas(double base) {
        this.base = base;
    }

    public void cambiarMedidas(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void cambiarMedidas(int base, int altura, boolean mostrarMensaje) {
        this.base = base;
        this.altura = altura;
        if (mostrarMensaje) {
            System.out.println("Medidas cambiadas");
        }
    }
}