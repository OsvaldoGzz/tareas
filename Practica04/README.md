# Practica 4 - Herencia en Java

## Descripcion
En esta practica se trabajo con herencia en Java creando una jerarquia de clases para el proyecto.

## Dominio elegido
Se eligio el dominio de vehiculos.

## Justificacion
Escogi este dominio porque es facil de entender y se puede ver claramente como varios tipos de vehiculos comparten caracteristicas pero tambien tienen comportamientos diferentes y a parte es interesante ver como depende aunque todos son vehiculos.

## Estructura
- Vehiculo.java 
- Auto.java
- Moto.java
- Camion.java
- AutoElectrico.java
- Garage.java
- Main.java

## Uso de herencia
Se utilizo herencia para evitar repetir codigo como marca, modelo y velocidad y asi simplificar el codigo.

## Polimorfismo
Se uso polimorfismo al guardar diferentes tipos de vehiculos en el arreglo de Vehiculo en la clase Garage .

## Uso de super()
Se utilizo super() en los constructores para inicializar los atributos de la clase  que es vehiculo.

## Problema encontrado
Un problema fue que algunas clases no necesitaban todos los atributos del padre, lo que puede hacer el diseño menos flexible y a la vez ams dificil de moldear.
Para solucionarlo, se mantuvieron solo atributos generales en la clase Vehiculo para asi generalizar todo.