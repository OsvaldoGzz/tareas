package practica04;

public class Main {
    public static void main(String[] args) {

        Garage garage = new Garage();

        Vehiculo v1 = new Auto("Nissan", "Versa", 180, 4);
        Vehiculo v2 = new Moto("Honda", "CBR", 150, true);
        Vehiculo v3 = new Camion("Volvo", "FH", 120, 18.5);
        Vehiculo v4 = new AutoElectrico("Tesla", "Model 3", 220, 4, 95);

        garage.agregarVehiculo(v1);
        garage.agregarVehiculo(v2);
        garage.agregarVehiculo(v3);
        garage.agregarVehiculo(v4);

        garage.mostrarVehiculos();
    }
}