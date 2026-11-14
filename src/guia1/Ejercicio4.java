package guia1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero:");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo numero:");
        double num2 = scanner.nextDouble();

        System.out.println("Ingrese el operador (+, -, *, /):");
        char operador = scanner.next().charAt(0);

        switch (operador) {
            case '+':
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division entre cero no permitida.");
                } else {
                    System.out.println("Resultado: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Operador invalido.");
                break;
        }

        scanner.close();
    }
}
