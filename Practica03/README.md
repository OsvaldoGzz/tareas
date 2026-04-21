# Practica 3 - Encapsulamiento

## Descripcion
En esta practica se trabajo con encapsulamiento en Java usando atributos privados, getters y setters.

## Dominio elegido
Elegi trabajar con productos e inventario de una tienda para poder utilizarlo de buena manera.

## Justificacion
Escogi este ejemplo porque es algo facil de entender y se puede aplicar en situaciones reales, como una tienda y son cosas que nosotros vemos todos los dias .

## Validaciones implementadas
El codigo del producto debe tener 3 letras mayusculas y 3 numeros .
El precio debe ser mayor a 0 y no pasar de cierto limite para que este regulado y no permita dinero que no es real.
El stock no puede ser negativo siempre tiene que ser positivo o 0.

## Por que son importantes
Estas validaciones ayudan a evitar errores en los datos y hacen que el programa sea mas confiable y que sea mejor para cuando lo implementamos sea mas un ejemplo real.

## Estructura
- Producto.java: contiene los atributos y validaciones
- Inventario.java: guarda los productos
- Main.java: donde se prueba el programa