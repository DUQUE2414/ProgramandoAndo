package guia1;

import javax.swing.JOptionPane;

public class ejercicio22 {
    public void Ejecutar() {
        int[] numeros = {5, 12, 8, 3, 20, 15, 7, 9, 14, 2};
        StringBuilder sb = new StringBuilder("22. Elementos del arreglo:\n");
        for (int i = 0; i < numeros.length; i++) {
            sb.append("Índice ").append(i).append(": ").append(numeros[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
