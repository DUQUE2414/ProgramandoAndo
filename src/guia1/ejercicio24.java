package guia1;

import javax.swing.JOptionPane;

public class ejercicio24 {
    public void Ejecutar() {
        int[] numeros = {14, 55, 3, 89, 22, 7};
        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        JOptionPane.showMessageDialog(null, "24. El número mayor del arreglo es: " + mayor);
    }
}
