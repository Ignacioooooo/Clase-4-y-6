import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private Persona persona;
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString(){
        return  getPersona().getNombre() + ", edad:" + getPersona().getEdad() + ", documento:" + getPersona().getDocumento();
    }


    //constructor de carrito
private List<Producto>productos;
    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    public Carrito(){
this.productos = new ArrayList<Producto>();
        descuento = new DescuentoCero();
    }
    public void agregarProductos(Producto p){
        this.productos.add(p);
    }
    public void quitarProductos (Producto p){
        this.productos.remove(p);
    }


  /* private Producto producto1;
    public Producto getProducto1() {
        return producto1;
    }

    public void setProducto1(Producto producto1) {
        this.producto1 = producto1;
    }
    private Producto producto2;
    public Producto getProducto2() {
        return producto2;
    }

    public void setProducto2(Producto producto2) {
        this.producto2 = producto2;
    }
    private Producto producto3;
    public Producto getProducto3() {
        return producto3;
    }

    public void setProducto3(Producto producto3) {
        this.producto3 = producto3;
    }*/
    private Descuento descuento;
    public Descuento getDescuento() {
        return descuento;
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

public float obtenerCostoFinal() throws NohayStockException, CarritoCeroNoSeAplica, Descuentonegativo{

    float Original = 0;
     for(Producto pro: this.productos){
         float preciopro = (float) pro.getPrecio();
         Original = preciopro;
     }

   /* if(producto1 != null){
        Original+= producto1.getPrecio(); }

    if(producto2 != null){
        Original+= producto2.getPrecio();}

    if(producto3 != null){
        Original+= producto3.getPrecio();}*/

    if(Original == 0){
throw new CarritoCeroNoSeAplica();
    }

    if( Original - descuento.obtenerDescuento(Original) < 0){
        throw new Descuentonegativo();
    }

    //return base;
  return Original - descuento.obtenerDescuento(Original);
}
}
