package modelo;

public class bebida extends producto {
    private boolean esAlcoholica;

    public bebida(String nombre, String id, double precio, boolean esAlcoholica) {
        super(nombre, id, precio);
        this.esAlcoholica = esAlcoholica;
    }

    @Override
    public double calcularPrecio() {
        if (esAlcoholica) {
            return getPrecio() * 1.15;
        }
        return getPrecio();
    }

    public boolean isEsAlcoholica() {
        return esAlcoholica;
    }

}
