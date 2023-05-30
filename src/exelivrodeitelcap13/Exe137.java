/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap13;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;

/**
 *
 * @author Diogo
 */
public class Exe137 extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        for (int i = 0; i < 10; i++) {
            g2d.draw(new Ellipse2D.Double(10 + i * 10, 10 + i * 10, 80 + i * 5, 180));

        }

    }

}
