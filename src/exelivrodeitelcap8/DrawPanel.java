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
    private MyRectangle[] retangulo; //array de retangulos
    private MyOval[] elipse; //array de elipses

    //Construtor cria um painel com formas aleatorias
    public DrawPanel() {

        setBackground(Color.WHITE);

        lines = new MyLine[5 + randomNumbers.nextInt(5)];
        retangulo = new MyRectangle[5 + randomNumbers.nextInt(5)];
        elipse = new MyOval[5 + randomNumbers.nextInt(5)];

        //cria elipses
        for (int count = 0; count < elipse.length; count++) {

            //gera coordenadas aleatórias para desenhar a elipse;
            int x1 = randomNumbers.nextInt(300);
            int y1 = randomNumbers.nextInt(300);
            int x2 = randomNumbers.nextInt(300);
            int y2 = randomNumbers.nextInt(300);

            //gera cor aleatória da elipse
            Color color = new Color(randomNumbers.nextInt(256), randomNumbers.nextInt(256), randomNumbers.nextInt(256));

            //adiciona uma elipse a lista de elipses a ser exibida
            elipse[count] = new MyOval(x1, y1, x2, y2, color, true);

        }

        //cria retangulos
        for (int count = 0; count < retangulo.length; count++) {

            //gera coordenadas aleatórias;
            int x1 = randomNumbers.nextInt(300);
            int y1 = randomNumbers.nextInt(300);
            int x2 = randomNumbers.nextInt(300);
            int y2 = randomNumbers.nextInt(300);

            //gera uma cor aleatória
            Color color = new Color(randomNumbers.nextInt(256), randomNumbers.nextInt(256), randomNumbers.nextInt(256));

            //adiciona um retângulo a lista de retângulos a ser exibido
            retangulo[count] = new MyRectangle(x1, y1, x2, y2, color, true);

        }

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
    } // fim do construtor

    //Para cada array de forma, desenha as formas individuais automaticamente porque e uma caracteristica do JPANEL executar este metodo
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //desenha as linhas a partir dos arrays
        for (MyLine line : lines) {
            line.draw(g);
        }
        //desenha os retangulos a partir dos arrays
        for (MyRectangle retangulos : retangulo) {
            retangulos.draw(g);
        }
        //desenha as elipses a partir dos arrays
        for (MyOval elipses : elipse) {
            elipses.draw(g);
        }

    }

    public String Status() {
        return String.format("Linhas %d Ovais %d Rectangles %d", lines.length, elipse.length, retangulo.length);
    }

} //fim da classe
