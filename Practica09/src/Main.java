package practica09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GestorArchivos gestor = new GestorArchivos();

        int opcion;

        do {
            System.out.println("----- MENU AGENDA -----");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Mostrar contactos");
            System.out.println("3. Crear carpeta");
            System.out.println("4. Guardar texto");
            System.out.println("5. Leer texto");
            System.out.println("6. Guardar binario");
            System.out.println("7. Cargar binario");
            System.out.println("8. Crear CSV de prueba");
            System.out.println("9. Leer CSV");
            System.out.println("10. Crear backup");
            System.out.println("11. Exportar JSON");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();

                System.out.print("Telefono: ");
                String telefono = sc.nextLine();

                System.out.print("Correo: ");
                String correo = sc.nextLine();

                gestor.agregarContacto(new Contacto(nombre, telefono, correo));

            } else if (opcion == 2) {
                gestor.mostrarContactos();

            } else if (opcion == 3) {
                gestor.crearCarpeta("archivos");

            } else if (opcion == 4) {
                gestor.guardarTexto("contactos.txt");

            } else if (opcion == 5) {
                gestor.leerTexto("contactos.txt");

            } else if (opcion == 6) {
                gestor.guardarBinario("contactos.dat");

            } else if (opcion == 7) {
                gestor.cargarBinario("contactos.dat");

            } else if (opcion == 8) {
                gestor.crearCSVPrueba("contactos.csv");

            } else if (opcion == 9) {
                gestor.leerCSV("contactos.csv");

            } else if (opcion == 10) {
                gestor.crearBackup("contactos.txt");

            } else if (opcion == 11) {
                gestor.exportarJSON("contactos.json");

            } else if (opcion == 0) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opcion no valida.");
            }

        } while (opcion != 0);
    }
}