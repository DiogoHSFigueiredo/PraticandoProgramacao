/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap13;

import javax.swing.JFrame;

/**
 *
 * @author Diogo
 */
public class Shapes {

    public static void main(String[] args) {

        //cria frame para ShapesJPanel
        JFrame frame = new JFrame("Drawing 2D Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //cria painel Shapes
        ShapesJPanel shapesJPanel = new ShapesJPanel();

        frame.add(shapesJPanel);
        frame.setSize(425, 200);
        frame.setVisible(true);

    }

}
