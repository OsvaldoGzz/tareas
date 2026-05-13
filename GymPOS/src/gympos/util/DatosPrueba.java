package gympos.util;

import gympos.model.Cliente;
import gympos.model.Producto;
import gympos.model.ClaseGrupal;
import gympos.service.GestionClientes;
import gympos.service.InventarioEquipos;
import java.util.ArrayList;

public class DatosPrueba {

    public static void cargarClientes(GestionClientes gestion) {
        try {
            gestion.agregarCliente(new Cliente("C001", "Osvaldo", "8111111111", "osvaldo@mail.com"));
            gestion.agregarCliente(new Cliente("C002", "Luis", "8222222222", "luis@mail.com"));
            gestion.agregarCliente(new Cliente("C003", "Ana", "8333333333", "ana@mail.com"));
            gestion.agregarCliente(new Cliente("C004", "Carlos", "8444444444", "carlos@mail.com"));
            gestion.agregarCliente(new Cliente("C005", "Maria", "8555555555", "maria@mail.com"));
            gestion.agregarCliente(new Cliente("C006", "Jorge", "8666666666", "jorge@mail.com"));
            gestion.agregarCliente(new Cliente("C007", "Sofia", "8777777777", "sofia@mail.com"));
            gestion.agregarCliente(new Cliente("C008", "Pedro", "8888888888", "pedro@mail.com"));
            gestion.agregarCliente(new Cliente("C009", "Diana", "8999999999", "diana@mail.com"));
            gestion.agregarCliente(new Cliente("C010", "Raul", "8000000000", "raul@mail.com"));
        } catch (Exception e) {
            System.out.println("Error al cargar clientes de prueba.");
        }
    }

    public static void cargarEquipos(InventarioEquipos inventario) {
        inventario.agregarEquipo(new Producto("E001", "Mancuernas", 1200, 10));
        inventario.agregarEquipo(new Producto("E002", "Banco plano", 2500, 3));
        inventario.agregarEquipo(new Producto("E003", "Caminadora", 12000, 2));
        inventario.agregarEquipo(new Producto("E004", "Bicicleta fija", 9000, 2));
        inventario.agregarEquipo(new Producto("E005", "Colchoneta", 300, 15));
        inventario.agregarEquipo(new Producto("E006", "Barra olimpica", 1800, 5));
        inventario.agregarEquipo(new Producto("E007", "Discos 10kg", 600, 20));
        inventario.agregarEquipo(new Producto("E008", "Cuerda", 150, 12));
        inventario.agregarEquipo(new Producto("E009", "Kettlebell", 900, 8));
        inventario.agregarEquipo(new Producto("E010", "Guantes", 250, 25));
    }

    public static ArrayList<ClaseGrupal> crearClases() {
        ArrayList<ClaseGrupal> clases = new ArrayList<>();

        clases.add(new ClaseGrupal("Spinning", "Lunes 7:00", 20));
        clases.add(new ClaseGrupal("Yoga", "Martes 8:00", 15));
        clases.add(new ClaseGrupal("Box", "Miercoles 18:00", 12));
        clases.add(new ClaseGrupal("Funcional", "Jueves 19:00", 18));
        clases.add(new ClaseGrupal("Zumba", "Viernes 17:00", 25));

        return clases;
    }
}