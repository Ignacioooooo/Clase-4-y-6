public class Main {
    public static void main(String[] args) {

  DescuentoFijo Fijo = new DescuentoFijo();
        Fijo.setValor(20);

 DescuentoPorcentual porcentual = new DescuentoPorcentual();
        porcentual.setValor(0.30f);



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
producto.setPrecio(120.20);
carrito.setProducto2(producto);

System.out.println("-" + producto.getNombre()+" " + "$" + producto.getPrecio());

Producto productoS = new Producto();
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

System.out.println("-" + productoT.getNombre() + " " + "$" + productoT.getPrecio());

carrito.setDescuento(porcentual);
System.out.println("Total a pagar:" + carrito.obtenerCostoFinal());
}
}