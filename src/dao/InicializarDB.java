package dao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import conexion.ConexionDB;

public class InicializarDB {
        public static void crearTablas() {
                // 1. Tabla de usuarios para el Login
                String sqlUsuarios = "CREATE TABLE IF NOT EXISTS usuarios (" +
                                "id         INTEGER PRIMARY KEY AUTOINCREMENT," +
                                "username   TEXT    NOT NULL UNIQUE," +
                                "password   TEXT    NOT NULL," +
                                "tipo_user  TEXT    NOT NULL DEFAULT 'vendedor')";

                // 2. Tabla de videojuegos del catálogo
                String sqlVideojuegos = "CREATE TABLE IF NOT EXISTS videojuegos (" +
                                "id          INTEGER PRIMARY KEY AUTOINCREMENT," +
                                "titulo      TEXT    NOT NULL," +
                                "genero      TEXT    NOT NULL," +
                                "plataforma  TEXT    NOT NULL," +
                                "lanzamiento INTEGER NOT NULL," +
                                "precio      REAL    NOT NULL)";

                try (Connection conexion = ConexionDB.getConexion();
                                Statement stmt = conexion.createStatement()) {

                        // Ejecutamos la creación de tablas
                        stmt.execute(sqlUsuarios);
                        stmt.execute(sqlVideojuegos);

                        // Insertamos los usuarios iniciales por defecto
                        stmt.execute("INSERT OR IGNORE INTO usuarios (username, password) VALUES ('admin','123','admin')");
                        stmt.execute("INSERT OR IGNORE INTO usuarios (username, password) VALUES ('empleado','emp123','vendedor')");

                        // Insertamos los videojuegos de prueba (Corregido 'IGNRE' por 'IGNORE')
                        stmt.execute(
                                        "INSERT OR IGNORE INTO videojuegos (titulo, genero, plataforma, lanzamiento, precio) VALUES ('GTA 6', 'Historia/Accion', 'PS5 / Xbox X/S', 2026, 300000)");
                        stmt.execute(
                                        "INSERT OR IGNORE INTO videojuegos (titulo, genero, plataforma, lanzamiento, precio) VALUES ('Resident Evil 4 Remake', 'Survival Horror', 'PS5 / PC', 2023, 80000)");
                        stmt.execute(
                                        "INSERT OR IGNORE INTO videojuegos (titulo, genero, plataforma, lanzamiento, precio) VALUES ('Alan Wake 2', 'Terror', 'PC', 2023, 100000)");

                        System.out.println("Base de datos y tablas de videojuegos inicializadas con éxito.");

                } catch (SQLException e) {
                        System.out.println("Error de base de datos: " + e.getMessage());
                }
        }
}
