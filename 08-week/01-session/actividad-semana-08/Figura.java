public abstract class Figura {

    // Método abstracto: cada figura calcula su propia área
    public abstract double area();

    // Método concreto que utiliza area()
    public String describir() {
        return "Figura con area: " + area();
    }
}