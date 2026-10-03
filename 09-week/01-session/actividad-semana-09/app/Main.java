package app;

import modelo.Pedido;
import modelo.Producto;
import servicio.PedidoService;

public class Main {

    public static void main(String[] args) {

        // Crear los productos
        Producto producto1 = new Producto("Laptop", 2500000);
        Producto producto2 = new Producto("Mouse", 80000);
        Producto producto3 = new Producto("Teclado", 150000);

        // Crear el pedido y agregar los productos
        Pedido pedido = new Pedido();

        pedido.agregar(producto1);
        pedido.agregar(producto2);
        pedido.agregar(producto3);

        System.out.println("===== PRODUCTOS DEL PEDIDO =====");

        for (Producto producto : pedido.getProductos()) {
            System.out.println(producto);
        }

        System.out.println();
        System.out.println("===== TOTALES =====");

        System.out.println("Subtotal: $" + pedido.total());

        // Servicio con descuento del 10%
        PedidoService servicio = new PedidoService(10);

        System.out.println(
            "Descuento: $" + servicio.calcularDescuento(pedido)
        );

        System.out.println(
            "Total final: $" + servicio.totalFinal(pedido)
        );
    }
}