public class Main {

    public static void main(String[] args) {

        // Arreglo polimorfico de tipo Figura
        Figura[] figuras = {
            new Circulo(5),
            new Rectangulo(4, 6),
            new Triangulo(3, 8),
            new Cuadrado(4)
        };

        System.out.println("===== FIGURAS Y AREAS =====");

        // Un solo bucle para procesar todas las figuras
        for (Figura figura : figuras) {

            System.out.println();
            System.out.println("Figura: " + figura.nombre());
            System.out.println("Area: " + figura.area());

            // instanceof + downcasting seguro
            if (figura instanceof Circulo) {
                Circulo circulo = (Circulo) figura;
                System.out.println("Diametro: " + circulo.diametro());
            }
        }

        System.out.println();
        System.out.println("===== EXTENSIBILIDAD =====");
        System.out.println(
            "El Cuadrado fue agregado sin modificar el funcionamiento del bucle."
        );
    }
}