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
public class MyRectangle {

    //variáveis de instância
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private Color color;
    private boolean use;

    //construtor c/ parâmetros
    public MyRectangle(int x1, int y1, int x2, int y2, Color color, boolean use) {
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
        this.color = color;
        this.use = use;
    }

    //construtor c/ argumentos
    public MyRectangle() {
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = 0;
        this.y2 = 0;
        this.color = Color.BLACK;
        this.use = false;
    }

    //parámetro para teste da menor variável x e desenho da coordenada x superior esquerda
    public int getUpperLeftX() {
        int x = this.x1;
        if (this.x1 > this.x2) {
            x = this.x2;
        }
        return x;
    }

    //parámetro para teste da menor variável y desenho da coordenada y superior esquerda
    public int getUpperLefty() {
        int y = this.y1;
        if (this.y1 > this.y2) {
            y = this.y2;
        }
        return y;
    }

    //parámetro que define a larguta do desenho
    public int getWidht() {
        int largura;
        largura = Math.abs(this.x1 - this.x2);
        return largura;
    }

    //parámetro que define a altura do desenho
    public int getHeight() {
        int altura;
        altura = Math.abs(this.y1 - this.y2);
        return altura;
    }

    //desenha o retângulo nas coordenadas e cor especificada
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.drawRect(getX1(), getY1(), getX2(), getY2());
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

    public Color getColor() {
        return color;
    }

    public boolean isUse() {
        return use;
    }

} // fim da classe
