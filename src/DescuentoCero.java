public class DescuentoCero extends Descuento {
    @Override
    public float obtenerDescuento(float valorBase) {
        return valorBase;
    }

    @Override
    public float obtenerValorFinal(float ValorBase) {
        return ValorBase;
    }
}
