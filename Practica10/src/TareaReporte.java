package practica10;

public class TareaReporte implements Runnable {

    private String nombreReporte;

    public TareaReporte(String nombreReporte) {
        this.nombreReporte = nombreReporte;
    }

    @Override
    public void run() {
        System.out.println("Generando reporte: " + nombreReporte);

        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            System.out.println("Reporte interrumpido");
        }

        System.out.println("Reporte terminado: " + nombreReporte);
    }
}