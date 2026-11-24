package guia2;

import javax.swing.JOptionPane;
import dao.InicializarDB;
import models.Usuario;
import views.MenuLogin;
import views.MenuVideojuegos;

public class Main {

    public static void main(String[] args) {
        while (true) {
            String menuPrincipal = "Elige una opcion\n\n"
                    + "1. Guia 1 (Condicionales y Ciclos)\n"
                    + "2. Guia 2 (Try-Catch y Base de Datos)\n"
                    + "3. Salir";

            String entrada = JOptionPane.showInputDialog(null, menuPrincipal, "Menu Principal", JOptionPane.PLAIN_MESSAGE);
            if (entrada == null) {
                break;
            }

            int opcion = parsearEntero(entrada);
            switch (opcion) {
                case 1:
                    Guia1Menu.mostrarSubmenuGuia1();
                    break;
                case 2:
                    mostrarSubmenuGuia2();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida. Elige 1, 2 o 3.");
            }
        }
    }

    private static void mostrarSubmenuGuia2() {
        while (true) {
            String menuGuia2 = "Elige una opcion - Guia 2\n\n"
                    + "1. Ejercicios try-catch\n"
                    + "2. Inicializar Base de Datos\n"
                    + "3. Login y Catalogo\n"
                    + "4. Volver";

            String entrada = JOptionPane.showInputDialog(null, menuGuia2, "Guia 2", JOptionPane.PLAIN_MESSAGE);
            if (entrada == null) {
                return;
            }

            int opcion = parsearEntero(entrada);
            switch (opcion) {
                case 1:
                    Guia2TryCatchMenu.mostrarMenuTryCatch();
                    break;
                case 2:
                    InicializarDB.crearTablas();
                    JOptionPane.showMessageDialog(null, "Base de datos inicializada.");
                    break;
                case 3:
                    ejecutarFlujoBaseDatos();
                    break;
                case 4:
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida. Elige entre 1 y 4.");
            }
        }
    }

    private static void ejecutarFlujoBaseDatos() {
        Usuario usuarioLogueado = MenuLogin.mostrarLogin();
        if (usuarioLogueado == null) {
            JOptionPane.showMessageDialog(null, "Acceso cancelado o sin intentos disponibles.");
            return;
        }

        int opcion;
        do {
            String menuBD = "=== SISTEMA CATALOGO (Usuario: " + usuarioLogueado.getUsername()
                    + " | Rol: " + usuarioLogueado.getTipoUser() + ") ===\n\n"
                    + "1. Gestionar Videojuegos (CRUD)\n"
                    + "2. Cerrar sesion / Volver";

            String entrada = JOptionPane.showInputDialog(null, menuBD, "Base de Datos", JOptionPane.PLAIN_MESSAGE);
            if (entrada == null) {
                break;
            }

            opcion = parsearEntero(entrada);
            switch (opcion) {
                case 1:
                    MenuVideojuegos.mostrarMenu(usuarioLogueado);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Sesion cerrada.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida.");
            }
        } while (opcion != 2);
    }

    private static int parsearEntero(String texto) {
        try {
            return Integer.parseInt(texto.trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa un numero valido.", "Error", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }
}