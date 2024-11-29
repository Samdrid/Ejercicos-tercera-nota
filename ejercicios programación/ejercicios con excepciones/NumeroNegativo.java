import java.util.Scanner;

// Definir la excepción personalizada
class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensaje) {
        super(mensaje);
    }
}

public class CalculoRaizCuadrada {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar al usuario que ingrese un número
            System.out.print("Introduce un número para calcular su raíz cuadrada: ");
            double numero = scanner.nextDouble();

            // Verificar si el número es negativo
            if (numero < 0) {
                // Lanzar la excepción personalizada si el número es negativo
                throw new NumeroNegativoException("No se puede calcular la raíz cuadrada de un número negativo.");
            }

            // Calcular la raíz cuadrada
            double raizCuadrada = Math.sqrt(numero);
            System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);

        } catch (NumeroNegativoException e) {
            // Capturar la excepción personalizada y mostrar el mensaje
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Cerrar el scanner para liberar recursos
            scanner.close();
        }
    }
}

    

