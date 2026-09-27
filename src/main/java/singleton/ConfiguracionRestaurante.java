package singleton;

public class ConfiguracionRestaurante {
    private static ConfiguracionRestaurante instancia;
    private String nombreRestaurante;
    private double descuentoDelivery;

    private ConfiguracionRestaurante() {
        this.nombreRestaurante = "Sabores Express";
        this.descuentoDelivery = 0.05;
    }

    public static ConfiguracionRestaurante getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionRestaurante();
        }
        return instancia;
    }

    public String getNombreRestaurante() { return nombreRestaurante; }
    public double getDescuentoDelivery() { return descuentoDelivery; }

    public static void main(String[] args) {
        ConfiguracionRestaurante c1 = ConfiguracionRestaurante.getInstancia();
        ConfiguracionRestaurante c2 = ConfiguracionRestaurante.getInstancia();
        System.out.println("¿Son la misma instancia? " + (c1 == c2));
    }
}