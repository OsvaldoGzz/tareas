package practica03;

public class Main {
    public static void main(String[] args) {

        Producto p1 = new Producto("Laptop", "LAP123", 15000, 5, "Tecnologia");
        Producto p2 = new Producto("Mouse", "MOU456", 250, 10, "Accesorios");
        Producto p3 = new Producto("Teclado", "TEC789", 500, 8, "Accesorios");

        Inventario inv = new Inventario("Tienda Osvaldo");

        inv.agregarProducto(p1);
        inv.agregarProducto(p2);
        inv.agregarProducto(p3);

        inv.mostrarProductos();

        System.out.println("-----");
        inv.buscarProducto("MOU456");

        System.out.println("-----");
        p2.setCodigo("AA12");
        p3.setPrecio(-50);
        p1.setStock(-3);

        System.out.println("-----");
        inv.mostrarProductos();
    }
}