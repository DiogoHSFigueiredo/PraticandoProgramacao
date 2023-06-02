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
public class AppExe1311 {

    public static void main(String[] args) {

        JFrame app = new JFrame("Tela App");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Exe1311 tela = new Exe1311();
        app.add(tela);
        app.setSize(600, 600);
        app.setVisible(true);

    }
}
