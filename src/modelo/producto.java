package modelo;

public abstract class producto {
    private String nombre;
    private String id;
    private double precio;

    public producto(String nombre, String id, double precio) {
        this.nombre = nombre;
        this.id = id;
        this.precio = precio;
    }

    public double calcularPrecio() {
        return precio;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
