package modelo;

public class platillo extends producto {
    private String tipo; // Ejemplo: "Entrada", "Plato Principal", "Postre"

    public platillo(String nombre, String id, double precio, String tipo) {
        super(nombre, id, precio);
        this.tipo = tipo;
    }
    
    @Override
    public double calcularPrecio() {
        return getPrecio() * 1.10; // 10% extra (ejemplo)
    }

    public String getTipo() {
        return tipo;
    }
}
