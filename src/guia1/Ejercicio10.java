package guia1;

import javax.swing.JOptionPane;

public class Ejercicio10 {
    public static void main(String[] args) {
        ejecutar();
    }
    public static void ejecutar() {
        double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "10. Ingrese su peso en kg:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "10. Ingrese su altura en metros:"));

        double imc = peso / (altura * altura);
        String clasificacion = "";

        if (imc < 18.5) {
            clasificacion = "Bajo peso";
        } else if (imc <= 24.9) {
            clasificacion = "Normal";
        } else if (imc <= 29.9) {
            clasificacion = "Sobrepeso";
        } else {
            clasificacion = "Obesidad";
        }

        JOptionPane.showMessageDialog(null, "IMC: " + String.format("%.2f", imc) + "\nClasificación: " + clasificacion);
    }
}