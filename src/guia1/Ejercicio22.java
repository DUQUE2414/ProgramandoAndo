package guia1;

import javax.swing.JOptionPane;

public class Ejercicio22 {
    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {

        int[] numeros = new int[10];

        JOptionPane.showMessageDialog(null, "Arreglo de 10 numeros");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:"));
        }

        String resultado = "Los numeros del arreglo son:\n";

        for (int i = 0; i < numeros.length; i++) {
            resultado += numeros[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}