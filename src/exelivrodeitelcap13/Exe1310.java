/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap13;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;

/**
 *
 * @author Diogo
 */
public class Exe1310 extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        SecureRandom aleatorio = new SecureRandom();

        String[] caracter = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for (int i = 0; i < 90; i++) {
            Font[] font = {new Font("SansSerif", Font.PLAIN, aleatorio.nextInt(200)), new Font("Monospaced", Font.BOLD, aleatorio.nextInt(200)), new Font("Serif", Font.ITALIC, aleatorio.nextInt(200)), new Font("Arial-Black", Font.BOLD, aleatorio.nextInt(200))};

            g.setColor(new Color(aleatorio.nextInt(256), aleatorio.nextInt(256), aleatorio.nextInt(256)));
            g.setFont(font[aleatorio.nextInt(4)]);
            g.drawString(caracter[aleatorio.nextInt(26)], aleatorio.nextInt(600), aleatorio.nextInt(600));

        }

    }
}
