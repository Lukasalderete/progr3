package factorymethod;

public class PedidoLocal extends Pedido {
    public PedidoLocal() { descripcion = "Pedido para retirar en el local"; }
    public double calcularCosto() { return 1500; }
}