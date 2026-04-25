# Reflexion

## 1. Clase abstracta vs interfaz

Usaria una clase abstracta cuando quiero compartir codigo entre varias clases .
Usaria una interfaz cuando quiero definir comportamiento sin implementar codigo.


## 2. Multiples interfaces

Una clase si puede implementar varias interfaces.
Java permite esto porque evita problemas de herencia multiple.


## 3. Agregar metodo a interfaz

Si agrego un metodo nuevo, todas las clases que implementan esa interfaz se ven afectadas.
Se puede usar un metodo default para evitar errores y no tener que modificar todas las clases.