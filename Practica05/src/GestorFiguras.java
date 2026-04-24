package practica05;

public class GestorFiguras {

    private Figura[] figuras;
    private int contador;

    public GestorFiguras() {
        figuras = new Figura[10];
        contador = 0;
    }

    public void agregarFigura(Figura figura) {
        if (contador < figuras.length) {
            figuras[contador] = figura;
            contador++;
            System.out.println("Figura agregada");
        } else {
            System.out.println("Ya no caben mas figuras");
        }
    }

    public void mostrarTodas() {
        for (int i = 0; i < contador; i++) {
            figuras[i].procesarFigura();
        }
    }
}