// Pida un numero entero al usuario e imprima si es Positivo, Negativo o Cero. Use if - else if - else

package guia1;

import javax.swing.JOptionPane;

public class Ejercicio1 {

    public static void main(String[] args) {

        try {
            int numero = Integer.parseInt(
                    JOptionPane.showInputDialog("Ingrese un numero: "));

            if (numero == 0) {
                JOptionPane.showMessageDialog(null, "Cero");
            } else if (numero > 0) {
                JOptionPane.showMessageDialog(null, "Positivo");
            } else {
                JOptionPane.showMessageDialog(null, "Negativo");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Solo se permiten numeros");
        }

    }
}
