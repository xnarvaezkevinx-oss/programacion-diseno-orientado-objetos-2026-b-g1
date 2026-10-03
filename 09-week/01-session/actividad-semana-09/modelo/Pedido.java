package modelo;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Producto> productos;

    public Pedido() {
        productos = new ArrayList<>();
    }

    public void agregar(Producto producto) {
        productos.add(producto);
    }

    public double total() {
        double total = 0;

        for (Producto producto : productos) {
            total += producto.getPrecio();
        }

        return total;
    }

    public List<Producto> getProductos() {
        return productos;
    }
}