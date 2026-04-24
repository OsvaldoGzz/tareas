package practica05;

public class Main {
    public static void main(String[] args) {

        Figura[] figuras = new Figura[3];

        figuras[0] = new Circulo(5);
        figuras[1] = new Rectangulo(4, 8);
        figuras[2] = new Triangulo(6, 3, 5, 5, 6);

        System.out.println("Array polimorfico:");
        for (int i = 0; i < figuras.length; i++) {
            figuras[i].procesarFigura();
        }

        GestorFiguras gestor = new GestorFiguras();

        gestor.agregarFigura(new Circulo(3));
        gestor.agregarFigura(new Rectangulo(5, 2));
        gestor.agregarFigura(new Triangulo(4, 4, 4, 4, 4));

        System.out.println("Figuras en el gestor:");
        gestor.mostrarTodas();

        Figura figura = new Circulo(10);

        if (figura instanceof Circulo) {
            Circulo c = (Circulo) figura;
            c.cambiarRadio(7, true);
            c.procesarFigura();
        }
    }
}