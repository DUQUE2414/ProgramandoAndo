// Solicite un numero entero y determine si es Par o Impar. Use el operador modulo (%).

package guia1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero");
        int numero = scanner.nextInt();

        if(numero % 2 == 0){
            System.out.println("Par");
        }
        else{
            System.out.println("Impar");
        }

        scanner.close();
    }
}
