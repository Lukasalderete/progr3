package adapter;

public class MercadoPagoAdapter implements IPagador {
    private MercadoPagoAPI mercadoPago;
    public MercadoPagoAdapter(MercadoPagoAPI mercadoPago) { this.mercadoPago = mercadoPago; }
    public void pagar(double monto) {
        mercadoPago.realizarCobro(monto * 100);
    }
}
