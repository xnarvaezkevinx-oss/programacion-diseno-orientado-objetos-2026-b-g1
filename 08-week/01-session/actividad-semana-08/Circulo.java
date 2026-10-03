public class Circulo extends Figura implements Dibujable {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un circulo");
    }
}