// Solicite el valor de una compra y aplique descuento: >$500.000 = 20%, >$200.000 = 15%, >$100.000 = 10%. 
// Mostrar valor original, descuento y total.

package guia1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double descuento;
        
        System.out.println("Ingrese el valor de la compra: ");
        double compra = scanner.nextDouble();
        
        if (compra > 500000) {
            descuento = compra - (compra * 0.20);
        }
        else if (compra > 200000) {
            descuento = compra - (compra * 0.15);
        }

        else if(compra > 100000){
            descuento = compra - (compra * 0.10);
        }
        else{
            descuento = compra;
        }

        System.out.println("Valor original de la compra es: " + compra);
        System.out.println("Con descuento es: " + descuento);

        scanner.close();
    
    }
}
