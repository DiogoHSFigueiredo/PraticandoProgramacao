/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap8;

import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;

/**
 *
 * @author Diogo
 */
public class DrawPanel extends JPanel {

    private SecureRandom randomNumbers = new SecureRandom();
    private MyLine[] lines; //array de linhas

    //Construtor cria um painel com formas aleatorias
    public DrawPanel() {

        setBackground(Color.WHITE);

        lines = new MyLine[5 + randomNumbers.nextInt(5)];

        //cria linhas
        for (int count = 0; count < lines.length; count++) {

            //gera coordenadas aleatórias
            int x1 = randomNumbers.nextInt(300);
            int y1 = randomNumbers.nextInt(300);
            int x2 = randomNumbers.nextInt(300);
            int y2 = randomNumbers.nextInt(300);

            //gera uma cor aleatória
            Color color = new Color(randomNumbers.nextInt(256), randomNumbers.nextInt(256), randomNumbers.nextInt(256));

            // adiciona uma linha a lista de linhas a ser exibida
            lines[count] = new MyLine(x1, y1, x2, y2, color);

        }
    }

    //Para cada array de forma, desenha as formas individuais
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        //desenha as linhas
        for(MyLine line : lines)
            line.draw(g);

    }

} //fim da classe
