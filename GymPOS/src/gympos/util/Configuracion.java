package gympos.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuracion {

    private Properties propiedades;

    public Configuracion() {
        propiedades = new Properties();
    }

    public void crearConfiguracionInicial(String archivo) {
        propiedades.setProperty("nombre_gimnasio", "Gym Osvaldo");
        propiedades.setProperty("archivo_clientes", "data/clientes.dat");
        propiedades.setProperty("archivo_productos", "data/productos.dat");
        propiedades.setProperty("archivo_membresias", "data/membresias.dat");
        propiedades.setProperty("archivo_accesos", "data/accesos.dat");
        propiedades.setProperty("carpeta_reportes", "reports/");
        propiedades.setProperty("carpeta_backups", "backups/");

        try (FileOutputStream salida = new FileOutputStream(archivo)) {
            propiedades.store(salida, "Configuracion GymPOS");
            System.out.println("Configuracion creada.");
        } catch (IOException e) {
            System.out.println("Error al crear configuracion.");
        }
    }

    public void cargarConfiguracion(String archivo) {
        try (FileInputStream entrada = new FileInputStream(archivo)) {
            propiedades.load(entrada);
            System.out.println("Configuracion cargada.");
        } catch (IOException e) {
            System.out.println("No se pudo cargar configuracion.");
        }
    }

    public String obtener(String clave) {
        return propiedades.getProperty(clave);
    }
}