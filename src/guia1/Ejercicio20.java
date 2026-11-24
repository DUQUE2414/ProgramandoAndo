package guia1;

import javax.swing.JOptionPane;

public class Ejercicio20 {
    public void Ejecutar() {
        StringBuilder sb = new StringBuilder("20. Divisibles entre 3 y 5 (1 al 100):\n");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sb.append(i).append(" ");
            }
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
