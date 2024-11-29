import java.util.Scanner;

public class DivisionPorCero {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar al usuario que ingrese dos números
            System.out.print("Introduce el primer número (dividendo): ");
            double num1 = scanner.nextDouble();

            System.out.print("Introduce el segundo número (divisor): ");
            double num2 = scanner.nextDouble();

            // Intentar realizar la división
            if (num2 == 0) {
                throw new ArithmeticException("No se puede dividir por cero.");
            }

            double resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            // Manejar la excepción si el divisor es cero
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Cerrar el scanner para liberar recursos
            scanner.close();
        }
    }
}

