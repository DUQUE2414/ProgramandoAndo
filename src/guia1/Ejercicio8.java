package guia1;

import javax.swing.JOptionPane;

public class Ejercicio8 {
    public void Ejecutar() {
        double ventas = Double.parseDouble(JOptionPane.showInputDialog(null, "8. Ingrese el valor de la compra:"));
        double descuento = 0;

        if (ventas > 500000) {
            descuento = 0.20;
        } else if (ventas > 200000) {
            descuento = 0.15;
        } else if (ventas > 100000) {
            descuento = 0.10;
        }

        double valorDescuento = ventas * descuento;
        double total = ventas - valorDescuento;

        JOptionPane.showMessageDialog(null, "Valor original: " + ventas + "\nDescuento aplicado: " + (descuento * 100) + "% (" + valorDescuento + ")\nTotal a pagar: " + total);
    }
}
