package practica07;

public class ProductoNoEncontradoException extends InventarioException {

    public ProductoNoEncontradoException(String codigo) {
        super("No se encontro el producto con codigo: " + codigo);
    }
}