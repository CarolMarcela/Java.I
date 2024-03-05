package co.com.ps;
import java.util.Scanner;
public class TrabajoEnClase1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String nombre = scanner.next();

        System.out.println("Ingrese el primer número:");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int num2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número:");
        int num3 = scanner.nextInt();

        double promedio = (num1 + num2 + num3) / 3;

        System.out.println(nombre + ", su promedio es: " + promedio);

        scanner.close();
    }
}