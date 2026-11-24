package guia1;

import javax.swing.JOptionPane;

public class Ejercicio14 {
    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {

        int[] numerosImpares = new int[50];
        int numero = 1;
        int posicion = 0;

        JOptionPane.showMessageDialog(null, "Numeros impares del 1 al 100");
        JOptionPane.showMessageDialog(null, "Presione Aceptar para continuar...");

        while (numero <= 100) {
            if (numero % 2 != 0) {
                numerosImpares[posicion] = numero;
                posicion++;
            }
            numero++;
        }

        int i = 0;
        String resultado = "";

        while (i < numerosImpares.length) {
            resultado += numerosImpares[i] + "\n";
            i++;
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}