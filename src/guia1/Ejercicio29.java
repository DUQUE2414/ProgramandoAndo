package guia1;

import javax.swing.JOptionPane;

public class Ejercicio29 {
    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        String texto = JOptionPane.showInputDialog("Ingrese una cadena de texto:");
        if (texto == null) return;

        StringBuilder sb = new StringBuilder("Caracteres:\n");
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            System.out.println(c);
            sb.append(c).append("\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
