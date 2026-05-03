package practica10;

import java.util.LinkedList;
import java.util.Queue;

public class BufferImpresion {

    private Queue<TrabajoImpresion> cola;
    private int capacidad;

    public BufferImpresion(int capacidad) {
        this.capacidad = capacidad;
        cola = new LinkedList<>();
    }

    public synchronized void producir(TrabajoImpresion trabajo) {
        while (cola.size() == capacidad) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Productor interrumpido");
            }
        }

        cola.add(trabajo);
        System.out.println("Trabajo agregado: " + trabajo);

        notify();
    }

    public synchronized TrabajoImpresion consumir() {
        while (cola.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Consumidor interrumpido");
            }
        }

        TrabajoImpresion trabajo = cola.poll();
        System.out.println("Trabajo tomado por impresora: " + trabajo);

        notify();

        return trabajo;
    }
}