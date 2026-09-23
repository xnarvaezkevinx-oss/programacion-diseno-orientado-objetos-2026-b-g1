public class Empleado {

    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;

        System.out.println("Constructor Empleado");
    }

    public String ficha() {
        return "Nombre: " + nombre +
               ", Salario base: $" + salarioBase;
    }

    public double salarioTotal() {
        return salarioBase;
    }
}