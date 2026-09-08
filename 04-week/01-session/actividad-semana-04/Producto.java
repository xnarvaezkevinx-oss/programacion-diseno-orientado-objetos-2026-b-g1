import java.util.Objects;

public class Producto {
    private final int codigo;
    private String nombre;
    private double precio;
    private int stock;

    // Constructor completo
    public Producto(int codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        
        if (precio >= 0) {
            this.precio = precio;
        } else {
            this.precio = 0;
        }

        if (stock >= 0) {
            this.stock = stock;
        } else {
            this.stock = 0;
        }

        this.nombre = nombre;
    }

    // Constructor con codigo y nombre
    public Producto(int codigo, String nombre) {
        this(codigo, nombre, 0, 0);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Producto)) {
            return false;
        }

        Producto producto = (Producto) o;
        return codigo == producto.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}