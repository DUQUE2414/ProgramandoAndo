package guia1;

import javax.swing.JOptionPane;

public class Ejercicio27 {
    public void Ejecutar() {
        StringBuilder sb = new StringBuilder("27. Cuadrado 6x6:\n");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                sb.append("* ");
            }
            sb.append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
