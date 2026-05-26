package modelo;

import java.util.Date;

public class venta {
    private pedido pedido;
    private Date fecha;

    public venta(pedido pedido) {
        this.pedido = pedido;
        this.fecha = new Date(); // fecha actual
    }

    public double getTotal() {
        return pedido.calcularTotal();
    }

    public Date getFecha() {
        return fecha;
    }
}
