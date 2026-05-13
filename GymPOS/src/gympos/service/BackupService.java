package gympos.service;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BackupService implements Runnable {

    private String archivoOriginal;
    private String carpetaDestino;

    public BackupService(String archivoOriginal, String carpetaDestino) {
        this.archivoOriginal = archivoOriginal;
        this.carpetaDestino = carpetaDestino;
    }

    @Override
    public void run() {
        crearBackup();
    }

    public void crearBackup() {
        File original = new File(archivoOriginal);

        if (!original.exists()) {
            System.out.println("No existe el archivo para backup: " + archivoOriginal);
            return;
        }

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
        String fecha = LocalDateTime.now().format(formato);

        File destino = new File(carpetaDestino + "backup_" + fecha + "_" + original.getName());

        try (BufferedInputStream entrada = new BufferedInputStream(new FileInputStream(original));
             BufferedOutputStream salida = new BufferedOutputStream(new FileOutputStream(destino))) {

            int dato;

            while ((dato = entrada.read()) != -1) {
                salida.write(dato);
            }

            System.out.println("Backup creado: " + destino.getName());

        } catch (IOException e) {
            System.out.println("Error al crear backup.");
        }
    }
}