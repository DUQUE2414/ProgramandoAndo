package dao; // Data Access Object (Objeto de Acceso a Datos)

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import conexionDB.ConexionDB;
import models.Usuario;

public class UsuarioDAO {

    public static Usuario validarLogin(String userIngresado, String passIngresada) {
        String sql = "SELECT id, username, password, tipo_user FROM usuarios WHERE username = ? AND password = ?";
        Usuario usuarioEncontrado = null;

        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, userIngresado);
            ps.setString(2, passIngresada);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    int id = rs.getInt("id");
                    String user = rs.getString("username");
                    String pass = rs.getString("password");
                    String tipoUser = rs.getString("tipo_user");

                    usuarioEncontrado = new Usuario(id, user, pass, tipoUser);
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error al validar el login en la base de datos: " + e.getMessage()
            );
        }

        return usuarioEncontrado;
    }
}