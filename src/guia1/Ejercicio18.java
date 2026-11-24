package guia1;

import javax.swing.JOptionPane;

public class Ejercicio18 {
    public void Ejecutar() {
        StringBuilder sb = new StringBuilder("18. Tablas de multiplicar del 1 al 10:\n");
        for (int i = 1; i <= 10; i++) {
            sb.append("--- Tabla del ").append(i).append(" ---\n");
            for (int j = 1; j <= 10; j++) {
                sb.append(i).append(" x ").append(j).append(" = ").append(i * j).append("\n");
            }
        }
        System.out.println(sb.toString());
        JOptionPane.showMessageDialog(null, "18. Tablas del 1 al 10 generadas (mostradas también en consola por extensión).");
    }
}
