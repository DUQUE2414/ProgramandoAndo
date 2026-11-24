package guia1;

import javax.swing.JOptionPane;

public class Ejercicio20 {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {

        int[] numeros = new int[100];
        String resultado = "";

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;

            if (numeros[i] % 3 == 0 && numeros[i] % 5 == 0) {
                resultado += numeros[i] + " es múltiplo de 3 y 5\n";
            }
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}