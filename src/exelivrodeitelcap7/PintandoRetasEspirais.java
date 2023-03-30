/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap7;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Diogo
 */
public class PintandoRetasEspirais extends JPanel {

    //construtor da classe
    public PintandoRetasEspirais() {

        setBackground(Color.WHITE);

    }

    //desenha retas em posicao espiral
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        int reta = 5;

        //variaveis para desenho
        int cent = 25;
        int x1 = getWidth() / 2 + cent;
        int y1 = getHeight() / 2 + cent;
        int x2 = x1;
        int y2 = y1;
        int beta = 1;

        //desenha retas em sentido espiral
        for (int i = 1; i < getWidth(); i++) {

            g.setColor(Color.RED);

            //Desenha do centro pra baixo
            y2 += cent;
            g.drawLine(x1, y1, x2, y2);

            //Desenha para esquerda
            x1 = x2;
            y1 = y2;
            x2 -= cent;
            g.drawLine(x1, y1, x2, y2);

            cent += 50;

            //desenhar pra cima
            x1 = x2;
            y1 = y2;
            y2 -= cent;
            g.drawLine(x1, y1, x2, y2);

            //desenha para direita
            x1 = x2;
            y1 = y2;
            x2 += cent;
            g.drawLine(x1, y1, x2, y2);

            x1 = x2;
            y1 = y2;
            cent += 50;

        }
    }
}
