package practica07;

public class PruebaExcepciones {
    public static void main(String[] args) {

        InventarioService inventario = new InventarioService();

        inventario.agregarProducto(new Producto("AAA111", "Producto prueba", 100, 2));

        inventario.venderProducto("AAA111", 5);
        inventario.venderProducto("BBB222", 1);
        inventario.cambiarPrecio("AAA111", -20);

        System.out.println("Pruebas terminadas. Revisa el archivo errores.log");
    }
}