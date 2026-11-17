// Solicite un numero entero y determine si es Par o Impar. Use el operador modulo (%).

package guia1;

import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {

        try {
            int numero = Integer.parseInt(
                    JOptionPane.showInputDialog("Ingrese un numero entero"));

            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null, " El numero: " + numero + " Es Par");
            } else {
                JOptionPane.showMessageDialog(null, " El numero: " + numero + " Es Impar");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Solo se permiten numeros");
        }
    }
}
