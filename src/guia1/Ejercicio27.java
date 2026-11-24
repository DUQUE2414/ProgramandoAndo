package guia1;

import javax.swing.JOptionPane;

public class Ejercicio27 {
    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        int tamaño = 6;
        String acumulador = "";

        for (int i = 1; i <= tamaño; i++) {
            for (int j = 1; j <= tamaño; j++) {
                acumulador += "* ";
            }
            acumulador += "\n";
        }
        JOptionPane.showMessageDialog(null, acumulador, "Cuadrado de Asteriscos", JOptionPane.INFORMATION_MESSAGE);
    }
}