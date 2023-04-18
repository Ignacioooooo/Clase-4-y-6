public class NohayStockException extends Exception {
    private final Producto producto;

    public NohayStockException (Producto producto){
        this.producto = producto;
    }
}
