package guia1;

import javax.swing.JOptionPane;

public class Ejercicio16 {
    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {

        int impar[] = new int[50];
        int suma = 0;

        for (int i = 0; i < impar.length; i++) {

            impar[i] = i + 1;

            if (impar[i] % 2 != 0) {
                suma += impar[i];
            }
        }

        JOptionPane.showMessageDialog(null,
                "La suma de los números impares del 1 hasta el 50 es: " + suma);
    }
}