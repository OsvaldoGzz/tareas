package practica07;

public class Main {
    public static void main(String[] args) {

        InventarioService inventario = new InventarioService();

        inventario.agregarProducto(new Producto("AUD123", "Audifonos", 800, 5));
        inventario.agregarProducto(new Producto("CAR456", "Cargador", 250, 10));
        inventario.agregarProducto(new Producto("CON789", "Control", 1200, 3));

        System.out.println("Productos:");
        inventario.mostrarProductos();

        System.out.println("----- Pruebas -----");

        inventario.venderProducto("AUD123", 2);
        inventario.venderProducto("CON789", 8);
        inventario.venderProducto("XYZ000", 1);
        inventario.cambiarPrecio("CAR456", -50);

        System.out.println("----- Inventario final -----");
        inventario.mostrarProductos();
    }
}