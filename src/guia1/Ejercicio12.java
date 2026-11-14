package guia1;

public class Ejercicio12 {
    public static void main(String[] args) {
        int[] valores = { 5, 10, 15, 20, 25 };

        System.out.println("Valores del arreglo de ejemplo:");
        for (int v : valores) {
            System.out.print(v + " ");
        }
        System.out.println("\n");

        System.out.println("Numeros del 50 al 1:");
        for (int i = 50; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
