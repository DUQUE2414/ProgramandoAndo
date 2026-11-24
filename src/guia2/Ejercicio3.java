// Calculadora de IMC
//Lanzar una excepción manualmente con throw cuando la lógica lo requiere.

package guia2;

import javax.swing.JOptionPane;

public class Ejercicio3 {
    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {

        try {
            float peso = Float.parseFloat(
                    JOptionPane.showInputDialog("Ingrese el peso (KG)"));

            float altura = Float.parseFloat(
                    JOptionPane.showInputDialog("Ingrese la altura (CM)"));

            if (altura == 0) {
                throw new ArithmeticException("La altura no puede ser cero");
            }

            float IMC = peso / (altura * altura);

            JOptionPane.showMessageDialog(
                    null, "IMC: " + String.format("%.2f", IMC));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    null, "Dato invalido. Usa punto decimal. Ej: 1.70");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(
                    null, "Error: " + e.getMessage());
        }
    }
}
