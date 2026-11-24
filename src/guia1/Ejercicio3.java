package guia1;

import javax.swing.JOptionPane;

public class Ejercicio3 {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "3. Ingrese su edad:"));
        if (edad < 0) {
            JOptionPane.showMessageDialog(null, "Edad inválida.");
        } else if (edad >= 18) {
            JOptionPane.showMessageDialog(null, "Puede ingresar.");
        } else {
            JOptionPane.showMessageDialog(null, "Acceso denegado.");
        }
    }
}