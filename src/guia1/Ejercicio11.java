package guia1;

import javax.swing.JOptionPane;

public class Ejercicio11 {
    public void Ejecutar() {
        StringBuilder sb = new StringBuilder("11. Números del 1 al 50:\n");
        for (int i = 1; i <= 50; i++) {
            sb.append(i).append(" ");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
