// Imprimir los numeros del 1 al 50 usando un ciclo for

package guia1;

import javax.swing.JOptionPane;

public class Ejercicio11 {
    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {

        String Acumulador = "";

        for (int i = 1; i <= 50; i++) {
            Acumulador = Acumulador + i + "\n";
        }

        JOptionPane.showMessageDialog(null, Acumulador, "Lista de numeros del 1 al 50", JOptionPane.INFORMATION_MESSAGE);
    }
}
