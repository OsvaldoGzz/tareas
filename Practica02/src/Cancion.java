package practica02;

public class Cancion {

    String nombre;
    String artista;
    String genero;
    double duracion;
    boolean favorita;

    public Cancion() 
    {
        nombre = "Sin nombre";
        artista = "Desconocido";
        genero = "Sin genero";
        duracion = 0;
        favorita = false;
    }

    public Cancion(String nombre, String artista) 
    {
        this.nombre = nombre;
        this.artista = artista;
        genero = "Pop";
        duracion = 3.0;
        favorita = false;
    }

    public Cancion(String nombre, String artista, String genero, double duracion, boolean favorita) 
    {
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
        this.duracion = duracion;
        this.favorita = favorita;
    }

    public void mostrarInfo() 
    {
        System.out.println("Nombre: " + nombre);
        System.out.println("Artista: " + artista);
        System.out.println("Genero: " + genero);
        System.out.println("Duracion: " + duracion);
        System.out.println("Favorita: " + favorita);
        System.out.println("-------------------");
    }

    public void marcarFavorita() 
    {
        favorita = true;
    }

    public void quitarFavorita() 
    {
        favorita = false;
    }

    public void cambiarGenero(String nuevoGenero) 
    {
        genero = nuevoGenero;
    }

    public void cambiarDuracion(double nuevaDuracion) 
    {
        duracion = nuevaDuracion;
    }
}