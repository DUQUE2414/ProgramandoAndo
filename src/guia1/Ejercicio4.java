package guia1;

import javax.swing.JOptionPane;

public class Ejercicio4 {

    public static void main(String[] args) {
        ejecutar();
    }
    public static void ejecutar() {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "4. Ingrese el primer número:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "4. Ingrese el segundo número:"));
        String operador = JOptionPane.showInputDialog(null, "4. Ingrese el operador (+, -, *, /):");

        double resultado = 0;
        boolean valido = true;

        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    JOptionPane.showMessageDialog(null, "Error: División entre cero.");
                    valido = false;
                } else {
                    resultado = num1 / num2;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operador inválido.");
                valido = false;
                break;
        }

        if (valido) {
            JOptionPane.showMessageDialog(null, "Resultado: " + num1 + " " + operador + " " + num2 + " = " + resultado);
        }
    }
}