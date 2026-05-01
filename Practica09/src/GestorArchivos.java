package practica09;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class GestorArchivos {

    private ArrayList<Contacto> contactos;

    public GestorArchivos() {
        contactos = new ArrayList<>();
    }

    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
        System.out.println("Contacto agregado.");
    }

    public void mostrarContactos() {
        for (Contacto c : contactos) {
            System.out.println(c);
        }
    }

    public void crearCarpeta(String nombre) {
        File carpeta = new File(nombre);

        if (carpeta.exists()) {
            System.out.println("La carpeta ya existe.");
        } else {
            if (carpeta.mkdir()) {
                System.out.println("Carpeta creada.");
            } else {
                System.out.println("No se pudo crear la carpeta.");
            }
        }
    }

    public void guardarTexto(String archivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (Contacto c : contactos) {
                bw.write(c.toString());
                bw.newLine();
            }
            System.out.println("Archivo de texto guardado.");
        } catch (IOException e) {
            System.out.println("Error al guardar texto.");
        }
    }

    public void leerTexto(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer texto.");
        }
    }

    public void guardarBinario(String archivo) {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(archivo))) {
            salida.writeObject(contactos);
            System.out.println("Archivo binario guardado.");
        } catch (IOException e) {
            System.out.println("Error al guardar binario.");
        }
    }

    public void cargarBinario(String archivo) {
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(archivo))) {
            contactos = (ArrayList<Contacto>) entrada.readObject();
            System.out.println("Archivo binario cargado.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar binario.");
        }
    }

    public void leerCSV(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                if (datos.length == 3) {
                    Contacto c = new Contacto(datos[0], datos[1], datos[2]);
                    contactos.add(c);
                }
            }

            System.out.println("CSV cargado.");

        } catch (IOException e) {
            System.out.println("Error al leer CSV.");
        }
    }

    public void crearBackup(String archivoOriginal) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
        String fecha = LocalDateTime.now().format(formato);

        File original = new File(archivoOriginal);
        File copia = new File("backup_" + fecha + "_" + archivoOriginal);

        try (BufferedInputStream entrada = new BufferedInputStream(new FileInputStream(original));
             BufferedOutputStream salida = new BufferedOutputStream(new FileOutputStream(copia))) {

            int dato;

            while ((dato = entrada.read()) != -1) {
                salida.write(dato);
            }

            System.out.println("Backup creado: " + copia.getName());

        } catch (IOException e) {
            System.out.println("Error al crear backup.");
        }
    }

    public void exportarJSON(String archivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {

            StringBuilder sb = new StringBuilder();

            sb.append("[\n");

            for (int i = 0; i < contactos.size(); i++) {
                Contacto c = contactos.get(i);

                sb.append("  {\n");
                sb.append("    \"nombre\": \"").append(c.getNombre()).append("\",\n");
                sb.append("    \"telefono\": \"").append(c.getTelefono()).append("\",\n");
                sb.append("    \"correo\": \"").append(c.getCorreo()).append("\"\n");
                sb.append("  }");

                if (i < contactos.size() - 1) {
                    sb.append(",");
                }

                sb.append("\n");
            }

            sb.append("]");

            bw.write(sb.toString());

            System.out.println("Archivo JSON exportado.");

        } catch (IOException e) {
            System.out.println("Error al exportar JSON.");
        }
    }

    public void crearCSVPrueba(String archivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            bw.write("Ana,8111111111,ana@gmail.com");
            bw.newLine();
            bw.write("Luis,8222222222,luis@gmail.com");
            bw.newLine();
            bw.write("Carlos,8333333333,carlos@gmail.com");
            bw.newLine();

            System.out.println("CSV de prueba creado.");
        } catch (IOException e) {
            System.out.println("Error al crear CSV.");
        }
    }
}