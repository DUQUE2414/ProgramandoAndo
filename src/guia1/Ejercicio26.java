package guia1;

import javax.swing.JOptionPane;

public class Ejercicio26 {

    static void main(String[] args) {

        int[] numeros = new int[]{12, 12, 12, 12, 5, 6, 33, 5};
        int repetido = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == repetido) {
                contador++;
                
                JOptionPane.showMessageDialog(null,
            "El número " + repetido +
            " aparece " + contador + " veces");
            }
        }
    }
    
}
