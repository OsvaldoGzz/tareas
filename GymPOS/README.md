# GymPOS - Sistema de Punto de Venta para Gimnasio

## Descripcion
GymPOS es un sistema basico para administrar un gimnasio.

El sistema permite manejar clientes, membresias, pagos, inventario, accesos y reportes.

## Nombre del gimnasio
Gym Osvaldo

## Modulos principales

- GestionClientes: administra clientes
- SistemaMembresias: administra membresias
- ProcesadorPagos: simula pagos
- GeneradorReportes: genera reportes TXT
- ControlAcceso: registra entradas y salidas
- InventarioEquipos: administra equipos del gimnasio

## Arquitectura
Se uso una estructura MVC:

- model: clases principales del sistema
- view: interfaz grafica
- controller: comunica la vista con los servicios
- service: logica del sistema
- persistence: guardado y carga de datos
- exception: excepciones personalizadas
- util: configuracion y datos de prueba

## Conceptos aplicados

- Programacion orientada a objetos
- Herencia y clases abstractas
- Polimorfismo
- Excepciones personalizadas
- Serializacion
- Colecciones
- JavaFX
- Multithreading
- Manejo de archivos

## Persistencia
Se uso serializacion para guardar clientes, productos, membresias y accesos.

## Multithreading
Se usaron hilos para generar reportes, backups y revisar vencimientos.

## Excepciones
Se crearon excepciones personalizadas para clientes invalidos, pagos rechazados y membresias vencidas.

## Datos de prueba
El sistema incluye datos de prueba para clientes, inventario y clases grupales.

## Conclusión
Este proyecto integra los temas vistos durante el semestre en una aplicacion completa.