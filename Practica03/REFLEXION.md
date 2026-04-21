# Reflexion

## 1. Por que usamos private

Se usan private para evitar que los datos se cambien directamente.
Asi obligamos a usar setters y podemos controlar mejor los valores y hacer las validaciones bien.


## 2. Diferencia entre private, protected y public

Private solo se usa dentro de la clase.
Protected se puede usar dentro del mismo paquete o clases relacionadas.
Public se puede usar en cualquier parte.

## 3. Validacion en setters

Agregue una validacion en el codigo del producto.
Si no cumple el formato, no se guarda y muestra un mensaje.

Esto ayuda a que el programa no tenga datos incorrectos y todo lo que esye bajo mis ordenes, se cumplan.