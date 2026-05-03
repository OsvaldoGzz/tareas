package practica10;

public class UsuarioRunnable implements Runnable {

    private BufferImpresion buffer;
    private String nombre;

    public UsuarioRunnable(BufferImpresion buffer, String nombre) {
        this.buffer = buffer;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            TrabajoImpresion trabajo = new TrabajoImpresion(nombre, "Archivo_" + i);
            buffer.producir(trabajo);

            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println("Runnable interrumpido");
            }
        }
    }
}