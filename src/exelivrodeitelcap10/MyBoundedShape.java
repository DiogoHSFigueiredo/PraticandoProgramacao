/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap10;

import java.awt.Color;

/**
 *
 * @author Diogo
 */
public abstract class MyBoundedShape extends MyShape {

    //construtor sem argumentos
    public MyBoundedShape() {

    }

    //construtor c/ argumentos
    public MyBoundedShape(int x1, int y1, int x2, int y2, Color color) {

        super(x1, y1, x2, y2, color);
    }
    

}
