
package guia1;

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[100];
        int suma = 0;

        System.out.println("Suma de los numeros del 1 al 100");
        System.out.print("Presione Enter para continuar...");
        scanner.nextLine();

        for (int i = 1; i <= 100; i++) {
            numeros[i - 1] = i;
            suma = suma + numeros[i - 1];
        }

        System.out.println("La suma de los numeros del 1 al 100 es: " + suma);

        scanner.close();
    }
}
