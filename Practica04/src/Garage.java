package practica04;

public class Garage {

    private Vehiculo[] vehiculos;
    private int contador;

    public Garage() {
        vehiculos = new Vehiculo[10];
        contador = 0;
    }

    public void agregarVehiculo(Vehiculo v) {
        if (contador < vehiculos.length) {
            vehiculos[contador] = v;
            contador++;
            System.out.println("Vehiculo agregado.");
        } else {
            System.out.println("Ya no caben mas vehiculos.");
        }
    }

    public void mostrarVehiculos() {
        for (int i = 0; i < contador; i++) {
            vehiculos[i].mostrarInfo();
            vehiculos[i].arrancar();
            vehiculos[i].frenar();
            System.out.println("------------------");
        }
    }
}