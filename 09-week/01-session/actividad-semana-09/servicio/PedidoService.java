package servicio;

import modelo.Pedido;

public class PedidoService {

    private double porcentajeDescuento;

    public PedidoService(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public double calcularDescuento(Pedido pedido) {
        return pedido.total() * porcentajeDescuento / 100;
    }

    public double totalFinal(Pedido pedido) {
        return pedido.total() - calcularDescuento(pedido);
    }
}