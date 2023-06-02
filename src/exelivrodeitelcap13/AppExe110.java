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
public class AppExe110 {
    
        public static void main(String[] args) {
       
       JFrame app = new JFrame("Tela App");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Exe1310 telaDesenho = new Exe1310();
        app.setSize(500, 500);
        app.add(telaDesenho);
        app.setVisible(true);

        
    }
}
