public class Main {
    public static void main(String[] args) {

        // Crear tres libros diferentes
        Libro libro1 = new Libro(
                "Cien años de soledad",
                "Gabriel García Márquez",
                417
        );

        Libro libro2 = new Libro(
                "El principito",
                "Antoine de Saint-Exupéry",
                96
        );

        Libro libro3 = new Libro(
                "Don Quijote de la Mancha",
                "Miguel de Cervantes",
                863
        );

        // Mostrar información de los libros
        System.out.println("===== LIBRO 1 =====");
        libro1.describir();
        System.out.println("¿Es largo? " + libro1.esLargo());

        System.out.println();

        System.out.println("===== LIBRO 2 =====");
        libro2.describir();
        System.out.println("¿Es largo? " + libro2.esLargo());

        System.out.println();

        System.out.println("===== LIBRO 3 =====");
        libro3.describir();
        System.out.println("¿Es largo? " + libro3.esLargo());

        // Demostración de aliasing
        System.out.println();
        System.out.println("===== ALIASING =====");

        Libro otro = libro1;

        System.out.println("Título de libro1 antes del cambio: " + libro1.titulo);

        otro.titulo = "Cien años de soledad - Edición modificada";

        System.out.println("Título de otro: " + otro.titulo);
        System.out.println("Título de libro1 después del cambio: " + libro1.titulo);

        // Demostración de NullPointerException
        System.out.println();
        System.out.println("===== MANEJO DE NULL =====");

        Libro libroNull = null;

        try {
            System.out.println(libroNull.titulo);
        } catch (NullPointerException e) {
            System.out.println("Se produjo un NullPointerException.");
        }

        // Prevención del error con if != null
        if (libroNull != null) {
            System.out.println(libroNull.titulo);
        } else {
            System.out.println("Se evitó el error porque libroNull es null.");
        }
    }
}