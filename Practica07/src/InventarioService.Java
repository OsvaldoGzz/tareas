package practica07;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class InventarioService {

    private Producto[] productos;
    private int contador;

    public InventarioService() {
        productos = new Producto[10];
        contador = 0;
    }

    public void agregarProducto(Producto producto) {
        if (contador < productos.length) {
            productos[contador] = producto;
            contador++;
        }
    }

    public Producto buscarProducto(String codigo) throws ProductoNoEncontradoException {
        for (int i = 0; i < contador; i++) {
            if (productos[i].getCodigo().equalsIgnoreCase(codigo)) {
                return productos[i];
            }
        }

        throw new ProductoNoEncontradoException(codigo);
    }

    public void venderProducto(String codigo, int cantidad) {
        try {
            Producto producto = buscarProducto(codigo);
            producto.vender(cantidad);
            System.out.println("Venta realizada: " + producto.getNombre());
        } catch (InventarioException e) {
            System.out.println("Error: " + e.getMessage());
            guardarLog(e.getMessage());
        }
    }

    public void cambiarPrecio(String codigo, double nuevoPrecio) {
        try {
            Producto producto = buscarProducto(codigo);
            producto.setPrecio(nuevoPrecio);
            System.out.println("Precio actualizado.");
        } catch (InventarioException e) {
            System.out.println("Error: " + e.getMessage());
            guardarLog(e.getMessage());
        }
    }

    public void guardarLog(String mensaje) {
        try (PrintWriter salida = new PrintWriter(new FileWriter("errores.log", true))) {
            salida.println(mensaje);
        } catch (IOException e) {
            System.out.println("No se pudo escribir en el log.");
        }
    }

    public void mostrarProductos() {
        for (int i = 0; i < contador; i++) {
            System.out.println(productos[i]);
        }
    }
}