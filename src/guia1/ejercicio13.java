package guia1;

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numeros pares del 1 al 100");
        System.out.print("Presione Enter para continuar...");
        scanner.nextLine();

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
