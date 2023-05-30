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
public class AppExe136 {

    public static void main(String[] args) {

        JFrame app = new JFrame("Tela APP");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Exe136 telaDesenho = new Exe136();
        app.add(telaDesenho);
        app.setSize(450, 450);
        app.setVisible(true);
    }
}
