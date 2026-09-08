public class Estudiante {

    String nombre;
    String programa;
    int semestre;

    public void presentarse() {
        System.out.println("Hola, mi nombre es " + nombre
                + ", estudio " + programa
                + " y estoy en el semestre " + semestre + ".");
    }
}