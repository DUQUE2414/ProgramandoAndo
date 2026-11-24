package guia1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        String usuario = "admin";
        int clave = 1234;

        System.out.print("Ingrese el nombre de usuario: ");
        String UsuarioIngresado = scanner.nextLine();

        System.out.print("Ingrese la clave: ");
        int ClaveIngresada = scanner.nextInt();

        if (UsuarioIngresado.equals(usuario) && ClaveIngresada == clave) {
            System.out.println("Bienvenido, " + UsuarioIngresado + "!");
        } else {
            System.out.println("Credenciales incorrectas.");
        }

        scanner.close();
    }
}