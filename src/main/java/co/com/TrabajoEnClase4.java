package co.com.ps;
import java.util.Scanner;
// 1. Verificar el numero ingresado si es positivo, negativo o cero
// 2. Programa que solicite al usuario ingresar el precio de un artículo y su categoria. Aplica un descuento del 10% si es electrónica, 5% si es ropa y 2% si son alimentos. Imprime el precio final
public class TrabajoEnClase4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite un número: ");
        double numero = scanner.nextDouble();

        // 1. Verificar el numero ingresado si es positivo, negativo o cero
        if (numero > 0) {
            System.out.println("El número ingresado es positivo.");
        } else if (numero < 0) {
            System.out.println("El número ingresado es negativo.");
        } else {
            System.out.println("El número ingresado es cero.");
        }

        // 2. Solicitar al usuario ingresar el precio del artículo
        System.out.print("Señor usuario ingrese el precio del artículo:");
        double precio = scanner.nextDouble();

        // 2. Solicitar al usuario ingresar la categoría del artículo
        System.out.print("Señor usuario ingrese la categoría del artículo (Electrónicos, Ropa, Alimentos):");
        String categoria = scanner.next();

        //Descuento en las categorias
        double descuento = 0;
        switch (categoria) {
            case "Electrónicos":
                descuento = 0.1;
                break;
            case "Ropa":
                descuento = 0.05;
                break;
            case "Alimentos":
                descuento = 0.02;
                break;
            default:
                System.out.println("Categoría no válida. No se aplicará descuento.");
        }
        double precioFinal = precio - (precio * descuento);
        //Precio Final
        System.out.println("El precio final con su descuento es:" + precioFinal);
    }

}
