package guia1;

import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main(String[] args) {
        try {
            String s1 = JOptionPane.showInputDialog("Ingrese el primer numero:");
            if (s1 == null) return;
            double num1 = Double.parseDouble(s1);

            String s2 = JOptionPane.showInputDialog("Ingrese el segundo numero:");
            if (s2 == null) return;
            double num2 = Double.parseDouble(s2);

            String opStr = JOptionPane.showInputDialog("Ingrese el operador (+, -, *, /):");
            if (opStr == null || opStr.isEmpty()) return;
            char operador = opStr.charAt(0);

            switch (operador) {
                case '+':
                    JOptionPane.showMessageDialog(null, "Resultado: " + (num1 + num2));
                    break;
                case '-':
                    JOptionPane.showMessageDialog(null, "Resultado: " + (num1 - num2));
                    break;
                case '*':
                    JOptionPane.showMessageDialog(null, "Resultado: " + (num1 * num2));
                    break;
                case '/':
                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(null, "Error: Division entre cero no permitida.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Resultado: " + (num1 / num2));
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Operador invalido.");
                    break;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Entrada numerica invalida.");
        }
    }
}
