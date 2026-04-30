# Practica 8 - Colecciones en Java

## Descripcion
En esta practica se trabajo con diferentes colecciones de Java para manejar un sistema de productos de una tienda.

## Dominio elegido
Se eligio el dominio de tienda de productos ya que es algo facil de usar.

## Justificacion de colecciones

- ArrayList: se uso para almacenar los productos porque permite acceso rapido por indice.
- LinkedList: se uso para guardar el historial de acciones, ya que es facil agregar elementos.
- HashMap: se uso para buscar productos por codigo de forma rapida.
- HashSet: se uso para guardar categorias sin repetir.

## Clase de dominio
La clase Producto implementa Comparable para ordenar por nombre.

## Comparator
Se crearon dos comparadores:
- ComparadorPrecio: ordena por precio
- ComparadorStock: ordena por stock

## CRUD
Se implementaron operaciones:
- agregar
- buscar
- actualizar
- eliminar

## Streams
Se usaron para:
- filtrar por categoria
- busqueda compuesta

## Busqueda compuesta
Se implemento una busqueda que combina:
- categoria
- precio maximo
- stock minimo

Esto es util para encontrar productos especificos.

## Iteradores
Se uso Iterator para recorrer la lista de productos.

## Datos de prueba
Se agregaron 15 productos automaticamente.

## Analisis de tiempo
Se midio el tiempo de:
- busqueda con HashMap
- recorrido con ArrayList

## Conclusion
Las colecciones permiten organizar mejor los datos y hacer operaciones mas eficientes.