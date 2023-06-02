/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap13;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Diogo
 */
public class Exe1311 extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < 8; i++) {

            g.drawLine(1 + i * 71, 0, 1 + i * 71, 500);
            g.drawLine(0, 1 + i * 71, 500, 1 + i * 71);

        }

    }

}
