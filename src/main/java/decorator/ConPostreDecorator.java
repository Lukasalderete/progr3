package decorator;

public class ConPostreDecorator extends PedidoDecorator {
    public ConPostreDecorator(ComponentePedido pedido) { super(pedido); }
    public String getDescripcion() { return pedido.getDescripcion() + " + postre"; }
    public double getCosto() { return pedido.getCosto() + 400; }
}
