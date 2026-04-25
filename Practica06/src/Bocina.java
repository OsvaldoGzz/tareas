package practica06;

public class Bocina extends Dispositivo implements Reproducible, Cargable {

    public Bocina(String marca, String modelo, int bateria) {
        super(marca, modelo, bateria);
    }

    @Override
    public void encender() {
        System.out.println("La bocina encendio.");
    }

    @Override
    public void reproducirAudio() {
        System.out.println("La bocina esta reproduciendo audio.");
    }

    @Override
    public void cargarBateria() {
        bateria = 100;
        System.out.println("La bocina se cargo.");
    }
}