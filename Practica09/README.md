# Practica 9 - Entrada/Salida en Java

## Descripcion
En esta practica se trabajo con manejo de archivos en Java, incluyendo lectura y escritura de texto, archivos binarios y uso de directorios.

## Dominio elegido
Se eligio el dominio de una agenda de contactos ya que es algo simulado como para el telefono.

## Justificacion
Escogi este dominio porque es facil de entender y permite trabajar con archivos de forma sencilla, como guardar y leer contactos que es algo simulado a un telefono.

## Funcionalidades implementadas

- Guardar y leer archivos de texto
- Guardar y cargar objetos en archivos binarios
- Lectura de archivos CSV
- Creacion de carpetas
- Backup automatico con fecha
- Exportacion a formato JSON

## Clase serializable
La clase Contacto implementa Serializable para poder guardar objetos completos en archivos binarios.

## CSV
Se creo un archivo CSV de prueba con contactos y se lee para agregarlos al sistema.

## Backup
Se genera automaticamente un archivo con fecha y hora para evitar sobrescribir datos.

## Exportacion alternativa
Se implemento exportacion a JSON usando StringBuilder.

Esto es util cuando se quiere usar los datos en aplicaciones web o APIs, ya que JSON es un formato muy usado.

## Archivos generados

- contactos.txt
- contactos.dat
- contactos.csv
- contactos.json
- backup_fecha_contactos.txt

## Conclusion
El manejo de archivos permite guardar informacion de forma persistente y reutilizar datos en diferentes formatos.