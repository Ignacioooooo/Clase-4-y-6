import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws NohayStockException{

  DescuentoFijo Fijo = new DescuentoFijo();
        Fijo.setValor(20);

 DescuentoPorcentual porcentual = new DescuentoPorcentual();
        porcentual.setValor(0.7f);



// Se creo un carrito
Carrito carrito = new Carrito();

Persona persona1 = new Persona();
//persona.setDocumento(44308904);
//persona.setEdad(20);
persona1.setNombre("Wailor");
carrito.setPersona(persona1);
System.out.println("El carrito pertenece a:"+ persona1.getNombre());

//Se creo un producto para carrito
Producto producto = new Producto();

System.out.println("Su carrito contiene:");

producto.setPeso(100);
producto.setNombre("Galletas");
producto.setPrecio(3000.20);
producto.setStock(4);
carrito.setProducto2(producto);

try{
System.out.println("-" + producto.getNombre()+" " + "$" + producto.getPrecio());
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

carrito.setDescuento(porcentual);
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