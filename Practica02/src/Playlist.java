package practica02;

public class Playlist {

    Cancion[] canciones = new Cancion[10];
    int contador = 0;

    public void agregarCancion(Cancion cancion) {
        if (contador < canciones.length) {
            canciones[contador] = cancion;
            contador++;
            System.out.println("Cancion agregada");
        } else {
            System.out.println("La playlist esta llena");
        }
    }

    public void mostrarCanciones() {
        for (int i = 0; i < contador; i++) {
            canciones[i].mostrarInfo();
        }
    }

    public void buscarCancion(String nombre) {
        boolean encontrada = false;

        for (int i = 0; i < contador; i++) {
            if (canciones[i].nombre.equalsIgnoreCase(nombre)) {
                System.out.println("Cancion encontrada:");
                canciones[i].mostrarInfo();
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("No se encontro la cancion");
        }
    }
}