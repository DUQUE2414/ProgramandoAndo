package guia1;

import javax.swing.JOptionPane;

public class ejercicio9 {
    public void Ejecutar() {
        String usuario = JOptionPane.showInputDialog(null, "9. Ingrese usuario:");
        String password = JOptionPane.showInputDialog(null, "9. Ingrese contraseña:");

        if ("admin".equals(usuario) && "1234".equals(password)) {
            JOptionPane.showMessageDialog(null, "Bienvenido");
        } else {
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
        }
    }
}
