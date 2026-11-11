package guia1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una nota entre 0 y 100:");
        int nota = scanner.nextInt();

        if (nota < 0 || nota > 100) {
            System.out.println("Error: La nota debe estar entre 0 y 100.");
        } else if (nota >= 90) {
            System.out.println("Excelente");
        } else if (nota >= 80) {
            System.out.println("Bueno");
        } else if (nota >= 70) {
            System.out.println("Aceptable");
        } else if (nota >= 60) {
            System.out.println("Insuficiente");
        } else {
            System.out.println("Reprobado");
        }

        scanner.close();
    }
}
