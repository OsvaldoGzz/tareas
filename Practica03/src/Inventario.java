package practica03;



public class Inventario {

    protected String nombreNegocio;
    private Producto[] productos;
    private int contador;

    public Inventario() {
        nombreNegocio = "Tienda Osvaldo";
        productos = new Producto[10];
        contador = 0;
    }

    public Inventario(String nombreNegocio) {
        this.nombreNegocio = nombreNegocio;
        productos = new Producto[10];
        contador = 0;
    }

    public void agregarProducto(Producto producto) {
        if (contador < productos.length) {
            productos[contador] = producto;
            contador++;
            System.out.println("Producto agregado al inventario.");
        } else {
            System.out.println("No hay espacio para mas productos.");
        }
    }

    public void mostrarProductos() {
        System.out.println("Inventario de: " + nombreNegocio);
        for (int i = 0; i < contador; i++) {
            System.out.println(productos[i]);
        }
    }

    public void buscarProducto(String codigo) {
        boolean encontrado = false;

        for (int i = 0; i < contador; i++) {
            if (productos[i].getCodigo().equalsIgnoreCase(codigo)) {
                System.out.println("Producto encontrado:");
                System.out.println(productos[i]);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontro el producto.");
        }
    }
}