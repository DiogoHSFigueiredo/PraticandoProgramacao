/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap1;

/**
 *
 * @author Diogo
 */
import java.awt.Graphics;
import javax.swing.JPanel;

public class PainelDesenho extends JPanel {

// desenha um x a partir dos cantos do painel
    public void paintComponent(Graphics g) {
        //Chama o paintComponent para assegurar que o painel e exibido corretamente
        super.paintComponent(g);
        int width = getWidth(); // largura total
        int height = getHeight(); // altura total

        // desenha uma linha a partir do canto superior esquerdo ate o inferior direito
        for (int i = 0; i < 25; i++) {
            g.drawLine(0, 0, i * 15, height - (i * 15));
            g.drawLine(width, height, i * 15, height - (i * 15));
            g.drawLine(0, height, i * 15, i * 15);
            g.drawLine(width, 0, i * 15, i * 15);
        }

        // desenha uma linha a aprtir do canto inferior esquerdo ate o superior direito
        //g.drawLine(0, height, width, 0);
    }
}
