public class Desarrollador extends Empleado {

    private String lenguaje;

    public Desarrollador(String nombre, double salarioBase, String lenguaje) {
        super(nombre, salarioBase);
        this.lenguaje = lenguaje;

        System.out.println("Constructor Desarrollador");
    }

    @Override
    public String ficha() {
        return super.ficha() +
               ", Lenguaje: " + lenguaje;
    }

    @Override
    public double salarioTotal() {
        return salarioBase;
    }
}