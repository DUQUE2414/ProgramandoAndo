package guia1;

import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numeros del 1 al 100 impares: ");
        System.out.print("Presione Enter para continuar...");

        scanner.nextLine();
        boolean condicion = true;

        while(condicion == true){
            for (int i = 1; i <= 100; i++) {
                if (i % 2 !=0) {
                    System.out.println("Los numeros impares son: " + i);
                }
            } 
            break;


        }
    }
}