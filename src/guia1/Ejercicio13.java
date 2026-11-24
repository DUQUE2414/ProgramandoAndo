package guia1;

import javax.swing.JOptionPane;

public class Ejercicio13 {
    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {

        int[] numerosPares = new int[50];
        int posicion = 0;

        JOptionPane.showMessageDialog(null, "Numeros pares del 1 al 100");
        JOptionPane.showMessageDialog(null, "Presione Aceptar para continuar...");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                numerosPares[posicion] = i;
                posicion++;
            }
        }

        String resultado = "";

        for (int i = 0; i < numerosPares.length; i++) {
            resultado += numerosPares[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}