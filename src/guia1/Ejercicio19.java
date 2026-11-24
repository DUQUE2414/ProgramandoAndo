package guia1;

import javax.swing.JOptionPane;

public class Ejercicio19 {
    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {

        int[] numeros = new int[20];
        int contador = 0;

        JOptionPane.showMessageDialog(null, "Multiplos de 10 del 1 al 200");
        JOptionPane.showMessageDialog(null, "Presione Aceptar para continuar...");

        for (int i = 1; i <= 200; i++) {
            if (i % 10 == 0) {
                numeros[contador] = i;
                contador++;
            }
        }

        String resultado = "";

        for (int i = 0; i < contador; i++) {
            resultado += numeros[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
        JOptionPane.showMessageDialog(null, "Cantidad de multiplos de 10: " + contador);
    }
}