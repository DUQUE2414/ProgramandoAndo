package guia1;

import javax.swing.JOptionPane;

public class Ejercicio10 {
    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        String entradaPeso = JOptionPane.showInputDialog("Ingrese su peso en kg:");
        if (entradaPeso == null) return;

        String entradaAltura = JOptionPane.showInputDialog("Ingrese su altura en metros (ej. 1.75):");
        if (entradaAltura == null) return;

        try {
            double peso = Double.parseDouble(entradaPeso.replace(',', '.'));
            double altura = Double.parseDouble(entradaAltura.replace(',', '.'));

            if (peso <= 0 || altura <= 0) {
                JOptionPane.showMessageDialog(null, "Error: Peso y altura deben ser valores positivos.");
            } else {
                double imc = peso / (altura * altura);
                String mensaje = String.format("Su IMC es: %.2f\n", imc);

                if (imc < 18.5) {
                    mensaje += "Bajo peso";
                } else if (imc >= 18.5 && imc <= 24.9) {
                    mensaje += "Normal";
                } else if (imc >= 25 && imc <= 29.9) {
                    mensaje += "Sobrepeso";
                } else {
                    mensaje += "Obesidad";
                }
                JOptionPane.showMessageDialog(null, mensaje);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Por favor ingrese valores numéricos válidos.");
        }
    }
}
