/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap13;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JPanel;

/**
 *
 * @author Diogo
 */
public class Exe1312 extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        for (int i = 0; i < 8; i++) {

            g2d.draw(new Line2D.Double(1 + i * 71, 0, 1 + i * 71, 500));
            g2d.draw(new Line2D.Double(0, 1 + i * 71, 500, 1 + i * 71));
        }

    }

}
