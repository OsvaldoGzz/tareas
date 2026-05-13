package gympos.service;

import gympos.model.RegistroAcceso;
import java.util.ArrayList;

public class ControlAcceso {

    private ArrayList<RegistroAcceso> registros;

    public ControlAcceso() {
        registros = new ArrayList<>();
    }

    public void registrarEntrada(String idCliente) {
        RegistroAcceso registro = new RegistroAcceso(idCliente);
        registros.add(registro);
        System.out.println("Entrada registrada.");
    }

    public void registrarSalida(String idCliente) {
        for (RegistroAcceso r : registros) {
            if (r.getIdCliente().equalsIgnoreCase(idCliente) && r.getSalida() == null) {
                r.registrarSalida();
                System.out.println("Salida registrada.");
                return;
            }
        }

        System.out.println("No hay entrada abierta para ese cliente.");
    }

    public void mostrarRegistros() {
        for (RegistroAcceso r : registros) {
            System.out.println(r);
        }
    }

    public ArrayList<RegistroAcceso> getRegistros() {
        return registros;
    }
}