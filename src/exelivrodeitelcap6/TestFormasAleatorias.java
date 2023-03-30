package exelivrodeitelcap6;

import javax.swing.JFrame;

/**
 *
 * @author Diogo
 */
public class TestFormasAleatorias {

    public static void main(String[] args) {

        FormasAleatorias10 painel = new FormasAleatorias10();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(painel);
        app.setSize(600, 600);
        app.setVisible(true);

    }

}
