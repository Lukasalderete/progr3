package decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        ComponentePedido pedido = new PedidoBase();
        pedido = new ConBebidaDecorator(pedido);
        pedido = new ConPostreDecorator(pedido);
        System.out.println(pedido.getDescripcion() + " - $" + pedido.getCosto());
    }
}
