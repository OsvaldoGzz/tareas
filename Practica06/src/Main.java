package practica06;

public class Main {
    public static void main(String[] args) {

        GestorDispositivos gestor = new GestorDispositivos();

        Dispositivo d1 = new Celular("Samsung", "A54", 60);
        Dispositivo d2 = new Bocina("JBL", "Go 3", 40);
        Dispositivo d3 = new Laptop("HP", "Pavilion", 75);

        gestor.agregarDispositivo(d1);
        gestor.agregarDispositivo(d2);
        gestor.agregarDispositivo(d3);

        gestor.mostrarDispositivos();
    }
}