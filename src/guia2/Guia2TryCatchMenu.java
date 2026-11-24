package guia2;

import javax.swing.JOptionPane;

public class Guia2TryCatchMenu {

    public static void mostrarMenuTryCatch() {
        while (true) {
            String menu = "EJERCICIOS TRY-CATCH (GUIA 2) \n"
                    + "1. Division entera basica\n"
                    + "2. Conversion de temperatura\n"
                    + "3. Calculadora de IMC\n"
                    + "4. Acceso a arreglo por indice\n"
                    + "5. Validacion con bucle (retry)\n"
                    + "6. Cancelacion del dialogo (NullPointerException)\n"
                    + "0. Volver";

            String entrada = JOptionPane.showInputDialog(null, menu, "Try-Catch", JOptionPane.PLAIN_MESSAGE);
            if (entrada == null) {
                return;
            }

            int opcion;
            try {
                opcion = Integer.parseInt(entrada.trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingresa un numero valido.");
                continue;
            }

            switch (opcion) {
                case 0:
                    return;
                case 1:
                    Ejercicio1.ejecutar();
                    break;
                case 2:
                    Ejercicio2.ejecutar();
                    break;
                case 3:
                    Ejercicio3.ejecutar();
                    break;
                case 4:
                    Ejercicio4.ejecutar();
                    break;
                case 5:
                    Ejercicio5.ejecutar();
                    break;
                case 6:
                    Ejercicio6.ejecutar();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Elige entre 0 y 6.");
            }
        }
    }
}