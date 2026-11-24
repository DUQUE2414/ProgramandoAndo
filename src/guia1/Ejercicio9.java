package guia1;

import javax.swing.JOptionPane;

public class Ejercicio9 {
    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {

        String usuario = "admin";
        int clave = 1234;

        String UsuarioIngresado = JOptionPane.showInputDialog("Ingrese el nombre de usuario:");

        int ClaveIngresada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la clave:"));

        if (UsuarioIngresado.equals(usuario) && ClaveIngresada == clave) {
            JOptionPane.showMessageDialog(null, "Bienvenido, " + UsuarioIngresado + "!");
        } else {
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas.");
        }
    }
}