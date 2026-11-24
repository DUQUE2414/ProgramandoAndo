package guia1;

import javax.swing.JOptionPane;

public class ejercicio14 {
    public void Ejecutar() {
        StringBuilder sb = new StringBuilder("14. Números impares del 1 al 100 (while):\n");
        int i = 1;
        while (i <= 100) {
            if (i % 2 != 0) {
                sb.append(i).append(" ");
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
