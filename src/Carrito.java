public class Carrito {
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Producto getProducto1() {
        return producto1;
    }

    public void setProducto1(Producto producto1) {
        this.producto1 = producto1;
    }

    public Producto getProducto2() {
        return producto2;
    }

    public void setProducto2(Producto producto2) {
        this.producto2 = producto2;
    }

    public Producto getProducto3() {
        return producto3;
    }

    public void setProducto3(Producto producto3) {
        this.producto3 = producto3;
    }

    public Descuento getDescuento() {
        return descuento;
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    private Persona persona;
    private Producto producto1;

    private Producto producto2;
    private Producto producto3;

 private Descuento descuento;



public float obtenerCostoFinal(){

    float Original = 0;
    if(producto1 != null){
        Original+= producto1.getPrecio(); }

    if(producto2 != null){
        Original+= producto2.getPrecio();}

    if(producto3 != null){
        Original+= producto3.getPrecio();}
    //return base;
  return Original - descuento.obtenerDescuento(Original);
}

}