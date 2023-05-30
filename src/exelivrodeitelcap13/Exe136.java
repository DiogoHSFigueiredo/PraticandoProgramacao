package exelivrodeitelcap13;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Diogo
 */
public class Exe136 extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < 10; i++) {
            g.setColor(Color.BLACK);
            g.drawArc(250 - i * 25, 250 - i * 25, 50 + i * 50, 50 + i * 50, 0, 360);

        }

    }
}
