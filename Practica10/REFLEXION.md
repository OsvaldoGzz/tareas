# Reflexion

## 1. Race condition

Una race condition ocurre cuando varios hilos acceden a un recurso al mismo tiempo.

En este caso podria pasar si varios usuarios agregan trabajos sin control.


## 2. synchronized

Synchronized evita que varios hilos accedan al mismo tiempo.

Su desventaja es que puede hacer el programa mas lento si hay muchos hilos esperando.


## 3. sleep vs wait

Thread.sleep pausa el hilo por un tiempo.

wait hace que el hilo espere hasta que otro lo despierte.

Se usan en situaciones diferentes.