package views;

import java.util.List;
import javax.swing.JOptionPane;
import dao.VideojuegoDAO;
import models.Usuario;
import models.Videojuego;

public class MenuVideojuegos {

    public static void mostrarMenu(Usuario usuarioLogueado) {
        if (usuarioLogueado == null) {
            return;
        }

        boolean esAdmin = "admin".equalsIgnoreCase(usuarioLogueado.getTipoUser());

        while (true) {
            String menu = "GESTION DE VIDEOJUEGOS \n"
                    + "Usuario: " + usuarioLogueado.getUsername()
                    + " (" + usuarioLogueado.getTipoUser() + ")\n\n"
                    + "1. Ver todos los videojuegos\n"
                    + "2. Buscar videojuego por ID\n";

            if (esAdmin) {
                menu += "3. Agregar videojuego\n"
                        + "4. Actualizar videojuego\n"
                        + "5. Eliminar videojuego\n"
                        + "6. Volver\n";
            } else {
                menu += "3. Volver\n";
            }

            menu += "\nSeleccione una opcion:";

            String entrada = JOptionPane.showInputDialog(null, menu, "Catalogo Videojuegos", JOptionPane.PLAIN_MESSAGE);
            if (entrada == null) {
                return;
            }

            int opcion;
            try {
                opcion = Integer.parseInt(entrada.trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingresa un numero valido.", "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            if (esAdmin) {
                switch (opcion) {
                    case 1:
                        listarVideojuegos();
                        break;
                    case 2:
                        buscarPorId();
                        break;
                    case 3:
                        agregarVideojuego();
                        break;
                    case 4:
                        actualizarVideojuego();
                        break;
                    case 5:
                        eliminarVideojuego();
                        break;
                    case 6:
                        return;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no valida.");
                }
            } else {
                switch (opcion) {
                    case 1:
                        listarVideojuegos();
                        break;
                    case 2:
                        buscarPorId();
                        break;
                    case 3:
                        return;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no valida.");
                }
            }
        }
    }

    private static void listarVideojuegos() {
        List<Videojuego> lista = VideojuegoDAO.listarTodos();
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay videojuegos registrados.");
            return;
        }

        StringBuilder sb = new StringBuilder("=== VIDEOJUEGOS REGISTRADOS ===\n\n");
        for (Videojuego v : lista) {
            sb.append("ID: ").append(v.getId())
                    .append(" | ").append(v.getTitulo())
                    .append(" | ").append(v.getGenero())
                    .append(" | ").append(v.getPlataforma())
                    .append(" | ").append(v.getLanzamiento())
                    .append(" | $").append(v.getPrecio())
                    .append("\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString(), "Listado", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void buscarPorId() {
        Integer id = pedirEnteroNoNegativo("Ingrese el ID del videojuego a buscar:");
        if (id == null) {
            return;
        }

        Videojuego v = VideojuegoDAO.buscarPorId(id);
        if (v == null) {
            JOptionPane.showMessageDialog(null, "No se encontro un videojuego con ID " + id + ".");
            return;
        }

        JOptionPane.showMessageDialog(
                null,
                "ID: " + v.getId() + "\n"
                        + "Titulo: " + v.getTitulo() + "\n"
                        + "Genero: " + v.getGenero() + "\n"
                        + "Plataforma: " + v.getPlataforma() + "\n"
                        + "Lanzamiento: " + v.getLanzamiento() + "\n"
                        + "Precio: $" + v.getPrecio(),
                "Detalle del Videojuego",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private static void agregarVideojuego() {
        String titulo = JOptionPane.showInputDialog(null, "Titulo:");
        if (titulo == null)
            return;

        String genero = JOptionPane.showInputDialog(null, "Genero:");
        if (genero == null)
            return;

        String plataforma = JOptionPane.showInputDialog(null, "Plataforma:");
        if (plataforma == null)
            return;

        Integer lanzamiento = pedirEnteroNoNegativo("Año de lanzamiento (no puede ser negativo):");
        if (lanzamiento == null)
            return;

        Double precio = pedirDoubleNoNegativo("Precio (no puede ser negativo):");
        if (precio == null)
            return;

        Videojuego nuevo = new Videojuego(titulo.trim(), genero.trim(), plataforma.trim(), lanzamiento, precio);
        if (VideojuegoDAO.insertar(nuevo)) {
            JOptionPane.showMessageDialog(null, "Videojuego registrado con exito.");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo registrar el videojuego.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void actualizarVideojuego() {
        Integer id = pedirEnteroNoNegativo("Ingrese el ID del videojuego a actualizar:");
        if (id == null)
            return;

        Videojuego existente = VideojuegoDAO.buscarPorId(id);
        if (existente == null) {
            JOptionPane.showMessageDialog(null, "No existe un videojuego con ID " + id + ".");
            return;
        }

        String titulo = JOptionPane.showInputDialog(null, "Nuevo titulo:", existente.getTitulo());
        if (titulo == null)
            return;

        String genero = JOptionPane.showInputDialog(null, "Nuevo genero:", existente.getGenero());
        if (genero == null)
            return;

        String plataforma = JOptionPane.showInputDialog(null, "Nueva plataforma:", existente.getPlataforma());
        if (plataforma == null)
            return;

        Integer lanzamiento = pedirEnteroNoNegativo("Nuevo año de lanzamiento (no puede ser negativo):");
        if (lanzamiento == null)
            return;

        Double precio = pedirDoubleNoNegativo("Nuevo precio (no puede ser negativo):");
        if (precio == null)
            return;

        Videojuego actualizado = new Videojuego(id, titulo.trim(), genero.trim(), plataforma.trim(), lanzamiento,
                precio);
        if (VideojuegoDAO.actualizar(actualizado)) {
            JOptionPane.showMessageDialog(null, "Videojuego actualizado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar el videojuego.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void eliminarVideojuego() {
        Integer id = pedirEnteroNoNegativo("Ingrese el ID del videojuego a eliminar:");
        if (id == null)
            return;

        int confirmar = JOptionPane.showConfirmDialog(
                null,
                "¿Seguro que deseas eliminar el videojuego con ID " + id + "?",
                "Confirmar eliminacion",
                JOptionPane.YES_NO_OPTION);

        if (confirmar == JOptionPane.YES_OPTION) {
            if (VideojuegoDAO.eliminar(id)) {
                JOptionPane.showMessageDialog(null, "Videojuego eliminado.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro o no se pudo eliminar el videojuego.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static Integer pedirEnteroNoNegativo(String mensaje) {
        while (true) {
            String entrada = JOptionPane.showInputDialog(null, mensaje);
            if (entrada == null) {
                return null;
            }
            try {
                int valor = Integer.parseInt(entrada.trim());
                if (valor < 0) {
                    JOptionPane.showMessageDialog(
                            null,
                            "El valor no puede ser negativo. Intenta de nuevo.",
                            "Valor invalido",
                            JOptionPane.WARNING_MESSAGE);
                    continue;
                }
                return valor;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Ingresa un numero entero valido.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static Double pedirDoubleNoNegativo(String mensaje) {
        while (true) {
            String entrada = JOptionPane.showInputDialog(null, mensaje);
            if (entrada == null) {
                return null;
            }
            try {
                double valor = Double.parseDouble(entrada.trim());
                if (valor < 0) {
                    JOptionPane.showMessageDialog(
                            null,
                            "El precio no puede ser negativo. Intenta de nuevo.",
                            "Valor invalido",
                            JOptionPane.WARNING_MESSAGE);
                    continue;
                }
                return valor;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Ingresa un numero decimal valido.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}