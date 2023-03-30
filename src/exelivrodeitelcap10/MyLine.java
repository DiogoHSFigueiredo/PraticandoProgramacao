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
public class MyLine extends MyShape {

    //construtor sem parametros
    public MyLine() {
        super();

    }

    //construtor c/ parametros
    public MyLine(int x1, int y1, int x2, int y2, Color color) {

        super(x1, y2, x2, y2, color);

    }

    //Desenha a linha na cor especificada
    @Override
    public void desenhar(Graphics g) {
        g.setColor(getColor());
        g.drawLine(getX1(), getY1(), getX2(), getY2());
    }

    @Override
    public int getX1() {
        return super.getX1();
    }

    @Override
    public int getY1() {
        return super.getY1();
    }

    @Override
    public int getX2() {
        return super.getX2();
    }

    @Override
    public int getY2() {
        return super.getY2();
    }

    @Override
    public Color getColor() {
        return super.getColor();
    }
}
