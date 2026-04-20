package practica02;

public class Main 
{
    public static void main(String[] args) 
    {

        Playlist miPlaylist = new Playlist();

        Cancion c1 = new Cancion();
        Cancion c2 = new Cancion("Ojitos Lindos", "Bad Bunny");
        Cancion c3 = new Cancion("Labios Rotos", "Zoe", "Rock", 4.5, true);
        Cancion c4 = new Cancion("Me Rehuso", "Danny Ocean", "Pop", 3.8, false);
        Cancion c5 = new Cancion("Luna", "Feid", "Urbano", 3.2, true);

        miPlaylist.agregarCancion(c1);
        miPlaylist.agregarCancion(c2);
        miPlaylist.agregarCancion(c3);
        miPlaylist.agregarCancion(c4);
        miPlaylist.agregarCancion(c5);

        System.out.println("Canciones guardadas en la playlist:");
        miPlaylist.mostrarCanciones();

        System.out.println("Buscando una cancion:");
        miPlaylist.buscarCancion("Luna");

        c2.marcarFavorita();
        c4.cambiarGenero("Reggaeton");
        c5.cambiarDuracion(3.5);

        System.out.println("Despues de algunos cambios:");
        miPlaylist.mostrarCanciones();
    }
}