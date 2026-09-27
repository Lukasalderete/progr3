package adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        IPagador pagador = new MercadoPagoAdapter(new MercadoPagoAPI());
        pagador.pagar(1500);
    }
}
