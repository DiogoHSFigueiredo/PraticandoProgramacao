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
public class DrawRectangle extends JPanel {

    private Rectangle[] retangulos; //array de linhas
    private SecureRandom randomNumbers = new SecureRandom();

    //Construtor cria um painel com formas aleatorias
    public DrawRectangle() {

        setBackground(Color.WHITE);

        retangulos = new Rectangle[5];

        //cria retangulos
        for (int count = 0; count < retangulos.length; count++) {

            //gera coordenadas aleatórias;
            float Length = randomNumbers.nextInt(200);
            float Width = randomNumbers.nextInt(200);

            //gera cor aleatória
            Color color = new Color(randomNumbers.nextInt(256), randomNumbers.nextInt(256), randomNumbers.nextInt(256));

            //adiciona um retangulo ao array
            retangulos[count] = new Rectangle(Length, Width, color);

        }

    }
    //desenha as formas individuais

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //desenha os retangulos
        for (Rectangle retangulo : retangulos) {

            retangulo.draw(g);
        }

    }
} // fim da classe
