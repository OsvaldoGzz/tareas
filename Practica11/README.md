# Practica 11 - JavaFX

## Descripcion
En esta practica se desarrollo una interfaz grafica usando JavaFX para gestionar productos.

## Dominio elegido
Se eligio el dominio de productos de tienda.

## Justificacion
Este dominio es adecuado porque permite implementar CRUD, tablas y formularios de manera sencilla.

## Funcionalidades

- Agregar productos
- Actualizar productos
- Eliminar productos
- Mostrar productos en una tabla
- Filtrar productos en tiempo real

## Tabla dinamica
Se utilizo TableView para mostrar los datos.

## Filtrado interactivo
Se uso FilteredList y SortedList para actualizar la tabla en tiempo real segun lo que escribe el usuario.

El filtro busca coincidencias en:
- nombre
- categoria

## Componentes personalizados
Se crearon:
- CampoTextoValidado
- BotonPrincipal

## Eventos
Se usaron eventos de:
- mouse (seleccion en tabla)
- teclado (validacion en tiempo real)

## Validacion
Se valida que:
- los campos no esten vacios
- el precio sea mayor a 0
- el stock no sea negativo

## CSS
Se uso un archivo externo para estilos.

## Dialogos
Se utilizo Alert para mostrar mensajes.

## Conclusion
JavaFX permite crear interfaces graficas completas con eventos, validacion y manejo de datos.