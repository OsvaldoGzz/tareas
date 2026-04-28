package practica07;

public class PrecioInvalidoException extends InventarioException {

    public PrecioInvalidoException(double precio) {
        super("Precio invalido: " + precio);
    }
}