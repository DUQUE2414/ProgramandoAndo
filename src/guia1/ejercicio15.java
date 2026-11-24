package guia1;

import javax.swing.JOptionPane;

public class ejercicio15 {
    public void Ejecutar() {
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i;
        }
        JOptionPane.showMessageDialog(null, "15. La suma de los números del 1 al 100 es: " + suma);
    }
}
