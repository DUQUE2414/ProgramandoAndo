package guia1;

public class Ejercicio23 {
    public static void main(String[] args) {
        int[] numeros = { 10, 20, 30, 40, 50, 60 };
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        System.out.println("La suma de los elementos del arreglo es: " + suma);
    }
}
