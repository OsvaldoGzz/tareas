package gympos.controller;

import gympos.exception.ClienteInvalidoException;
import gympos.model.Cliente;
import gympos.service.GestionClientes;

import java.util.ArrayList;

public class GymController {

    private GestionClientes gestionClientes;

    public GymController() {
        gestionClientes = new GestionClientes();
    }

    public void agregarCliente(String id, String nombre, String telefono, String correo) {
        try {
            Cliente cliente = new Cliente(id, nombre, telefono, correo);
            gestionClientes.agregarCliente(cliente);
        } catch (ClienteInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }

    public void eliminarCliente(String id) {
        gestionClientes.eliminarCliente(id);
    }

    public Cliente buscarCliente(String id) {
        return gestionClientes.buscarCliente(id);
    }

    public ArrayList<Cliente> obtenerClientes() {
        return gestionClientes.getClientes();
    }

    public void actualizarCliente(String id, String nombre, String telefono, String correo) {
        Cliente cliente = gestionClientes.buscarCliente(id);

        if (cliente != null) {
            cliente.setNombre(nombre);
            cliente.setTelefono(telefono);
            cliente.setCorreo(correo);
            System.out.println("Cliente actualizado.");
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    public void cargarDatosIniciales() {
        agregarCliente("C001", "Osvaldo", "8111111111", "osvaldo@mail.com");
        agregarCliente("C002", "Luis", "8222222222", "luis@mail.com");
        agregarCliente("C003", "Ana", "8333333333", "ana@mail.com");
    }
}