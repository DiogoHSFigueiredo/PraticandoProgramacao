/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap13;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Line2D;
import java.security.SecureRandom;
import javax.swing.JPanel;

/**
 *
 * @author Diogo
 */
public class Exe138 extends JPanel {

    SecureRandom aleatorio = new SecureRandom();

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        for (int i = 0; i < 30; i++) {
            g2d.setColor(new Color(aleatorio.nextInt(256), aleatorio.nextInt(256), aleatorio.nextInt(256)));
            g2d.setStroke(new BasicStroke(aleatorio.nextFloat(10)));
            g2d.draw(new Line2D.Double(aleatorio.nextDouble(800), aleatorio.nextDouble(800), aleatorio.nextDouble(800), aleatorio.nextDouble(800)));
        }

    }

}
