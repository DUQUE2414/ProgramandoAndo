
package guia1;

import java.util.Scanner;

public class ejercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Encontrar el numero mayor de un arreglo");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un numero: ");
            numeros[i] = scanner.nextInt();
        }

        int mayor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        System.out.println("El numero mayor es: " + mayor);

        scanner.close();
    }
}
