// Pida un year y determine si es bisiesto. Reglas: divisible entre 4, no entre 100, excepto si es divisible entre 400

package guia1;

import javax.swing.JOptionPane;

public class Ejercicio5 {
    public static void main(String[] args) {

        try {
            int year = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un año"));

            if (year <= 0) {
                throw new IllegalArgumentException("El año debe de ser numeros positivos");
            }

            if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
                JOptionPane.showMessageDialog(null, "Bisiesto");
            } else {
                JOptionPane.showMessageDialog(null, "No bisiesto");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Solo se permiten numeros");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
