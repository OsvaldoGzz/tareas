package gympos;

import gympos.model.*;
import gympos.service.*;
import gympos.persistence.DataStore;
import gympos.util.*;
import java.time.LocalDate;

public class MainConsola {
    public static void main(String[] args) {

        GestionClientes gestion = new GestionClientes();
        InventarioEquipos inventario = new InventarioEquipos();
        SistemaMembresias membresias = new SistemaMembresias();
        ControlAcceso acceso = new ControlAcceso();
        ProcesadorPagos pagos = new ProcesadorPagos();
        DataStore dataStore = new DataStore();
        Configuracion config = new Configuracion();

        config.crearConfiguracionInicial("config.properties");

        DatosPrueba.cargarClientes(gestion);
        DatosPrueba.cargarEquipos(inventario);

        membresias.registrarMembresia("C001", new MembresiaBasica(LocalDate.now()));
        membresias.registrarMembresia("C002", new MembresiaPremium(LocalDate.now()));
        membresias.registrarMembresia("C003", new MembresiaEstudiante(LocalDate.now()));

        acceso.registrarEntrada("C001");
        acceso.registrarSalida("C001");

        try {
            pagos.procesarPago("C001", 400);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        gestion.mostrarClientes();
        inventario.mostrarEquipos();
        membresias.mostrarMembresias();
        acceso.mostrarRegistros();

        dataStore.guardarClientes(gestion.getClientes(), "clientes.dat");
        dataStore.guardarProductos(inventario.getEquipos(), "productos.dat");
        dataStore.guardarMembresias(membresias.getMembresias(), "membresias.dat");
        dataStore.guardarAccesos(acceso.getRegistros(), "accesos.dat");

        Thread reporte = new Thread(
                new GeneradorReportes(gestion.getClientes(), inventario.getEquipos(), "reporte_gympos.txt")
        );

        reporte.start();

        Thread backup = new Thread(new BackupService("clientes.dat", ""));

        backup.start();

        Thread notificador = new Thread(new NotificadorMembresias(membresias.getMembresias()));

        notificador.start();

        System.out.println("Prueba de fase 3 terminada.");
    }
}