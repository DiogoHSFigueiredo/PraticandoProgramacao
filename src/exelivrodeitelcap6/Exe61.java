package exelivrodeitelcap6;

/**
 *
 * @author Diogo
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Exe61 extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.setColor(Color.WHITE);

        for (int i = 1; i <= 8; i++) {

            g.fillOval(100 + i * 15, 100 + i * 15, 300 - i * 30, 300 - i * 30);
            if (i % 2 == 0) {
                g.setColor(Color.BLACK);
            } else {
                g.setColor(Color.WHITE);
            }
        }

    }

}
