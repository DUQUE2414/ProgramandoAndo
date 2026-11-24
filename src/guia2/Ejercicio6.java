package guia2;

import javax.swing.JOptionPane;

public class Ejercicio6 {
    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {

        try {
            String nombre = JOptionPane.showInputDialog("Ingrese un nombre: ");

            if (nombre == null || nombre.isBlank()) {
                JOptionPane.showMessageDialog(null, "No se permite nada");
            }else{

            JOptionPane.showMessageDialog(
                    null, "Hola " + nombre.toUpperCase() + "!");
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null,
                    "Cancelaste la operacion");

        }
    }
}
