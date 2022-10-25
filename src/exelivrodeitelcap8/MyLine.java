/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap8;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Diogo
 */
public class MyLine {

    private int x1; //Coordenaa x da primeira extremidade final
    private int y1; //Coordenada y da primeira extremidade final
    private int x2; //Coordenada x da segunda extremidade final
    private int y2; //Coordenada y da segunda extremidade final
    private Color color; // atribui uma cor a essa linha

    //construtor com valores de entrada
    public MyLine(int x1, int y1, int x2, int y2, Color color) {

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
    }

    //Desenha a linha na cor especificada
    public void draw(Graphics g) {
        g.setColor(color);
        g.drawLine(x1, y1, x2, y2);
    }

} // fim da classe
