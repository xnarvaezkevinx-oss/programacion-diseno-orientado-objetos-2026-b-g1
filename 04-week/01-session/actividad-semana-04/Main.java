import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("===== PRODUCTOS =====");

        // Producto con constructor completo
        Producto producto1 = new Producto(1001, "Laptop", 2500000, 5);

        // Producto con constructor usando this()
        Producto producto2 = new Producto(1002, "Mouse");

        // Producto con el mismo codigo que producto1
        Producto producto3 = new Producto(1001, "Laptop diferente", 3000000, 10);

        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);

        // Comparacion de productos
        System.out.println();
        System.out.println("===== COMPARACIÓN =====");

        System.out.println("¿producto1 y producto3 son iguales?");
        System.out.println(producto1.equals(producto3));

        // Prueba con HashSet
        System.out.println();
        System.out.println("===== HASHSET =====");

        HashSet<Producto> productos = new HashSet<>();

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);

        System.out.println("Cantidad de productos agregados al HashSet: "
                + productos.size());

        for (Producto producto : productos) {
            System.out.println(producto);
        }

        // Verificacion
        System.out.println();
        System.out.println("===== VERIFICACIÓN =====");

        if (producto1.equals(producto3)) {
            System.out.println("Los productos con el mismo codigo son iguales.");
        }

        if (productos.size() == 2) {
            System.out.println("HashSet no duplicó los productos con el mismo codigo.");
        }
    }
}