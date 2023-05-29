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
public class Fonts {
    
    public static void main(String[] args) {
       //cria frame para FontJPanel
       JFrame frame = new JFrame("Using Fonts");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       FontJPanel fontJPanel = new FontJPanel();
       frame.add(fontJPanel);
       frame.setSize(420,150);
       frame.setVisible(true);
    }
}
