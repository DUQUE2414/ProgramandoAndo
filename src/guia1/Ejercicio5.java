// Pida un anio y determine si es bisiesto. Reglas: divisible entre 4, no entre 100, excepto si es divisible entre 400

package guia1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el año deseado");
        int anio = scanner.nextInt();

        if((anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0)){
            System.out.println("Año bisiesto");
        }
        else{
            System.out.println("No bisiesto");
        }

        scanner.close();
    }
}
