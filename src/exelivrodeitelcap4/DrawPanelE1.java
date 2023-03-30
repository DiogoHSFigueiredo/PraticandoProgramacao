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
public class DrawPanelE1 extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        int c = 0;
        int d = height;
        while (d > -1) {

            g.drawLine(0, 0, c, d);
            g.drawLine(c, d, width, height);
            g.drawLine(width, 0, c, c);
            g.drawLine(0, height, c, c);

            c += 15;
            d -= 15;

        }

    }

}
