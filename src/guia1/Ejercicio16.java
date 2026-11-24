package guia1;

import javax.swing.JOptionPane;

public class Ejercicio16 {
    public void Ejecutar() {
        int suma = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                suma += i;
            }
        }
        JOptionPane.showMessageDialog(null, "16. La suma de los números impares del 1 al 50 es: " + suma);
    }
}
