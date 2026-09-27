package decorator;

public abstract class PedidoDecorator implements ComponentePedido {
    protected ComponentePedido pedido;
    public PedidoDecorator(ComponentePedido pedido) { this.pedido = pedido; }
}
