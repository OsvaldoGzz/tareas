# Practica 6 - Clases Abstractas e Interfaces

## Descripcion
En esta practica se trabajo con clases abstractas e interfaces en Java.

## Dominio elegido
Se eligio el dominio de dispositivos electronicos.

## Justificacion
Escogi este dominio porque es facil de entender y permite ver como diferentes dispositivos comparten algunas funciones pero no todas y es algo que utilizamos dia a dia.

## Estructura
- Dispositivo.java 
- Conectable.java
- Reproducible.java
- Cargable.java
- Celular.java
- Bocina.java
- Laptop.java
- GestorDispositivos.java
- Main.java

## Uso de clase abstracta
La clase Dispositivo contiene atributos comunes como marca, modelo y bateria, ademas de metodos generales.

## Interfaces
Se usaron tres interfaces:
- Conectable: para conexion a wifi
- Reproducible: para reproducir audio
- Cargable: para cargar bateria

## Combinaciones
- Celular: implementa Conectable, Reproducible y Cargable
- Bocina: implementa Reproducible y Cargable
- Laptop: implementa Conectable y Cargable

Estas combinaciones tienen sentido porque no todos los dispositivos hacen lo mismo.

## Polimorfismo
Se uso polimorfismo al guardar los dispositivos en un arreglo de tipo Dispositivo.

## Conclusion
Las interfaces ayudan a separar responsabilidades y la clase abstracta ayuda a reutilizar codigo.