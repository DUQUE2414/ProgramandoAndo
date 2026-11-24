package views;

import javax.swing.JOptionPane;
import dao.UsuarioDAO;
import models.Usuario;

public class MenuLogin {
    public static Usuario mostrarLogin() {
        int intentosMaximos = 3;

        for (int intentos = 1; intentos <= intentosMaximos; intentos++) {

            // pedir datos al usuario
            String usuarioInput = JOptionPane.showInputDialog(null,
                    "INICIO DE SESIÓN \nIntento " + intentos + " de " + intentosMaximos
                            + "\n\nIngrese su usuario:");

            if (usuarioInput == null) {
                return null;
            }

            String passwordInput = JOptionPane.showInputDialog(null, "Ingrese su contraseña:");

            if (passwordInput == null) {
                return null;
            }

            Usuario usuarioAutenticado = UsuarioDAO.validarLogin(usuarioInput, passwordInput);

            if (usuarioAutenticado != null) {
                JOptionPane.showMessageDialog(null,
                        "¡Bienvenido al sistema, " + usuarioAutenticado.getUsername() + "!");
                return usuarioAutenticado; // ¡Login exitoso Retornamos el objeto usuario
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.", "Error de Autenticación",
                        JOptionPane.ERROR_MESSAGE);

            }
        }

        JOptionPane.showMessageDialog(null, "Ha superado el número máximo de intentos. Saliendo...", "Bloqueado", JOptionPane.ERROR_MESSAGE);
        return null; // Si se agotan los intentos
    }
}
