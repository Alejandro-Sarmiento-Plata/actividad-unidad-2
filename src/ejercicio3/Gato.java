package ejercicio3;

public class Gato extends Animal {
    // Mala práctica (compila pero no es seguro sin @Override):
    public void hacerSonido() {
        System.out.println("El gato maúlla (sin usar @Override).");
    }

    // ERROR DE COMPILACIÓN si se descomenta (firma distinta):
    /*
    @Override
    public void hacerSonido(String intensidad) {
        System.out.println("El gato maúlla " + intensidad);
    }
    */
}