package guia1;

import javax.swing.JOptionPane;

public class Ejercicio24 {
    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {

        int[] numeros = new int[5];

        JOptionPane.showMessageDialog(null, "Encontrar el numero mayor de un arreglo");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:"));
        }

        int mayor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        JOptionPane.showMessageDialog(null, "El numero mayor es: " + mayor);
    }
}