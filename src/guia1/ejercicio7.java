package guia1;

import javax.swing.JOptionPane;

public class ejercicio7 {
    public void Ejecutar() {
        double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "7. Ingrese el primer número:"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "7. Ingrese el segundo número:"));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "7. Ingrese el tercer número:"));

        if (n1 == n2 && n2 == n3) {
            JOptionPane.showMessageDialog(null, "Empate total entre los tres. Todos son: " + n1);
        } else if (n1 == n2 && n1 > n3) {
            JOptionPane.showMessageDialog(null, "Empate entre el 1º y 2º número. Mayor: " + n1);
        } else if (n1 == n3 && n1 > n2) {
            JOptionPane.showMessageDialog(null, "Empate entre el 1º y 3º número. Mayor: " + n1);
        } else if (n2 == n3 && n2 > n1) {
            JOptionPane.showMessageDialog(null, "Empate entre el 2º y 3º número. Mayor: " + n2);
        } else if (n1 > n2 && n1 > n3) {
            JOptionPane.showMessageDialog(null, "El mayor es el 1º número: " + n1);
        } else if (n2 > n1 && n2 > n3) {
            JOptionPane.showMessageDialog(null, "El mayor es el 2º número: " + n2);
        } else {
            JOptionPane.showMessageDialog(null, "El mayor es el 3º número: " + n3);
        }
    }
}
