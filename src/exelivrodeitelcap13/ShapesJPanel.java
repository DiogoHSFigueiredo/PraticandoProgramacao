/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap13;

import exelivrodeitelcap8.Rectangler;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author Diogo
 */
public class ShapesJPanel extends JPanel {

    //desenha formas com Java 2D API
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g; //faz uma coercao em g para Graphics2D

        //desenha oval 2D preenchida com um gradiente azul-amarelo
        g2d.setPaint(new GradientPaint(5, 30, Color.BLUE, 35, 100, Color.YELLOW, true));
        g2d.fill(new Ellipse2D.Double(5, 30, 65, 100));

        //desenha retangulo arred 2d em vermelho
        g2d.setPaint(Color.RED);
        g2d.setStroke(new BasicStroke(10.0f));
        g2d.draw(new Rectangle2D.Double(80, 30, 65, 100));

        //desenha reng. arred. 2d com um fundo em buffer
        BufferedImage buffImage = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);

        //obtem Graphics2D de buffImage e desenha nela
        Graphics2D gg = buffImage.createGraphics();
        gg.setColor(Color.YELLOW);
        gg.fillRect(0, 0, 10, 10);
        gg.setColor(Color.BLACK);
        gg.drawRect(1, 1, 6, 6);
        gg.setColor(Color.BLUE);
        gg.fillRect(1, 1, 3, 3);
        gg.setColor(Color.RED);
        gg.fillRect(4, 4, 3, 3);

        //pinta buffImage sobre o JFrame
        g2d.setPaint(new TexturePaint(buffImage, new Rectangle(10, 10)));
        g2d.fill(new RoundRectangle2D.Double(155, 30, 75, 100, 50, 50));

        //desenha arco 2d em forma de torta em branco
        g2d.setPaint(Color.WHITE);
        g2d.setStroke(new BasicStroke(6.0f));
        g2d.draw(new Arc2D.Double(240, 30, 75, 100, 0, 270, Arc2D.PIE));

        //desenha linhas 2D em verde e amarelo
        g2d.setPaint(Color.GREEN);
        g2d.draw(new Line2D.Double(395, 30, 320, 150));

        //desenha uma linha 2D utilizando traco
        float[] dashes = {10}; //padrao de traço
        g2d.setPaint(Color.YELLOW);
        g2d.setStroke(new BasicStroke(4, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 10, dashes, 0));
        g2d.draw(new Line2D.Double(320,30,395,150));
        
    }

}
