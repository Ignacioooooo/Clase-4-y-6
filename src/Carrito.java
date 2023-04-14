public class Carrito {
    private int CantidadProductos;



    public int getCantidadProductos() {
        return CantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.CantidadProductos = cantidadProductos;
    }

    public float agregarProductoAlCarrito() {
  Producto producto1 = new Producto();
  producto1.setPrecio(299.1);
  producto1.setNombre("Leche");
  producto1.setPeso(3);
  Producto producto2 = new Producto();
  producto1.setPrecio(400.1);
  producto1.setNombre("Azúcar");
  producto1.setPeso(3);

  Producto producto3 = new Producto();
  producto1.setPrecio(1000.1);
  producto1.setNombre("Galletas");
  producto1.setPeso(3);

float base = 0;
if(producto1 !=null){
    base += producto1.getPrecio();}
if(producto2 !=null){
    base += producto2.getPrecio();}
if(producto3 !=null){
    base += producto3.getPrecio();}

return base;
    }


}