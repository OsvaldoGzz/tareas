package gympos.persistence;

import gympos.model.Cliente;
import gympos.model.Producto;
import gympos.model.Membresia;
import gympos.model.RegistroAcceso;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class DataStore {

    public void guardarClientes(ArrayList<Cliente> clientes, String archivo) {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(archivo))) {
            salida.writeObject(clientes);
            System.out.println("Clientes guardados.");
        } catch (IOException e) {
            System.out.println("Error al guardar clientes.");
        }
    }

    public ArrayList<Cliente> cargarClientes(String archivo) {
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(archivo))) {
            return (ArrayList<Cliente>) entrada.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No se pudieron cargar clientes.");
            return new ArrayList<>();
        }
    }

    public void guardarProductos(ArrayList<Producto> productos, String archivo) {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(archivo))) {
            salida.writeObject(productos);
            System.out.println("Productos guardados.");
        } catch (IOException e) {
            System.out.println("Error al guardar productos.");
        }
    }

    public ArrayList<Producto> cargarProductos(String archivo) {
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(archivo))) {
            return (ArrayList<Producto>) entrada.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No se pudieron cargar productos.");
            return new ArrayList<>();
        }
    }

    public void guardarMembresias(HashMap<String, Membresia> membresias, String archivo) {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(archivo))) {
            salida.writeObject(membresias);
            System.out.println("Membresias guardadas.");
        } catch (IOException e) {
            System.out.println("Error al guardar membresias.");
        }
    }

    public HashMap<String, Membresia> cargarMembresias(String archivo) {
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(archivo))) {
            return (HashMap<String, Membresia>) entrada.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No se pudieron cargar membresias.");
            return new HashMap<>();
        }
    }

    public void guardarAccesos(ArrayList<RegistroAcceso> registros, String archivo) {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(archivo))) {
            salida.writeObject(registros);
            System.out.println("Registros de acceso guardados.");
        } catch (IOException e) {
            System.out.println("Error al guardar accesos.");
        }
    }

    public ArrayList<RegistroAcceso> cargarAccesos(String archivo) {
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(archivo))) {
            return (ArrayList<RegistroAcceso>) entrada.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No se pudieron cargar accesos.");
            return new ArrayList<>();
        }
    }
}