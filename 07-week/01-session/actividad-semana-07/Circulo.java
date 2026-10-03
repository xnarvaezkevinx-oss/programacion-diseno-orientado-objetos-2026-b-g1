public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    @Override
    public String nombre() {
        return "Circulo";
    }

    public double diametro() {
        return radio * 2;
    }
}