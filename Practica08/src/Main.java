package practica08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GestorTienda tienda = new GestorTienda();

        tienda.cargarDatosPrueba();

        int opcion;

        do {
            System.out.println("----- MENU TIENDA -----");
            System.out.println("1. Mostrar productos");
            System.out.println("2. Buscar por codigo");
            System.out.println("3. Agregar producto");
            System.out.println("4. Actualizar producto");
            System.out.println("5. Eliminar producto");
            System.out.println("6. Ordenar por nombre");
            System.out.println("7. Ordenar por precio");
            System.out.println("8. Ordenar por stock");
            System.out.println("9. Filtrar por categoria");
            System.out.println("10. Busqueda compuesta");
            System.out.println("11. Mostrar categorias");
            System.out.println("12. Mostrar historial");
            System.out.println("13. Analizar tiempos");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                tienda.mostrarProductos();

            } else if (opcion == 2) {
                System.out.print("Codigo: ");
                String codigo = sc.nextLine();

                Producto p = tienda.buscarPorCodigo(codigo);

                if (p != null) {
                    System.out.println(p);
                } else {
                    System.out.println("No se encontro.");
                }

            } else if (opcion == 3) {
                System.out.print("Codigo: ");
                String codigo = sc.nextLine();

                System.out.print("Nombre: ");
                String nombre = sc.nextLine();

                System.out.print("Categoria: ");
                String categoria = sc.nextLine();

                System.out.print("Precio: ");
                double precio = sc.nextDouble();

                System.out.print("Stock: ");
                int stock = sc.nextInt();
                sc.nextLine();

                tienda.agregarProducto(new Producto(codigo, nombre, categoria, precio, stock));

            } else if (opcion == 4) {
                System.out.print("Codigo: ");
                String codigo = sc.nextLine();

                System.out.print("Nuevo precio: ");
                double precio = sc.nextDouble();

                System.out.print("Nuevo stock: ");
                int stock = sc.nextInt();
                sc.nextLine();

                tienda.actualizarProducto(codigo, precio, stock);

            } else if (opcion == 5) {
                System.out.print("Codigo: ");
                String codigo = sc.nextLine();

                tienda.eliminarProducto(codigo);

            } else if (opcion == 6) {
                tienda.ordenarPorNombre();
                tienda.mostrarProductos();

            } else if (opcion == 7) {
                tienda.ordenarPorPrecio();
                tienda.mostrarProductos();

            } else if (opcion == 8) {
                tienda.ordenarPorStock();
                tienda.mostrarProductos();

            } else if (opcion == 9) {
                System.out.print("Categoria: ");
                String categoria = sc.nextLine();

                tienda.filtrarPorCategoria(categoria);

            } else if (opcion == 10) {
                System.out.print("Categoria: ");
                String categoria = sc.nextLine();

                System.out.print("Precio maximo: ");
                double precioMax = sc.nextDouble();

                System.out.print("Stock minimo: ");
                int stockMin = sc.nextInt();
                sc.nextLine();

                tienda.busquedaCompuesta(categoria, precioMax, stockMin);

            } else if (opcion == 11) {
                tienda.mostrarCategorias();

            } else if (opcion == 12) {
                tienda.mostrarHistorial();

            } else if (opcion == 13) {
                tienda.analizarTiempoBusqueda("P010");
                tienda.analizarTiempoListado();

            } else if (opcion == 0) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opcion no valida.");
            }

        } while (opcion != 0);
    }
}