package modelo;

import java.util.ArrayList;

public class pedido {
    private ArrayList<producto> productos;
    private cliente cliente;

    public pedido(cliente cliente) {
        this.productos = new ArrayList<>();
        this.cliente = cliente;
    }
    
    public void agregarProducto(producto p) {
        productos.add(p);
    }

    public double calcularTotal() {
        double total = 0;
        for (producto p : productos) {
            total += p.calcularPrecio(); // polimorfismo
        }
        return total;
    }

    public ArrayList<producto> getproductos() {
        return productos;
    }

    public cliente getCliente() {
        return cliente;
    }

}
