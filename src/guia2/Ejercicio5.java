// El programa pide un número entre 1 y 100. Si el usuario ingresa texto o un número fuera de rango, 
// el cuadro de diálogo se muestra de nuevo hasta que el dato sea correcto. 
// Este patrón simula la validación real de formularios.

package guia2;

import javax.swing.JOptionPane;

public class Ejercicio5 {
    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {

        int numero = 0;
        boolean valido = false;
        while (!valido) {
            try {
                numero = Integer.parseInt(
                        JOptionPane.showInputDialog("Ingrese un numero del 1 al 100"));

                if (numero < 1 || numero > 100) {
                    throw new IllegalArgumentException("Fuera de rango");
                }
                valido = true;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo numeros enteros. Intenta de nuevo");
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "El numero debe estar entre 1 a 100");
            }
        }
        JOptionPane.showMessageDialog(null, "Numero aceptado: " + numero);
    }
}
