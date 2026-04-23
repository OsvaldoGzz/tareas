package practica04;

public class AutoElectrico extends Auto {

    private int bateria;

    public AutoElectrico() {
        super();
        bateria = 100;
    }

    public AutoElectrico(String marca, String modelo, int velocidad, int puertas, int bateria) {
        super(marca, modelo, velocidad, puertas);
        this.bateria = bateria;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Bateria: " + bateria + "%");
    }

    @Override
    public void arrancar() {
        System.out.println("El auto electrico arranco sin ruido.");
    }

    @Override
    public void frenar() {
        System.out.println("El auto electrico freno.");
    }
}