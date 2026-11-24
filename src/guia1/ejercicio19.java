package guia1;

import javax.swing.JOptionPane;

public class ejercicio19 {
    public void Ejecutar() {
        int contador = 0;
        StringBuilder sb = new StringBuilder("19. Múltiplos de 10 del 1 al 200:\n");
        for (int i = 1; i <= 200; i++) {
            if (i % 10 == 0) {
                sb.append(i).append(" ");
                contador++;
            }
        }
        JOptionPane.showMessageDialog(null, sb.toString() + "\nTotal de múltiplos: " + contador);
    }
}
