// Se define un arreglo con 5 nombres. El usuario ingresa un número de posición. 
// Si el número está fuera del rango 0–4, Java lanza ArrayIndexOutOfBoundsException automáticamente.

package guia2;

import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {

        String[] nombres = { "Ana", "Daniel", "Samuel", "Sebas", "Sofia" };

        try {
            int i = Integer.parseInt(
                    JOptionPane.showInputDialog("Posicion ( 0 a 4 )"));

            JOptionPane.showMessageDialog(
                    null, "Nombre: " + nombres[i]);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    null, "Solo numeros enteros");
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(
                    null, "Posicion invalida. Solo rango ( 0 a 4 )");
        }
    }
}
