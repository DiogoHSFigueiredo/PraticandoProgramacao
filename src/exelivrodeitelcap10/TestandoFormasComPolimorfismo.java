/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap10;

import javax.swing.JFrame;

/**
 *
 * @author Diogo
 */
public class TestandoFormasComPolimorfismo {

    public static void main(String[] args) {

        CriandoFormas panel = new CriandoFormas();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(450, 450);
        app.setVisible(true); 

    }
}
