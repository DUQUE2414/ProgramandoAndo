package dao; // Data Access Object (Objeto de Acceso a Datos)

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import conexionDB.ConexionDB;
import models.Videojuego;

public class VideojuegoDAO {

    private static boolean valoresNoNegativos(Videojuego juego) {
        if (juego == null) {
            return false;
        }
        if (juego.getLanzamiento() < 0) {
            System.out.println("Error de validación: el año de lanzamiento no puede ser negativo.");
            return false;
        }
        if (juego.getPrecio() < 0) {
            System.out.println("Error de validación: el precio no puede ser negativo.");
            return false;
        }
        return true;
    }

    public static boolean insertar(Videojuego juego) {
        if (!valoresNoNegativos(juego)) {
            return false;
        }

        String sql = "INSERT INTO videojuegos (titulo, genero, plataforma, lanzamiento, precio) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConexionDB.getConexion();
                PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, juego.getTitulo());
            ps.setString(2, juego.getGenero());
            ps.setString(3, juego.getPlataforma());
            ps.setInt(4, juego.getLanzamiento());
            ps.setDouble(5, juego.getPrecio());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al insertar videojuego: " + e.getMessage());
            return false;
        }
    }

    public static List<Videojuego> listarTodos() {
        List<Videojuego> lista = new ArrayList<>();
        String sql = "SELECT id, titulo, genero, plataforma, lanzamiento, precio FROM videojuegos ORDER BY id ASC";

        try (Connection conn = ConexionDB.getConexion();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Videojuego juego = new Videojuego(
                        rs.getInt("id"),
                        rs.getString("titulo"),
                        rs.getString("genero"),
                        rs.getString("plataforma"),
                        rs.getInt("lanzamiento"),
                        rs.getDouble("precio"));
                lista.add(juego);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar videojuegos: " + e.getMessage());
        }

        return lista;
    }

    public static Videojuego buscarPorId(int id) {
        String sql = "SELECT id, titulo, genero, plataforma, lanzamiento, precio FROM videojuegos WHERE id = ?";

        try (Connection conn = ConexionDB.getConexion();
                PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Videojuego(
                            rs.getInt("id"),
                            rs.getString("titulo"),
                            rs.getString("genero"),
                            rs.getString("plataforma"),
                            rs.getInt("lanzamiento"),
                            rs.getDouble("precio"));
                }
            }

        } catch (SQLException e) {
            System.out.println("Error al buscar videojuego por ID: " + e.getMessage());
        }

        return null;
    }

    public static boolean actualizar(Videojuego juego) {
        if (!valoresNoNegativos(juego)) {
            return false;
        }

        String sql = "UPDATE videojuegos SET titulo = ?, genero = ?, plataforma = ?, lanzamiento = ?, precio = ? WHERE id = ?";

        try (Connection conn = ConexionDB.getConexion();
                PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, juego.getTitulo());
            ps.setString(2, juego.getGenero());
            ps.setString(3, juego.getPlataforma());
            ps.setInt(4, juego.getLanzamiento());
            ps.setDouble(5, juego.getPrecio());
            ps.setInt(6, juego.getId());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al actualizar videojuego: " + e.getMessage());
            return false;
        }
    }

    public static boolean eliminar(int id) {
        String sql = "DELETE FROM videojuegos WHERE id = ?";

        try (Connection conn = ConexionDB.getConexion();
                PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al eliminar videojuego: " + e.getMessage());
            return false;
        }
    }
}