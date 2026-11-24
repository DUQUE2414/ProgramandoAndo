package guia1;

import javax.swing.JOptionPane;

public class Ejercicio2 {
    public void Ejecutar() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "2. Ingrese un número entero:"));
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El número " + numero + " es Par.");
        } else {
            JOptionPane.showMessageDialog(null, "El número " + numero + " es Impar.");
        }
    }
}
