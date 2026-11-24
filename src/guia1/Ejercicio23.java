package guia1;

import javax.swing.JOptionPane;

public class Ejercicio23 {
    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        int[] numeros = { 10, 20, 30, 40, 50, 60 };
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        JOptionPane.showMessageDialog(null, "La suma de los elementos del arreglo es: " + suma);
    }
}
