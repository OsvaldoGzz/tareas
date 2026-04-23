package practica04;

public class PruebasVehiculos {
    public static void main(String[] args) {

        Vehiculo a = new Auto("Ford", "Focus", 160, 4);
        Vehiculo m = new Moto("Yamaha", "R15", 140, true);
        Vehiculo c = new Camion("Mercedes", "Actros", 110, 20);
        Vehiculo e = new AutoElectrico("BYD", "Seal", 210, 4, 80);

        a.mostrarInfo();
        a.arrancar();
        a.frenar();

        System.out.println("-----");

        m.mostrarInfo();
        m.arrancar();
        m.frenar();

        System.out.println("-----");

        c.mostrarInfo();
        c.arrancar();
        c.frenar();

        System.out.println("-----");

        e.mostrarInfo();
        e.arrancar();
        e.frenar();
    }
}