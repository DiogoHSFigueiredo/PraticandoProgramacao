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
public class MyOval extends MyBoundedShape {
    
    //construtor sem argumentos
    public MyOval(){
    super();
    }

    //construtor com valores de entrada
    public MyOval(int x1, int y1, int x2, int y2, Color color) {

        super(x1, y1, x2, y2, color);
    }

    //Desenha o circulo oval na cor especificada
    @Override
    public void desenhar(Graphics g) {
        g.setColor(getColor());
        g.drawOval(getX1(), getY1(), getX2(), getY2());
    }

  
}
