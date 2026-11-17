import javax.swing.JOptionPane;
import ConexionDb.InicializarDB; // Importamos el paquete de la base de datos

public class main {
    public static void main(String[] args) {
        
        int opcion = 0;

        do {
            try {
                String menu = "=== MENÚ PRINCIPAL ===\n" +
                              "1. Inicializar / Crear Base de Datos\n" +
                              "2. Salir\n\n" +
                              "Seleccione una opción:";

                String entrada = JOptionPane.showInputDialog(null, menu);

                // Si el usuario presiona cancelar o la X, salimos del programa
                if (entrada == null) {
                    break;
                }

                opcion = Integer.parseInt(entrada);

                switch (opcion) {
                    case 1:
                        // Llamamos al método que crea la tabla productos en SQLite
                        InicializarDB.crearTablas();
                        JOptionPane.showMessageDialog(null, "¡Base de datos y tablas inicializadas con éxito! Revisa la raíz de tu proyecto.");
                        break;
                        
                    case 2:
                        JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida. Intente entre 1 y 2.");
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } while (opcion != 2);
    }
}