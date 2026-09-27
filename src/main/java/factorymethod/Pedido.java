package factorymethod;

public abstract class Pedido {
    protected String descripcion;
    public abstract double calcularCosto();
    public void mostrarPedido() {
        System.out.println(descripcion + " - Costo: $" + calcularCosto());
    }
}