package gympos.service;

import gympos.model.Membresia;
import java.util.HashMap;

public class NotificadorMembresias implements Runnable {

    private HashMap<String, Membresia> membresias;

    public NotificadorMembresias(HashMap<String, Membresia> membresias) {
        this.membresias = membresias;
    }

    @Override
    public void run() {
        revisarVencimientos();
    }

    public void revisarVencimientos() {
        for (String id : membresias.keySet()) {
            Membresia m = membresias.get(id);

            if (m.estaVencida()) {
                System.out.println("Aviso: membresia vencida para cliente " + id);
            } else {
                System.out.println("Membresia activa para cliente " + id);
            }
        }
    }
}