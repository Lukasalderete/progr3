package factorymethod;

public class PedidoDelivery extends Pedido {
    public PedidoDelivery() { descripcion = "Pedido a domicilio"; }
    public double calcularCosto() { return 1500 + 300; }
}