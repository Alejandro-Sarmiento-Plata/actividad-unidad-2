package ejercicio1;

public class Main1 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona estudiante = new Estudiante(); // Polimorfismo
        Persona profesor = new Profesor();     // Polimorfismo

        persona.presentarse();
        estudiante.presentarse();
        profesor.presentarse();
    }
}