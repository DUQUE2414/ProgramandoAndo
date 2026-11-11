package guia1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt();

        if (edad < 0) {
            System.out.println("Edad invalida");
        } else if (edad >= 18) {
            System.out.println("Puede ingresar");
        } else {
            System.out.println("Acceso denegado");
        }

        scanner.close();
    }
}
