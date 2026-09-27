package adapter;

public class MercadoPagoAPI {
    public void realizarCobro(double montoEnCentavos) {
        System.out.println("Cobro procesado por Mercado Pago: $" + (montoEnCentavos / 100));
    }
}
