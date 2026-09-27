package abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        MenuFactory factory = new MenuVeganoFactory();
        Plato plato = factory.crearPlato();
        Bebida bebida = factory.crearBebida();
        System.out.println(plato.getNombre() + " + " + bebida.getNombre());
    }
}