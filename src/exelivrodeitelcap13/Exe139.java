/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap13;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.security.SecureRandom;
import javax.swing.JPanel;

/**
 *
 * @author Diogo
 */
public class Exe139 extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        SecureRandom aleatorio = new SecureRandom();

        Graphics2D g2d = (Graphics2D) g;
        GeneralPath triangulo = new GeneralPath();

        for (int i = 0; i < 10; i++) {

            triangulo.moveTo(10 + i * aleatorio.nextInt(50), 0 + i * aleatorio.nextInt(50));
            triangulo.lineTo(0 + i * aleatorio.nextInt(50), 10 + i * aleatorio.nextInt(50));
            triangulo.lineTo(20 + i * aleatorio.nextInt(50), 10 + i * aleatorio.nextInt(50));
            triangulo.closePath();
            g2d.fill(triangulo);

            g2d.setColor(new Color(aleatorio.nextInt(256), aleatorio.nextInt(256), aleatorio.nextInt(256)));
        }
    }

}
