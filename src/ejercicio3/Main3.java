package ejercicio3;

class BasePrivada {
    private String secreto = "Dato privado";

    public String getSecreto() {
        return secreto;
    }
}

class DerivadaPrivada extends BasePrivada {
    public void intentarAcceder() {
        // ERROR DE COMPILACIÓN si se descomenta:
        // System.out.println(super.secreto); // 'secreto' tiene acceso privado en BasePrivada

        // Forma correcta mediante método público heredado:
        System.out.println("Accediendo correctamente vía getter: " + super.getSecreto());
    }
}

public class Main3 {
    public static void main(String[] args) {
        // 1. Uso fuera de una clase derivada:
        // ERROR DE COMPILACIÓN si se descomenta:
        // super.toString(); // No se puede usar 'super' en un contexto estático o sin herencia directa

        // 2. Intento de acceso a miembro privado:
        DerivadaPrivada obj = new DerivadaPrivada();
        obj.intentarAcceder();
    }
}