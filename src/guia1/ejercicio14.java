
package guia1;

import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numerosImpares = new int[50];
        int numero = 1;
        int posicion = 0;

        System.out.println("Numeros impares del 1 al 100");
        System.out.print("Presione Enter para continuar...");
        scanner.nextLine();

        while (numero <= 100) {
            if (numero % 2 != 0) {
                numerosImpares[posicion] = numero;
                posicion++;
            }
            numero++;
        }

        int i = 0;

        while (i < numerosImpares.length) {
            System.out.println(numerosImpares[i]);
            i++;
        }

        scanner.close();
    }
}
