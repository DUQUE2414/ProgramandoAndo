
package guia1;

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numerosPares = new int[50];
        int posicion = 0;

        System.out.println("Numeros pares del 1 al 100");
        System.out.print("Presione Enter para continuar...");
        scanner.nextLine();

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                numerosPares[posicion] = i;
                posicion++;
            }
        }

        for (int i = 0; i < numerosPares.length; i++) {
            System.out.println(numerosPares[i]);
        }

        scanner.close();
    }
}
