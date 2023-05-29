/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap13;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Diogo
 */
public class Shapes2 {
    
    
    public static void main(String[] args) {
       
        //cria frame Shapes2JPanel
        JFrame frame = new JFrame("Drawing 2D Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Shapes2JPanel shapes2JPanel = new Shapes2JPanel();
        frame.add(shapes2JPanel);
        frame.setBackground(Color.WHITE);
        frame.setSize(315,330);
        frame.setVisible(true);
       
    }
}
