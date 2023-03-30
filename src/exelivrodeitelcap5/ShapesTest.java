/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap5;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Diogo
 */
public class ShapesTest {

    public static void main(String[] args) {

        String tec = JOptionPane.showInputDialog("Enter 1 to draw rectangles\n" + "Enter 2 to draw Ovals");

        int choice = Integer.parseInt(tec);

        Shapes painel = new Shapes(choice);

        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(painel);
        app.setSize(700, 700);
        app.setVisible(true);
    }

}
