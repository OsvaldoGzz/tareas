package gympos.service;

import gympos.model.Cliente;
import gympos.model.Producto;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GeneradorReportes implements Runnable {

    private ArrayList<Cliente> clientes;
    private ArrayList<Producto> productos;
    private String archivo;

    public GeneradorReportes(ArrayList<Cliente> clientes, ArrayList<Producto> productos, String archivo) {
        this.clientes = clientes;
        this.productos = productos;
        this.archivo = archivo;
    }

    @Override
    public void run() {
        generarReporteTXT();
    }

    public void generarReporteTXT() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {

            bw.write("REPORTE GYMPOS");
            bw.newLine();
            bw.write("--------------------");
            bw.newLine();

            bw.write("Clientes registrados: " + clientes.size());
            bw.newLine();

            for (Cliente c : clientes) {
                bw.write(c.toString());
                bw.newLine();
            }

            bw.newLine();
            bw.write("Inventario:");
            bw.newLine();

            for (Producto p : productos) {
                bw.write(p.toString());
                bw.newLine();
            }

            System.out.println("Reporte generado: " + archivo);

        } catch (IOException e) {
            System.out.println("Error al generar reporte.");
        }
    }
}