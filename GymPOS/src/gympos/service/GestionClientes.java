package gympos.service;

import gympos.model.Cliente;
import gympos.exception.ClienteInvalidoException;
import java.util.ArrayList;

public class GestionClientes {

    private ArrayList<Cliente> clientes;

    public GestionClientes() {
        clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) throws ClienteInvalidoException {
        if (cliente.getNombre() == null || cliente.getNombre().trim().isEmpty()) {
            throw new ClienteInvalidoException("el nombre no puede estar vacio");
        }

        if (cliente.getTelefono() == null || cliente.getTelefono().length() < 8) {
            throw new ClienteInvalidoException("telefono no valido");
        }

        clientes.add(cliente);
        System.out.println("Cliente agregado.");
    }

    public Cliente buscarCliente(String id) {
        for (Cliente c : clientes) {
            if (c.getId().equalsIgnoreCase(id)) {
                return c;
            }
        }
        return null;
    }

    public void mostrarClientes() {
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }

    public void eliminarCliente(String id) {
        Cliente cliente = buscarCliente(id);

        if (cliente != null) {
            clientes.remove(cliente);
            System.out.println("Cliente eliminado.");
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
}