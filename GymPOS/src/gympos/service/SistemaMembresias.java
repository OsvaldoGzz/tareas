package gympos.service;

import gympos.model.Membresia;
import java.util.HashMap;

public class SistemaMembresias {

    private HashMap<String, Membresia> membresias;

    public SistemaMembresias() {
        membresias = new HashMap<>();
    }

    public void registrarMembresia(String idCliente, Membresia membresia) {
        membresias.put(idCliente, membresia);
        System.out.println("Membresia registrada.");
    }

    public Membresia obtenerMembresia(String idCliente) {
        return membresias.get(idCliente);
    }

    public void renovarMembresia(String idCliente) {
        Membresia membresia = membresias.get(idCliente);

        if (membresia != null) {
            membresia.renovar();
            System.out.println("Membresia renovada.");
        } else {
            System.out.println("No hay membresia para ese cliente.");
        }
    }

    public void mostrarMembresias() {
        for (String id : membresias.keySet()) {
            System.out.println(id + " -> " + membresias.get(id));
        }
    }

    public HashMap<String, Membresia> getMembresias() {
        return membresias;
    }
}