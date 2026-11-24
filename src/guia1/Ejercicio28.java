package guia1;

import javax.swing.JOptionPane;

public class Ejercicio28 {
    public void Ejecutar() {
        StringBuilder sb = new StringBuilder("28. Primeros 20 números y su cubo:\n");
        for (int i = 1; i <= 20; i++) {
            long cubo = (long) i * i * i;
            sb.append("n = ").append(i).append(" | n^3 = ").append(cubo).append("\n");
        }
        System.out.println(sb.toString());
        JOptionPane.showMessageDialog(null, "28. Resultados generados (mostrados también en consola por tamaño).");
    }
}
