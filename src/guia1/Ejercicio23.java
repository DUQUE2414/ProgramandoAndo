package guia1;

import javax.swing.JOptionPane;

public class Ejercicio23 {
    public void Ejecutar() {
        int[] numeros = {10, 20, 30, 40, 50};
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        JOptionPane.showMessageDialog(null, "23. La suma de los elementos del arreglo es: " + suma);
    }
}
