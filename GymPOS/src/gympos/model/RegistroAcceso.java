package gympos.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class RegistroAcceso implements Serializable {

    private String idCliente;
    private LocalDateTime entrada;
    private LocalDateTime salida;

    public RegistroAcceso(String idCliente) {
        this.idCliente = idCliente;
        this.entrada = LocalDateTime.now();
    }

    public void registrarSalida() {
        salida = LocalDateTime.now();
    }

    public String getIdCliente() {
        return idCliente;
    }

    public LocalDateTime getEntrada() {
        return entrada;
    }

    public LocalDateTime getSalida() {
        return salida;
    }

    @Override
    public String toString() {
        return "Cliente: " + idCliente + " | entrada: " + entrada + " | salida: " + salida;
    }
}