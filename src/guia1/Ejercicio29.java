package guia1;

import javax.swing.JOptionPane;

public class Ejercicio29 {
    public void Ejecutar() {
        String texto = JOptionPane.showInputDialog(null, "29. Ingrese una cadena de texto:");
        if (texto != null) {
            StringBuilder sb = new StringBuilder("Caracteres:\n");
            for (int i = 0; i < texto.length(); i++) {
                sb.append(texto.charAt(i)).append("\n");
            }
            JOptionPane.showMessageDialog(null, sb.toString());
        }
    }
}
