// Pida un numero entero al usuario e imprima si es Positivo, Negativo o Cero. Use if - else if - else

package guia1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("Positivo");
        } else if (numero < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Cero");
        }
        scanner.close();

    }
}
