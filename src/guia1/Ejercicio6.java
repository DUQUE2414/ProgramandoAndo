package guia1;

import javax.swing.JOptionPane;

public class Ejercicio6 {
    public static void main(String[] args) {
        try {
            String input = JOptionPane.showInputDialog("Ingrese una nota entre 0 y 100:");
            if (input == null) return;
            int nota = Integer.parseInt(input);

            if (nota < 0 || nota > 100) {
                JOptionPane.showMessageDialog(null, "Error: La nota debe estar entre 0 y 100.");
            } else if (nota >= 90) {
                JOptionPane.showMessageDialog(null, "Excelente");
            } else if (nota >= 80) {
                JOptionPane.showMessageDialog(null, "Bueno");
            } else if (nota >= 70) {
                JOptionPane.showMessageDialog(null, "Aceptable");
            } else if (nota >= 60) {
                JOptionPane.showMessageDialog(null, "Insuficiente");
            } else {
                JOptionPane.showMessageDialog(null, "Reprobado");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Debe ingresar un numero entero.");
        }
    }
}
