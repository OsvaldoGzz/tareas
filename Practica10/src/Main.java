package practica10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        BufferImpresion buffer = new BufferImpresion(5);

        UsuarioThread usuario1 = new UsuarioThread(buffer, "Osvaldo");

        Thread usuario2 = new Thread(new UsuarioRunnable(buffer, "Luis"));
        Thread usuario3 = new Thread(new UsuarioRunnable(buffer, "Ana"));

        Thread impresora1 = new Thread(new Impresora(buffer, 5));
        Thread impresora2 = new Thread(new Impresora(buffer, 4));

        usuario1.start();
        usuario2.start();
        usuario3.start();

        impresora1.start();
        impresora2.start();

        try {
            usuario1.join();
            usuario2.join();
            usuario3.join();
            impresora1.join();
            impresora2.join();
        } catch (InterruptedException e) {
            System.out.println("Error al esperar hilos");
        }

        System.out.println("----- ExecutorService -----");

        ExecutorService pool = Executors.newFixedThreadPool(2);

        pool.execute(new TareaReporte("Reporte de trabajos"));
        pool.execute(new TareaReporte("Reporte de usuarios"));
        pool.execute(new TareaReporte("Reporte de impresora"));

        pool.shutdown();

        System.out.println("Programa terminado.");
    }
}