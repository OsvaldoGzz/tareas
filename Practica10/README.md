# Practica 10 - Programacion Concurrente

## Descripcion
En esta practica se trabajo con hilos en Java para simular un sistema concurrente.

## Dominio elegido
Se eligio un sistema de impresion compartida.

## Justificacion
Este dominio es un buen ejemplo porque varios usuarios pueden enviar trabajos al mismo tiempo a una impresora, lo que genera acceso concurrente a un recurso compartido.

La sincronizacion evita errores como que dos trabajos se mezclen o se pierdan.

## Funcionamiento
- Los usuarios generan trabajos de impresion (productores)
- La impresora procesa los trabajos (consumidor)
- Se usa un buffer compartido

## Hilos
- Se uso una clase que extiende Thread
- Se uso una clase que implementa Runnable

## Sincronizacion
Se utilizo:
- synchronized
- wait()
- notify()

para controlar el acceso al buffer.

## Productor-Consumidor
Se implemento usando una cola compartida donde:
- productores agregan trabajos
- consumidores los procesan

## ExecutorService
Se utilizo para ejecutar tareas en un pool de hilos.

## Logs
El programa imprime mensajes en consola para mostrar el comportamiento concurrente.

## Conclusion
La concurrencia permite ejecutar varias tareas al mismo tiempo, pero es necesario controlar el acceso a los recursos compartidos.