// Mostrar la tabla de multiplicar del numero 7 usando un ciclo for.


package guia1;

import javax.swing.JOptionPane;

public class Ejercicio17 {
    public static void main(String[] args) {
        
        String Acumulador = "";
        for (int i = 1; i <= 10; i++) {
            Acumulador = Acumulador + "7 x " + i + " = " + (7 * i) + "\n";
        }
        JOptionPane.showMessageDialog(null, Acumulador, "Tabla del 7", JOptionPane.INFORMATION_MESSAGE);
    }
}
