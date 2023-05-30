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
public class Appexe138 {

    public static void main(String[] args) {
        JFrame app = new JFrame("Tela App");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Exe138 telaDesenho = new Exe138();
        app.setSize(800, 800);
        app.add(telaDesenho);
        app.setVisible(true);

    }
}
