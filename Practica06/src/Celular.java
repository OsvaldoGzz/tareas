package practica06;

public class Celular extends Dispositivo implements Conectable, Reproducible, Cargable {

    public Celular(String marca, String modelo, int bateria) {
        super(marca, modelo, bateria);
    }

    @Override
    public void encender() {
        System.out.println("El celular encendio.");
    }

    @Override
    public void conectarWifi() {
        System.out.println("El celular se conecto al wifi.");
    }

    @Override
    public void reproducirAudio() {
        System.out.println("El celular esta reproduciendo musica.");
    }

    @Override
    public void cargarBateria() {
        bateria = 100;
        System.out.println("El celular se cargo al 100%.");
    }
}