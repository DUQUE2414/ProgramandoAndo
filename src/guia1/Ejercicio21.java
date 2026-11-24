package guia1;

import javax.swing.JOptionPane;

public class Ejercicio21 {
    public void Ejecutar() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "21. Ingrese un número para calcular su factorial:"));
        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es: " + factorial);
    }
}
