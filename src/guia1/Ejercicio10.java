package guia1;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su peso en kg:");
        String entradaPeso = scanner.nextLine();

        System.out.println("Ingrese su altura en metros (ej. 1.75):");
        String entradaAltura = scanner.nextLine();

        try {
            double peso = Double.parseDouble(entradaPeso.replace(',', '.'));
            double altura = Double.parseDouble(entradaAltura.replace(',', '.'));

            if (peso <= 0 || altura <= 0) {
                System.out.println("Error: Peso y altura deben ser valores positivos.");
            } else {
                double imc = peso / (altura * altura);
                System.out.printf("Su IMC es: %.2f\n", imc);

                if (imc < 18.5) {
                    System.out.println("Bajo peso");
                } else if (imc >= 18.5 && imc <= 24.9) {
                    System.out.println("Normal");
                } else if (imc >= 25 && imc <= 29.9) {
                    System.out.println("Sobrepeso");
                } else {
                    System.out.println("Obesidad");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Por favor ingrese valores numéricos válidos.");
        }

        scanner.close();
    }
}