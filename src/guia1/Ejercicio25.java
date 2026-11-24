package guia1;

import javax.swing.JOptionPane;

public class Ejercicio25 {
    public void Ejecutar() {
        int[] numeros = {14, 55, 3, 89, 22, 7};
        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        JOptionPane.showMessageDialog(null, "25. El número menor del arreglo es: " + menor);
    }
}
