package practica07;

public class StockInsuficienteException extends InventarioException {

    private int stockDisponible;
    private int cantidadSolicitada;

    public StockInsuficienteException(int stockDisponible, int cantidadSolicitada) {
        super("Stock insuficiente. Disponible: " + stockDisponible + ", solicitado: " + cantidadSolicitada);
        this.stockDisponible = stockDisponible;
        this.cantidadSolicitada = cantidadSolicitada;
    }

    public int getStockDisponible() {
        return stockDisponible;
    }

    public int getCantidadSolicitada() {
        return cantidadSolicitada;
    }
}