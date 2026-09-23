public class Gerente extends Empleado {

    private double bono;

    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;

        System.out.println("Constructor Gerente");
    }

    @Override
    public String ficha() {
        return super.ficha() +
               ", Bono: $" + bono;
    }

    @Override
    public double salarioTotal() {
        return salarioBase + bono;
    }
}