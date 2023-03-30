/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap5;

import javax.swing.JPanel;
import java.awt.Graphics;

/**
 *
 * @author Diogo
 */
public class Shapes extends JPanel {

    private int choice; //escolhe a forma a desenhar

    public Shapes(int userChoice) {
        choice = userChoice;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < 10; i++) {
            switch (choice) {
                case 1: {
                    g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    break;
                }
                case 2: {
                    g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    break;
                }
                case 3: {

                    g.drawArc(360 - i * 10, 360 - i *10, 12 + i * 20, 12 + i * 20, 1, 360);

                }

            }
        }
    }
}
