/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap10;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Diogo
 */
//superclasse de desenho
public abstract class MyShape extends JPanel {

    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private Color color;

//construtor sem argumentos
    public MyShape() {

        this.x1 = 0;
        this.y1 = 0;
        this.x2 = 0;
        this.y2 = 0;
        this.color = Color.black;
    }

    //construtor com argumentos
    public MyShape(int x1, int y1, int x2, int y2, Color color) {

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
    }

//metodos de retorno
    public int getX1() {
        return this.x1;
    }

    public int getY1() {
        return this.y1;
    }

    public int getX2() {
        return this.x2;
    }

    public int getY2() {
        return this.y2;
    }

    public Color getColor() {
        return this.color;
    }

    //metodo de desenho
    public abstract void desenhar(Graphics g);

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
