# Practica 5 - Polimorfismo

## Descripcion
En esta practica se trabajo con polimorfismo en Java usando interfaces, clases abstractas y clases concretas y asi hacer el programa de figuras.

## Dominio elegido
Se eligio el dominio de figuras geometricas ya que es algo que vemos desde hace mucho y es algo facil de utilizar.

## Justificacion
Escogi este dominio porque es facil de entender y permite aplicar calculos como area y perimetro de diferentes formas dependiendo de la figura y es algo que ya llevamos viendo mucho tiempo.

## Estructura
- Calculable.java
- Figura.java 
- Circulo.java
- Rectangulo.java
- Triangulo.java
- GestorFiguras.java
- Main.java

## Uso de interfaz
Se uso la interfaz Calculable para definir los metodos calcularArea y calcularPerimetro de las figuras.

## Clase abstracta
La clase Figura define metodos comunes y un metodo abstracto.

## Template Method
Se creo el metodo procesarFigura() en la clase Figura, que llama internamente a otros metodos.
Esto ayuda a no repetir codigo en cada clase hija.

## Polimorfismo
Se uso polimorfismo al guardar diferentes figuras en un arreglo de tipo Figura en el programa.

## Sobrecarga
Cada clase tiene metodos sobrecargados para modificar sus datos .

## Casting e instanceof
Se uso instanceof para verificar el tipo antes de hacer casting y evitar errores en el programa.