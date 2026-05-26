import modelo.*;

public class App {
    public static void main(String[] args) {
        // crear productos

        producto p1 = new platillo("Hamburguesa", "001", 10.0, "Entrada");
        producto p2 = new platillo("Perro caliente", "002", 8.0, "Entrada");
        producto p3 = new platillo("Ensalada", "003", 12.0, "Entrada");

        // crear cliente

        cliente c1 = new cliente("Juan Perez", "555-123-4567");

        // crear pedido

        pedido pedido1 = new pedido(c1);
        pedido1.agregarProducto(p1);
        pedido1.agregarProducto(p2);
        pedido1.agregarProducto(p3);

        // mostrar total

        System.out.println("Cliente: " + pedido1.getCliente().getNombre());
        System.out.println("Total del pedido: $" + pedido1.calcularTotal());

        // crear venta

        venta venta1 = new venta(pedido1);

        System.out.println("Fecha de la venta: " + venta1.getFecha());
        System.out.println("Total de la venta: $" + venta1.getTotal());
    }
}