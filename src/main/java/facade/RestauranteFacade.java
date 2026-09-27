package facade;

public class RestauranteFacade {
    private GestorStock stock = new GestorStock();
    private GestorCocina cocina = new GestorCocina();
    private GestorPago pago = new GestorPago();
    private GestorNotificacion notificacion = new GestorNotificacion();

    public void realizarPedido(double monto) {
        stock.verificarStock();
        cocina.enviarACocina();
        pago.procesarPago(monto);
        notificacion.notificarCliente();
        System.out.println("Pedido completado con éxito.");
    }

    public static void main(String[] args) {
        RestauranteFacade facade = new RestauranteFacade();
        facade.realizarPedido(1500);
    }
}