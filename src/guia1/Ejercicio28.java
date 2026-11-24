package guia1;

import javax.swing.JOptionPane;

public class Ejercicio28 {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        String resultado = "";

        for (int i = 1; i <= 20; i++) {

            int cubo = i * i * i;

            resultado += i + " al cubo es: " + cubo + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}