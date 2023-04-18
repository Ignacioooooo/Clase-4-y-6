import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws NohayStockException{

  DescuentoFijo Fijo = new DescuentoFijo();
        Fijo.setValor(20);

 DescuentoPorcentual porcentual = new DescuentoPorcentual();
        porcentual.setValor(0.7f);

        DescuentoConTope tope = new DescuentoConTope();
        tope.setValor(200);


// Se creo un carrito
Carrito carrito = new Carrito();

Persona persona1 = new Persona();
persona1.setDocumento(44308904);
persona1.setEdad(20);
persona1.setNombre("Wailor");
carrito.setPersona(persona1);
System.out.println("El carrito pertenece a:"+ carrito.toString());

//Se creo un producto para carrito
Producto producto1 = new Producto();

System.out.println("Su carrito contiene:");

producto1.setPeso(100);
producto1.setNombre("Galletas");
producto1.setPrecio(3000.20);
producto1.setStock(4);
carrito.agregarProductos(producto1);

try{
System.out.println("-" + carrito.getProductos()+" " + "$" + producto1.getPrecio());
}
catch ( NohayStockException e){
    System.out.println("No hay stock de al menos un producto");
}

/*Producto productoS = new Producto();
productoS.setPeso(1);
productoS.setNombre("Azúcar");
productoS.setPrecio(200);
carrito.setProducto1(productoS);

System.out.println("-" + productoS.getNombre()+" " + "$" + productoS.getPrecio());

Producto productoT = new Producto();
productoT.setPeso(1);
productoT.setNombre("Leche");
productoT.setPrecio(270);
carrito.setProducto3(productoT);

System.out.println("-" + productoT.getNombre() + " " + "$" + productoT.getPrecio());*/
carrito.setDescuento(tope);
//carrito.setDescuento(porcentual);
try{
System.out.println("Total a pagar:" + carrito.obtenerCostoFinal());
}
catch ( NohayStockException e){
System.out.println("No se pudo calcular el total");
}
catch (CarritoCeroNoSeAplica e){
    System.out.println(e.getMessage());
}
catch (Descuentonegativo e){
    System.out.println(e.getMessage());
}



    }}