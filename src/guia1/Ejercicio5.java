package guia1;

import javax.swing.JOptionPane;

public class Ejercicio5 {
    public void Ejecutar() {
        int anio = Integer.parseInt(JOptionPane.showInputDialog(null, "5. Ingrese un año:"));
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            JOptionPane.showMessageDialog(null, "El año " + anio + " es bisiesto.");
        } else {
            JOptionPane.showMessageDialog(null, "El año " + anio + " NO es bisiesto.");
        }
    }
}
