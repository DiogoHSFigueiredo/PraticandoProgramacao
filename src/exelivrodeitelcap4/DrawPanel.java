package exelivrodeitelcap4;
import java.awt.Graphics;
import javax.swing.JPanel;
//Classe para praticar utilizacao de GUI do java.

public class DrawPanel extends JPanel {

    //desenha um x a partir dos cantos do painel
    public void paintComponent(Graphics g) {

        //chama paintComponent para assegurar que o painel é exibido corretamente
        super.paintComponent(g);

        int width = getWidth(); //largura total
        int height = getHeight(); //altura total

        //desenha uma linha a a partir do canto superior esquerdo até  inferior direito
        g.drawLine(0, 0, width, height);

        //desenha uma linha a partir do canto inferior esquerdo ate o superior direito
        g.drawLine(0, height, width, 0);
    }

}
