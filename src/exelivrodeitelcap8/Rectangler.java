/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap8;

import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;

/**
 *
 * @author Diogo
 */
public class Rectangler {

    private float length;
    private float width;
    private Color color;
    SecureRandom randomNumbers = new SecureRandom();

    //construtor
 

    public Rectangler(float length, float width, Color color) {

        setLength(length);
        setWidth(width);
        this.color = color;

    }

    //metodo para calcular area
    public float calcArea() {
        float area = (getLength() * getWidth());

        return area;
    }

    //metodo para calcular o perimetro
    public float calcPerimetro() {
        float perimetro = 2 * (getLength() + getWidth());

        return perimetro;
    }

    public void setLength(float length) {

        if (length < 0.0 || length > 200.0) {
            length = 1;
        }

        this.length = length;
    }

    public void setWidth(float width) {

        if (width < 0.0 || width > 200.0) {
            width = 1;
        }

        this.width = width;
    }

    public float getLength() {
        return this.length;
    }

    public float getWidth() {
        return this.width;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void draw(Graphics g) {
        g.setColor(getColor());
        g.drawRect((int) getLength(), (int) getWidth(), (int) getLength(), (int) getWidth());
    }

} // fim da classe 
