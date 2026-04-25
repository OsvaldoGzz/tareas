package practica06;

public class Laptop extends Dispositivo implements Conectable, Cargable {

    public Laptop(String marca, String modelo, int bateria) {
        super(marca, modelo, bateria);
    }

    @Override
    public void encender() {
        System.out.println("La laptop encendio.");
    }

    @Override
    public void conectarWifi() {
        System.out.println("La laptop se conecto al wifi.");
    }

    @Override
    public void cargarBateria() {
        bateria = 100;
        System.out.println("La laptop se cargo completamente.");
    }
}