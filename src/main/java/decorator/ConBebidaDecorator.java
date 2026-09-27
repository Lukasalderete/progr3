package decorator;

public class ConBebidaDecorator extends PedidoDecorator {
    public ConBebidaDecorator(ComponentePedido pedido) { super(pedido); }
    public String getDescripcion() { return pedido.getDescripcion() + " + bebida"; }
    public double getCosto() { return pedido.getCosto() + 300; }
}