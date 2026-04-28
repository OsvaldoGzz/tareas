# Practica 7 - Manejo de Excepciones

## Descripcion
En esta practica se trabajo con excepciones personalizadas en Java para controlar errores dentro de un sistema de inventario de una tienda.

## Dominio elegido
Se eligio el dominio de productos e inventario ya que es algo facil de utilizar, como si fuera una tienda.

## Justificacion
Escogi este dominio porque es facil generar errores reales como productos que no existen, precios invalidos o falta de stock que suele pasar en una tienda.

## Jerarquia de excepciones
Se creo una clase padre llamada:

- InventarioException

Y tres clases hijas:

- ProductoNoEncontradoException
- StockInsuficienteException
- PrecioInvalidoException

## Excepcion con informacion adicional
La excepcion StockInsuficienteException guarda informacion extra:

- stock disponible
- cantidad solicitada

Esto ayuda a saber exactamente que causo el error.

En un sistema real esto serviria para detectar problemas mas rapido.

## Clase de negocio
La clase InventarioService se encarga de:

- agregar productos
- buscar productos
- vender productos
- cambiar precios
- manejar errores

## Try with resources
Se uso en el metodo guardarLog() para escribir automaticamente en el archivo errores.log.

Esto evita cerrar manualmente el archivo.

## Archivo de log
Cuando ocurre un error se guarda informacion en:

errores.log

## Pruebas
Se creo la clase PruebaExcepciones para probar todos los errores y mostrarlos.