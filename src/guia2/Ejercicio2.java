// El programa recibe una temperatura en Celsius y la convierte a Fahrenheit. 
// Si el usuario escribe letras o deja el campo vacío, se muestra un mensaje de advertencia

package guia2;

import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {

        try {
            JOptionPane.showMessageDialog(
                    null, "Convertidor de Temperatura");

            double temperatura = Double.parseDouble(
                    JOptionPane.showInputDialog("Ingrese la temperatura en C°"));

            JOptionPane.showMessageDialog(
                    null, "Grados C° a F°: " + (temperatura * 9.0 / 5) + 32 + "F°");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    null, "Ingresa un numero valido. Ejemplo 36.5");
        }
    }
}
