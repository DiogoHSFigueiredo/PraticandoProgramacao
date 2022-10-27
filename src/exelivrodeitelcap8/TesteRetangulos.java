/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap8;

import javax.swing.JFrame;

/**
 *
 * @author Diogo
 */
public class TesteRetangulos {

    public static void main(String[] args) {
        DrawRectangle painel = new DrawRectangle();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(painel);
        app.setSize(650, 650);
        app.setVisible(true);

    }
}
