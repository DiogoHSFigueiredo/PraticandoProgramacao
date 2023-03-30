package exelivrodeitelcap6;

import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;

/**
 * @author Diogo
 */
public class FormasAleatorias10 extends JPanel {

    SecureRandom random = new SecureRandom();

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        for (int i = 1; i <= 10; i++) {

            int chose = 1 + random.nextInt(2);

            int c1 = 1 + random.nextInt(600);
            int c2 = 1 + random.nextInt(600);
            int c3 = 1 + random.nextInt(600);
            int c4 = 1 + random.nextInt(600);

            int colorR = 1 + random.nextInt(255);
            int colorG = 1 + random.nextInt(255);
            int colorB = 1 + random.nextInt(255);
            Color cor = new Color(colorR, colorG, colorB);

            if (chose == 1) {
                g.setColor(cor);
                g.fillOval(c1, c2, c3, c4);

            } else if (chose == 2) {
                g.setColor(cor);
                g.fillRect(c1, c2, c3, c4);
            }
        }

    }

}
