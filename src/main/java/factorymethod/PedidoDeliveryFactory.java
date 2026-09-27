package factorymethod;

public class PedidoDeliveryFactory extends PedidoFactory {
    public Pedido crearPedido() { return new PedidoDelivery(); }
}