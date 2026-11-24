
package guia1;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Arreglo de 10 numeros");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un numero: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Los numeros del arreglo son:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}
