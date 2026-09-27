package abstractfactory;

public class MenuTradicionalFactory implements MenuFactory {
    public Plato crearPlato() { return new PlatoTradicional(); }
    public Bebida crearBebida() { return new BebidaTradicional(); }
}