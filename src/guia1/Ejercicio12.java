package guia1;

import javax.swing.JOptionPane;

public class Ejercicio12 {
    public static void main(String[] args) {
        int[] valores = { 5, 10, 15, 20, 25 };
        StringBuilder sb = new StringBuilder("Valores del arreglo de ejemplo:\n");
        for (int v : valores) {
            sb.append(v).append(" ");
        }
        sb.append("\n\nNumeros del 50 al 1:\n");
        for (int i = 50; i >= 1; i--) {
            System.out.println(i);
        }
        JOptionPane.showMessageDialog(null, sb.toString() + "(Revisa la consola para la lista completa del 50 al 1).");
    }
}
