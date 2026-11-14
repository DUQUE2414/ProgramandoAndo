
package guia1;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();

        System.out.println("Ingrese el tercer numero: ");
        int numero3 = scanner.nextInt();

        if (numero1 == numero2 && numero2 == numero3) {
            System.out.println("Los tres numeros son iguales");
        } else if (numero1 == numero2 && numero1 > numero3) {
            System.out.println("El numero 1 y 2 empatan como mayores");
        } else if (numero1 == numero3 && numero1 > numero2) {
            System.out.println("El numero 1 y 3 empatan como mayores");
        } else if (numero2 == numero3 && numero2 > numero1) {
            System.out.println("El numero 2 y 3 empatan como mayores");
        } else if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El numero mayor es: " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El numero mayor es: " + numero2);
        } else {
            System.out.println("El numero mayor es: " + numero3);
        }

        scanner.close();
    }
}
