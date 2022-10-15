/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap6;

/**
 *
 * @author Diogo
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PintandoRostos extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        //desenha o rosto
        g.setColor(Color.YELLOW);
        g.fillOval(10, 10, 200, 200);
        
        //desenha os olhos
        g.setColor(Color.BLACK);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);
        
        //desenha a boca
        g.fillOval(50, 110, 120, 60);
        
        //retoca a boca e cria o sorriso
        g.setColor(Color.YELLOW);
        g.fillRect(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);
        
        
    }
}
