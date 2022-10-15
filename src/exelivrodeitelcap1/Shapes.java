/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap1;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Diogo
 */
public class Shapes extends JPanel {

    private int choice; //Escolha do usuario sober qual forma desenhar.

    //Construtor configura a escolha do usuario
    public Shapes(int userChoise) {
        choice = userChoise;
    }
//Desenha uma cascata de formas que iniciam no canto superior esquerdo

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < 10; i++) {
            //seleciona a forma conforme a escolha do usuario
            switch (choice) {
                case 1: //desenha retangulos
                    g.drawRect(10 + i * 10, 10 + i * 10,
                            50 + i * 10, 50 + i * 10);
                    break;
                case 2: // desenha ovais
                    g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    break;

                case 3: // desenha arcos
                    // 1 e 2 posicao inicial, 3 tamanho inicial do circulo, 4 deslocamento, 5 sentido do giro, 6 grau da circunferencia
                    g.drawArc(120, 120+(i*10), 10+(10*i), 10+(10*i), 3, 360);
                    break;

            }
        }
    }
}
