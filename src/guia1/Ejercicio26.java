package guia1;

import javax.swing.JOptionPane;

public class Ejercicio26 {
    public void Ejecutar() {
        int[] numeros = {5, 2, 8, 2, 9, 2, 1, 4};
        int buscar = Integer.parseInt(JOptionPane.showInputDialog(null, "26. Arreglo: [5, 2, 8, 2, 9, 2, 1, 4]\nIngrese número a buscar:"));
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscar) {
                contador++;
            }
        }
        JOptionPane.showMessageDialog(null, "El número " + buscar + " aparece " + contador + " veces en el arreglo.");
    }
}
