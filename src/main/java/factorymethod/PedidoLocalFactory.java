package factorymethod;

public class PedidoLocalFactory extends PedidoFactory {
    public Pedido crearPedido() { return new PedidoLocal(); }
}
