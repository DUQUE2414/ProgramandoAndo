package guia1;

import javax.swing.JOptionPane;

public class Ejercicio3 {
    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        try {
            String input = JOptionPane.showInputDialog("Ingrese su edad:");
            if (input == null) return;
            int edad = Integer.parseInt(input);

            if (edad < 0) {
                JOptionPane.showMessageDialog(null, "Edad invalida");
            } else if (edad >= 18) {
                JOptionPane.showMessageDialog(null, "Puede ingresar");
            } else {
                JOptionPane.showMessageDialog(null, "Acceso denegado");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Debe ingresar un numero entero valido.");
        }
    }
}
