package dao; // Data Access Object (Objeto de Acceso a Datos)

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import conexionDB.ConexionDB;

public class InicializarDB {

        public static void crearTablas() {
                String sqlUsuarios = "CREATE TABLE IF NOT EXISTS usuarios (" +
                                "id        INTEGER PRIMARY KEY AUTOINCREMENT," +
                                "username  TEXT    NOT NULL UNIQUE," +
                                "password  TEXT    NOT NULL," +
                                "tipo_user TEXT    NOT NULL" +
                                ")";

                String sqlVideojuegos = "CREATE TABLE IF NOT EXISTS videojuegos (" +
                                "id          INTEGER PRIMARY KEY AUTOINCREMENT," +
                                "titulo      TEXT    NOT NULL," +
                                "genero      TEXT    NOT NULL," +
                                "plataforma  TEXT    NOT NULL," +
                                "lanzamiento INTEGER NOT NULL," +
                                "precio      REAL    NOT NULL" +
                                ")";

                try (Connection conn = ConexionDB.getConexion();
                                Statement stmt = conn.createStatement()) {

                        stmt.execute(sqlUsuarios);
                        stmt.execute(sqlVideojuegos);

                        stmt.execute("INSERT OR IGNORE INTO usuarios (username, password, tipo_user) VALUES ('admin', '123', 'admin')");
                        stmt.execute("INSERT OR IGNORE INTO usuarios (username, password, tipo_user) VALUES ('empleado', 'emp123', 'vendedor')");

                        try (ResultSet rs = stmt.executeQuery("SELECT COUNT(*) AS total FROM videojuegos")) {
                                if (rs.next() && rs.getInt("total") == 0) {
                                        stmt.execute("INSERT INTO videojuegos (titulo, genero, plataforma, lanzamiento, precio) VALUES ('GTA 6', 'Historia/Accion', 'PS5 / Xbox X/S', 2026, 300000)");
                                        stmt.execute("INSERT INTO videojuegos (titulo, genero, plataforma, lanzamiento, precio) VALUES ('Resident Evil 4 Remake', 'Survival Horror', 'PS5 / PC', 2023, 80000)");
                                        stmt.execute("INSERT INTO videojuegos (titulo, genero, plataforma, lanzamiento, precio) VALUES ('Alan Wake 2', 'Terror', 'PC', 2023, 100000)");
                                }
                        }

                        System.out.println("Base de datos y tablas inicializadas con éxito.");

                } catch (SQLException e) {
                        System.out.println("Error de base de datos: " + e.getMessage());
                }
        }
}