package guia1;

import javax.swing.JOptionPane;

public class ejercicio13 {
    public void Ejecutar() {
        StringBuilder sb = new StringBuilder("13. Números pares del 1 al 100:\n");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sb.append(i).append(" ");
            }
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
