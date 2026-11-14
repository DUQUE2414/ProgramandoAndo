// Mostrar la tabla de multiplicar del numero 7 usando un ciclo for.


package guia1;

public class Ejercicio17 {
    public static void main(String[] args) {
        System.out.println("La tabla de multiplicar del 7");

        for (int i = 1; i <= 10; i++) {
            int tabla = 7 * i;
            System.out.println("7 x %d = %d".formatted(i, tabla));
        }
    }
}
