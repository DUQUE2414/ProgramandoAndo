package guia1;

import javax.swing.JOptionPane;

public class Ejercicio18 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("\n--- Tabla del " + i + " ---");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
        JOptionPane.showMessageDialog(null, "Tablas de multiplicar del 1 al 10 generadas en la consola.");
    }
}
