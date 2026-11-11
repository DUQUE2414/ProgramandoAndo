package guia1;

public class Ejercicio18 {
    public static void main(String[] args) {
        System.out.println("Tablas de multiplicar del 1 al 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("\n--- Tabla del " + i + " ---");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}
