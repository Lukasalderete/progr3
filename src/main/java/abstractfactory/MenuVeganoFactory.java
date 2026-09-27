package abstractfactory;

public class MenuVeganoFactory implements MenuFactory {
    public Plato crearPlato() { return new PlatoVegano(); }
    public Bebida crearBebida() { return new BebidaVegana(); }
}