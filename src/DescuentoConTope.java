public class DescuentoConTope extends Descuento{
    @Override
    public float obtenerDescuento(float valorBase) {
       int i = 1000;
       if(getValor()<i){
           System.out.println("Descuento aprobado");
       }
       else if(getValor()>i){
           System.out.println("No se aprueba el descuento, vuelva a introducir un descuento");
           return valorBase;
       }
        return this.getValor();
    }

    @Override
    public float obtenerValorFinal(float ValorBase) {
        return ValorBase - this.obtenerValorFinal(ValorBase);
    }
}
