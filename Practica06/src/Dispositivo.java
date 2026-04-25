package practica06;

public abstract class Dispositivo {

    protected String marca;
    protected String modelo;
    protected int bateria;

    public Dispositivo(String marca, String modelo, int bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public abstract void encender();

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Bateria: " + bateria + "%");
    }

    public void apagar() {
        System.out.println("El dispositivo se apago.");
    }
}