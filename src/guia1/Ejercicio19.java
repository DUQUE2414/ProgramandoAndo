
package guia1;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[20];
        int contador = 0;

        System.out.println("Multiplos de 10 del 1 al 200");
        System.out.print("Presione Enter para continuar...");
        scanner.nextLine();

        for (int i = 1; i <= 200; i++) {
            if (i % 10 == 0) {
                numeros[contador] = i;
                contador++;
            }
        }

        for (int i = 0; i < contador; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("Cantidad de multiplos de 10: " + contador);

        scanner.close();
    }
}
