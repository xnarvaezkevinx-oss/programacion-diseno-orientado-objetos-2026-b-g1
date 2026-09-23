public class Main {

    public static void main(String[] args) {

        System.out.println("===== CREANDO GERENTE =====");

        Gerente gerente = new Gerente(
                "Carlos",
                3000000,
                500000
        );

        System.out.println();
        System.out.println("===== DATOS DEL GERENTE =====");
        System.out.println(gerente.ficha());
        System.out.println("Salario total: $" + gerente.salarioTotal());

        System.out.println();
        System.out.println("===== CREANDO DESARROLLADOR =====");

        Desarrollador desarrollador = new Desarrollador(
                "Ana",
                2500000,
                "Java"
        );

        System.out.println();
        System.out.println("===== DATOS DEL DESARROLLADOR =====");
        System.out.println(desarrollador.ficha());
        System.out.println("Salario total: $" + desarrollador.salarioTotal());
    }
}