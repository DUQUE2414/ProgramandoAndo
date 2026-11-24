package guia2;

import javax.swing.JOptionPane;

public class Guia1Menu {

    public static void mostrarSubmenuGuia1() {
        while (true) {
            String menu = "Elige una opcion - Guia 1\n\n"
                    + "1. Condicionales\n"
                    + "2. Ciclos\n"
                    + "3. Volver";

            String entrada = JOptionPane.showInputDialog(null, menu, "Guia 1", JOptionPane.PLAIN_MESSAGE);
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
                case 1:
                    menuCondicionales();
                    break;
                case 2:
                    menuCiclos();
                    break;
                case 3:
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Elige 1, 2 o 3.");
            }
        }
    }

    private static void menuCondicionales() {
        while (true) {
            String lista = "=== CONDICIONALES (Elige un numero) ===\n"
                    + "1. Positivo, negativo o cero\n"
                    + "2. Numero par o impar\n"
                    + "3. Validar edad de ingreso\n"
                    + "4. Calculadora basica (+, -, *, /)\n"
                    + "5. Año bisiesto\n"
                    + "6. Clasificacion de nota (0-100)\n"
                    + "7. Mayor de tres numeros\n"
                    + "8. Descuento por compra\n"
                    + "9. Simulacion de login basico\n"
                    + "10. Calculo y clasificacion de IMC\n"
                    + "0. Volver";

            String entrada = JOptionPane.showInputDialog(null, lista, "Condicionales", JOptionPane.PLAIN_MESSAGE);
            if (entrada == null) {
                return;
            }

            int num;
            try {
                num = Integer.parseInt(entrada.trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingresa un numero valido.");
                continue;
            }

            if (num == 0) {
                return;
            }

            // Reemplaza cada llamada por el nombre real de tu clase dentro de paquete guia1
            switch (num) {
                case 1:  guia1.Ejercicio1.ejecutar();  break;
                case 2:  guia1.Ejercicio2.ejecutar();  break;
                case 3:  guia1.Ejercicio3.ejecutar();  break;
                case 4:  guia1.Ejercicio4.ejecutar();  break;
                case 5:  guia1.Ejercicio5.ejecutar();  break;
                case 6:  guia1.Ejercicio6.ejecutar();  break;
                case 7:  guia1.Ejercicio7.ejecutar();  break;
                case 8:  guia1.Ejercicio8.ejecutar();  break;
                case 9:  guia1.Ejercicio9.ejecutar();  break;
                case 10: guia1.Ejercicio10.ejecutar(); break;
                default:
                    JOptionPane.showMessageDialog(null, "Elige entre 1 y 10 (o 0 para volver).");
            }
        }
    }

    private static void menuCiclos() {
        while (true) {
            String lista = "=== CICLOS (Elige un numero) ===\n"
                    + "11. Numeros del 1 al 50 (for)\n"
                    + "12. Numeros del 50 al 1 (for)\n"
                    + "13. Pares del 1 al 100 (for)\n"
                    + "14. Impares del 1 al 100 (while)\n"
                    + "15. Suma del 1 al 100 (for)\n"
                    + "16. Suma de impares del 1 al 50 (for)\n"
                    + "17. Tabla de multiplicar del 7\n"
                    + "18. Tablas del 1 al 10 (for anidados)\n"
                    + "19. Multiplos de 10 del 1 al 200\n"
                    + "20. Divisibles entre 3 y 5 (1 al 100)\n"
                    + "21. Factorial de un numero\n"
                    + "22. Imprimir arreglo de 10 numeros\n"
                    + "23. Suma de elementos de un arreglo\n"
                    + "24. Mayor numero de un arreglo\n"
                    + "25. Menor numero de un arreglo\n"
                    + "26. Contar ocurrencias en un arreglo\n"
                    + "27. Cuadrado 6x6 de asteriscos\n"
                    + "28. Primeros 20 numeros y su cubo\n"
                    + "29. Recorrer texto caracter por linea\n"
                    + "0. Volver";

            String entrada = JOptionPane.showInputDialog(null, lista, "Ciclos", JOptionPane.PLAIN_MESSAGE);
            if (entrada == null) {
                return;
            }

            int num;
            try {
                num = Integer.parseInt(entrada.trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingresa un numero valido.");
                continue;
            }

            if (num == 0) {
                return;
            }

            // Reemplaza cada llamada por el nombre real de tu clase dentro de paquete guia1
            switch (num) {
                case 11: guia1.Ejercicio11.ejecutar(); break;
                case 12: guia1.Ejercicio12.ejecutar(); break;
                case 13: guia1.Ejercicio13.ejecutar(); break;
                case 14: guia1.Ejercicio14.ejecutar(); break;
                case 15: guia1.Ejercicio15.ejecutar(); break;
                case 16: guia1.Ejercicio16.ejecutar(); break;
                case 17: guia1.Ejercicio17.ejecutar(); break;
                case 18: guia1.Ejercicio18.ejecutar(); break;
                case 19: guia1.Ejercicio19.ejecutar(); break;
                case 20: guia1.Ejercicio20.ejecutar(); break;
                case 21: guia1.Ejercicio21.ejecutar(); break;
                case 22: guia1.Ejercicio22.ejecutar(); break;
                case 23: guia1.Ejercicio23.ejecutar(); break;
                case 24: guia1.Ejercicio24.ejecutar(); break;
                case 25: guia1.Ejercicio25.ejecutar(); break;
                case 26: guia1.Ejercicio26.ejecutar(); break;
                case 27: guia1.Ejercicio27.ejecutar(); break;
                case 28: guia1.Ejercicio28.ejecutar(); break;
                case 29: guia1.Ejercicio29.ejecutar(); break;
                default:
                    JOptionPane.showMessageDialog(null, "Elige entre 11 y 29 (o 0 para volver).");
            }
        }
    }
}