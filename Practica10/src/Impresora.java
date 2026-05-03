package practica10;

public class Impresora implements Runnable {

    private BufferImpresion buffer;
    private int cantidadTrabajos;

    public Impresora(BufferImpresion buffer, int cantidadTrabajos) {
        this.buffer = buffer;
        this.cantidadTrabajos = cantidadTrabajos;
    }

    @Override
    public void run() {
        for (int i = 1; i <= cantidadTrabajos; i++) {
            TrabajoImpresion trabajo = buffer.consumir();

            System.out.println("Imprimiendo: " + trabajo.getDocumento());

            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println("Impresora interrumpida");
            }
        }
    }
}