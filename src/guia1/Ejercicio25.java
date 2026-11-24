package guia1;

import javax.swing.JOptionPane;

public class Ejercicio25 {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {

        int[] numeros = new int[]{11, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 5};
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
            menor = numeros[i];
            }
        }
        JOptionPane.showMessageDialog(null, "El menor es: " + menor);
    }
    
}
