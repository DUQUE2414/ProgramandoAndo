package guia1;

import javax.swing.JOptionPane;

public class Ejercicio6 {
    public void Ejecutar() {
        double nota = Double.parseDouble(JOptionPane.showInputDialog(null, "6. Ingrese una nota (0-100):"));
        if (nota < 0 || nota > 100) {
            JOptionPane.showMessageDialog(null, "Error: Rango inválido.");
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
    }
}
