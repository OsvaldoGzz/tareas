package practica06;

public class GestorDispositivos {

    private Dispositivo[] dispositivos;
    private int contador;

    public GestorDispositivos() {
        dispositivos = new Dispositivo[10];
        contador = 0;
    }

    public void agregarDispositivo(Dispositivo d) {
        if (contador < dispositivos.length) {
            dispositivos[contador] = d;
            contador++;
            System.out.println("Dispositivo agregado.");
        } else {
            System.out.println("Ya no hay espacio.");
        }
    }

    public void mostrarDispositivos() {
        for (int i = 0; i < contador; i++) {
            dispositivos[i].mostrarInfo();
            dispositivos[i].encender();

            if (dispositivos[i] instanceof Conectable) {
                ((Conectable) dispositivos[i]).conectarWifi();
            }

            if (dispositivos[i] instanceof Reproducible) {
                ((Reproducible) dispositivos[i]).reproducirAudio();
            }

            if (dispositivos[i] instanceof Cargable) {
                ((Cargable) dispositivos[i]).cargarBateria();
            }

            dispositivos[i].apagar();
            System.out.println("------------------");
        }
    }
}