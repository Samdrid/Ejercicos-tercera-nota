import java.util.Scanner; // Importar la clase Scanner para leer la entrada del usuar

public class CalcularMedia {

     public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos desde la consola
         Scanner scanner = new Scanner(System.in);
    
        // Pedir al usuario que ingrese tres números
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();
    
        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();
    
        System.out.print("Introduce el tercer número: ");
        double num3 = scanner.nextDouble();
    
        // Calcular la media de los tres números
        double media = (num1 + num2 + num3) / 3;
    
        // Mostrar el resultado
        System.out.println("La media de los tres números es: " + media);
    
        // Cerrar el scanner para liberar recursos
        scanner.close();
    }
}
     
