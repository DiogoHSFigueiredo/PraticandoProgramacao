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
public class MyOval {

    private int x1; //Coordenaa x da primeira extremidade final
    private int y1; //Coordenada y da primeira extremidade final
    private int x2; //Coordenada x da segunda extremidade final
    private int y2; //Coordenada y da segunda extremidade final
    private boolean use; //flag para marcar utilização
    private Color color; // atribui uma cor a essa linha

    //construtor com valores de entrada
    public MyOval(int x1, int y1, int x2, int y2, Color color, boolean use) {

        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
        this.color = color;
        this.use = use;
    }

    //construtor 2, valores 0 e fundo preto
    public MyOval() {

        this.x1 = 0;
        this.y1 = 0;
        this.x2 = 0;
        this.y2 = 0;
        this.color = Color.BLACK;
        this.use = false;
    }

    //Desenha o circulo oval na cor especificada
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.drawOval(getX1(), getY1(), getX2(), getY2());
    }

    public void setX1(int x1) {
        if (x1 < 0) {
            x1 = 0;
        }

        this.x1 = x1;
    }

    public void setY1(int y1) {
        if (y1 < 0) {
            y1 = 0;
        }
        this.y1 = y1;
    }

    public void setX2(int x2) {
        if (x2 < 0) {
            x2 = 0;
        }
        this.x2 = x2;
    }

    public void setY2(int y2) {
        if (y2 < 0) {
            y2 = 0;
        }
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public boolean isUse() {
        return use;
    }

    public Color getColor() {
        return color;
    }

} // fim da classe
