package gympos.service;

import gympos.model.Producto;
import java.util.ArrayList;

public class InventarioEquipos {

    private ArrayList<Producto> equipos;

    public InventarioEquipos() {
        equipos = new ArrayList<>();
    }

    public void agregarEquipo(Producto producto) {
        equipos.add(producto);
        System.out.println("Equipo agregado al inventario.");
    }

    public Producto buscarEquipo(String codigo) {
        for (Producto p : equipos) {
            if (p.getCodigo().equalsIgnoreCase(codigo)) {
                return p;
            }
        }
        return null;
    }

    public void mostrarEquipos() {
        for (Producto p : equipos) {
            System.out.println(p);
        }
    }

    public void actualizarStock(String codigo, int nuevoStock) {
        Producto p = buscarEquipo(codigo);

        if (p != null) {
            p.setStock(nuevoStock);
            System.out.println("Stock actualizado.");
        } else {
            System.out.println("Equipo no encontrado.");
        }
    }

    public ArrayList<Producto> getEquipos() {
        return equipos;
    }
}