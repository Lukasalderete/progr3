package decorator;

public class PedidoBase implements ComponentePedido {
    public String getDescripcion() { return "Milanesa con papas"; }
    public double getCosto() { return 1500; }
}
