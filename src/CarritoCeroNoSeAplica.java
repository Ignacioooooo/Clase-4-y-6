public class CarritoCeroNoSeAplica  extends Exception{
    public CarritoCeroNoSeAplica(){
        super("No se puede aplicar descuentos a importes cero");
    }
}
