package guia2;

import javax.swing.JOptionPane;

public class Ejercicio6 {
    public static void main(String[] args) {
        try {
            String nombre = JOptionPane.showInputDialog(
                    "Escribe tu nombre:");
            // Si el usuario cancela, nombre == null
            JOptionPane.showMessageDialog(null,
                    "Hola, " + nombre.toUpperCase() + "!");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null,
                    "Cancelaste la operacion. El nombre es requerido.");
        }
    }

}
