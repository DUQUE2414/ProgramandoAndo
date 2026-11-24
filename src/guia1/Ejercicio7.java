package guia1;

import javax.swing.JOptionPane;

public class Ejercicio7 {
    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero:"));

        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero:"));

        int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero:"));

        if (numero1 == numero2 && numero2 == numero3) {
            JOptionPane.showMessageDialog(null, "Los tres numeros son iguales");
        } else if (numero1 == numero2 && numero1 > numero3) {
            JOptionPane.showMessageDialog(null, "El numero 1 y 2 empatan como mayores");
        } else if (numero1 == numero3 && numero1 > numero2) {
            JOptionPane.showMessageDialog(null, "El numero 1 y 3 empatan como mayores");
        } else if (numero2 == numero3 && numero2 > numero1) {
            JOptionPane.showMessageDialog(null, "El numero 2 y 3 empatan como mayores");
        } else if (numero1 > numero2 && numero1 > numero3) {
            JOptionPane.showMessageDialog(null, "El numero mayor es: " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            JOptionPane.showMessageDialog(null, "El numero mayor es: " + numero2);
        } else {
            JOptionPane.showMessageDialog(null, "El numero mayor es: " + numero3);
        }
    }
}