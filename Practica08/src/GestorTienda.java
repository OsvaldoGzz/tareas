package practica08;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GestorTienda {

    private ArrayList<Producto> productos;
    private LinkedList<String> historial;
    private HashMap<String, Producto> mapaProductos;
    private HashSet<String> categorias;

    public GestorTienda() {
        productos = new ArrayList<>();
        historial = new LinkedList<>();
        mapaProductos = new HashMap<>();
        categorias = new HashSet<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        mapaProductos.put(producto.getCodigo(), producto);
        categorias.add(producto.getCategoria());
        historial.add("Se agrego: " + producto.getNombre());
    }

    public void mostrarProductos() {
        Iterator<Producto> it = productos.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public Producto buscarPorCodigo(String codigo) {
        return mapaProductos.get(codigo);
    }

    public void actualizarProducto(String codigo, double nuevoPrecio, int nuevoStock) {
        Producto producto = mapaProductos.get(codigo);

        if (producto != null) {
            producto.setPrecio(nuevoPrecio);
            producto.setStock(nuevoStock);
            historial.add("Se actualizo: " + producto.getNombre());
            System.out.println("Producto actualizado.");
        } else {
            System.out.println("No se encontro el producto.");
        }
    }

    public void eliminarProducto(String codigo) {
        Producto producto = mapaProductos.get(codigo);

        if (producto != null) {
            productos.remove(producto);
            mapaProductos.remove(codigo);
            historial.add("Se elimino: " + producto.getNombre());
            System.out.println("Producto eliminado.");
        } else {
            System.out.println("No se encontro el producto.");
        }
    }

    public void ordenarPorNombre() {
        Collections.sort(productos);
        historial.add("Se ordeno por nombre.");
    }

    public void ordenarPorPrecio() {
        Collections.sort(productos, new ComparadorPrecio());
        historial.add("Se ordeno por precio.");
    }

    public void ordenarPorStock() {
        Collections.sort(productos, new ComparadorStock());
        historial.add("Se ordeno por stock.");
    }

    public void filtrarPorCategoria(String categoria) {
        productos.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase(categoria))
                .forEach(System.out::println);
    }

    public void busquedaCompuesta(String categoria, double precioMaximo, int stockMinimo) {
        productos.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase(categoria))
                .filter(p -> p.getPrecio() <= precioMaximo)
                .filter(p -> p.getStock() >= stockMinimo)
                .forEach(System.out::println);
    }

    public void mostrarCategorias() {
        System.out.println("Categorias:");
        for (String c : categorias) {
            System.out.println("- " + c);
        }
    }

    public void mostrarHistorial() {
        System.out.println("Historial:");
        for (String h : historial) {
            System.out.println(h);
        }
    }

    public void cargarDatosPrueba() {
        agregarProducto(new Producto("P001", "Audifonos", "Electronica", 800, 5));
        agregarProducto(new Producto("P002", "Mouse", "Electronica", 250, 15));
        agregarProducto(new Producto("P003", "Teclado", "Electronica", 600, 8));
        agregarProducto(new Producto("P004", "Mochila", "Escolar", 500, 12));
        agregarProducto(new Producto("P005", "Cuaderno", "Escolar", 40, 30));
        agregarProducto(new Producto("P006", "Pluma", "Escolar", 15, 50));
        agregarProducto(new Producto("P007", "Termo", "Hogar", 300, 10));
        agregarProducto(new Producto("P008", "Lampara", "Hogar", 450, 6));
        agregarProducto(new Producto("P009", "Silla", "Hogar", 900, 4));
        agregarProducto(new Producto("P010", "Control Xbox", "Gaming", 1200, 3));
        agregarProducto(new Producto("P011", "Mousepad", "Gaming", 200, 20));
        agregarProducto(new Producto("P012", "Monitor", "Gaming", 3500, 2));
        agregarProducto(new Producto("P013", "Cargador", "Electronica", 180, 18));
        agregarProducto(new Producto("P014", "Bocina", "Electronica", 700, 7));
        agregarProducto(new Producto("P015", "Libreta", "Escolar", 65, 25));
    }

    public void analizarTiempoBusqueda(String codigo) {
        long inicio = System.nanoTime();

        Producto p = buscarPorCodigo(codigo);

        long fin = System.nanoTime();

        if (p != null) {
            System.out.println("Producto encontrado: " + p.getNombre());
        } else {
            System.out.println("Producto no encontrado.");
        }

        System.out.println("Tiempo de busqueda en HashMap: " + (fin - inicio) + " ns");
    }

    public void analizarTiempoListado() {
        long inicio = System.nanoTime();

        for (Producto p : productos) {
            p.getNombre();
        }

        long fin = System.nanoTime();

        System.out.println("Tiempo de recorrido en ArrayList: " + (fin - inicio) + " ns");
    }
}