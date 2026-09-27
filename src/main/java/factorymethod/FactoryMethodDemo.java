package factorymethod;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        PedidoFactory factory = new PedidoDeliveryFactory();
        Pedido pedido = factory.crearPedido();
        pedido.mostrarPedido();
    }
}
