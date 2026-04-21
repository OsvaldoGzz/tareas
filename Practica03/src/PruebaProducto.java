package practica03;

public class PruebaProducto {
    public static void main(String[] args) {

        Producto p = new Producto();

        p.setCodigo("ABC123");
        p.setPrecio(500);
        p.setStock(4);

        System.out.println(p);

        p.setCodigo("A12");
        p.setPrecio(-10);
        p.setStock(-1);

        System.out.println(p);
    }
}