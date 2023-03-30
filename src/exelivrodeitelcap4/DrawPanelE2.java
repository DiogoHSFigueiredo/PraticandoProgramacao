/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap4;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Diogo
 */
public class DrawPanelE2 extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
              
        int x = 0;

        while (x < height) {

            g.drawLine(0, x, x, height);
            g.drawLine(x, height, width, height - x);
            g.drawLine(0, x, width - x, 0);
            g.drawLine(x, 0, width, x);

            x += 15;
        }
    }

}
