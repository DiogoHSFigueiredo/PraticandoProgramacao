/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap10;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Diogo
 */
public class MyRectangle extends MyBoundedShape {

    //construtor sem argumentos
    public MyRectangle() {
        super();

    }

    //construtor c/ argumentos
    public MyRectangle(int x1, int y1, int x2, int y2, Color color) {

        super(x1, y2, x2, y2, color);

    }

    //parámetro para teste da menor variável x e desenho da coordenada x superior esquerda
    public int getUpperLeftX() {
        int x = super.getX1();
        if (super.getX1() > super.getX2()) {
            x = super.getX2();
        }
        return x;
    }

    //parámetro para teste da menor variável y desenho da coordenada y superior esquerda
    public int getUpperLefty() {
        int y = super.getY1();
        if (super.getY1() > super.getY2()) {
            y = super.getY2();
        }
        return y;
    }

    //parámetro que define a larguta do desenho
    public int getWidht() {
        int largura;
        largura = Math.abs(super.getX1() - super.getX2());
        return largura;
    }

    //parámetro que define a altura do desenho
    public int getHeight() {
        int altura;
        altura = Math.abs(super.getY1() - super.getY2());
        return altura;
    }

    //desenha o retângulo nas coordenadas e cor especificada
    @Override
    public void desenhar(Graphics g) {
        g.setColor(getColor());
        g.drawRect(getX1(), getY1(), getX2(), getY2());
    }

}
