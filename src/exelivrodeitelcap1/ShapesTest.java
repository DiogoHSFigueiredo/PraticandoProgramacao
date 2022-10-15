/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Diogo
 */
public class ShapesTest {

    public static void main(String[] args) {
        // obter a escolha do usuario
        String input = JOptionPane.showInputDialog("Digite 1 para Retangulos\n Digite 2 para Ovais");
        
        int choice = Integer.parseInt(input); //converte a String do JOption pane em int
        
        //Cria o painel com a entrada do usuario.
        Shapes panel = new Shapes(choice);
        
        JFrame app = new JFrame(); // Cria o JFrame novo
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(300,300);
        app.setVisible(true);
        
    }
}
