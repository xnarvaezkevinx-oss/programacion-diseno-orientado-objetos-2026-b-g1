public class Main {

    public static void main(String[] args) {

        System.out.println("===== POLIMORFISMO POR SUPERCLASE =====");

        Figura[] figuras = {
            new Circulo(5),
            new Rectangulo(4, 6),
            new Triangulo(3, 8)
        };

        for (Figura figura : figuras) {
            System.out.println(figura.describir());
        }

        System.out.println();
        System.out.println("===== POLIMORFISMO POR INTERFAZ =====");

        Dibujable[] dibujables = {
            new Circulo(5),
            new Rectangulo(4, 6),
            new Triangulo(3, 8)
        };

        for (Dibujable dibujable : dibujables) {
            dibujable.dibujar();
        }

        System.out.println();
        System.out.println("===== CLASE ABSTRACTA =====");

        // Figura figura = new Figura();
        // La linea anterior no compila porque Figura es una clase abstracta
        // y las clases abstractas no pueden ser instanciadas directamente.

        System.out.println("Figura no puede ser instanciada directamente porque es abstracta.");
    }
}