public class Producto {
  private String nombre;
    private double precio;
    private float peso;
    private Integer stock;
    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
       this.nombre=nombre;
    }

    public double getPrecio() throws NohayStockException{
        if(stock == 0){
            throw new NohayStockException(this);
        }
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String toString(){
        return nombre;
    }
}
