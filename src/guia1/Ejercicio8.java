package guia1;

import javax.swing.JOptionPane;

public class Ejercicio8 {
    public static void main(String[] args) {

        try {
            double compraValor = Double.parseDouble(
                    JOptionPane.showInputDialog("Ingrese el valor de la compra:"));

            double porcentajeDescuento = 0.0;

            if (compraValor < 0) {
                throw new IllegalArgumentException("Solo se permiten numeros mayores a 0");
            }

            if (compraValor > 500000) {
                porcentajeDescuento = 0.20;
            } else if (compraValor > 200000) {
                porcentajeDescuento = 0.15;
            } else if (compraValor > 100000) {
                porcentajeDescuento = 0.10;
            } else {
                porcentajeDescuento = 0.0;
            }

            double valorDescuento = compraValor * porcentajeDescuento;
            double totalPagar = compraValor - valorDescuento;

            String resultado = "Valor original: $" + compraValor + "\n" +
                    "Descuento aplicado: " + (porcentajeDescuento * 100) + "% (-$" + valorDescuento + ")\n" +
                    "Total a pagar: $" + totalPagar;

            JOptionPane.showMessageDialog(null, resultado, "Resumen de Compra", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Solo se permiten numeros positivos");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}