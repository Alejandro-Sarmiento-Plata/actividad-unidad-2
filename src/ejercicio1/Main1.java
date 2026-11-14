package ejercicio1;

public class Main1 {
    public static void main(String[] args) {
        Persona persona = new Persona("Carlos Gómez", 30);
        Empleado empleado = new Empleado("Ana Martínez", 26, "Desarrollo de Software");

        System.out.println("--- Datos Persona ---");
        persona.mostrarDetalles();

        System.out.println("\n--- Datos Empleado ---");
        empleado.mostrarDetalles();
    }
}
