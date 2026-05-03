package practica10;

public class UsuarioThread extends Thread {

    private BufferImpresion buffer;
    private String nombre;

    public UsuarioThread(BufferImpresion buffer, String nombre) {
        this.buffer = buffer;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            TrabajoImpresion trabajo = new TrabajoImpresion(nombre, "Documento_" + i);
            buffer.producir(trabajo);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Usuario interrumpido");
            }
        }
    }
}