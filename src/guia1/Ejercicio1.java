package guia1;

import javax.swing.JOptionPane;

public class Ejercicio1 {
    public void Ejecutar() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Ingrese un número entero:"));
        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "El número " + numero + " es Positivo.");
        } else if (numero < 0) {
            JOptionPane.showMessageDialog(null, "El número " + numero + " es Negativo.");
        } else {
            JOptionPane.showMessageDialog(null, "El número es Cero.");
        }
    }
}
