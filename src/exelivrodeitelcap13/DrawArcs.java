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
public class DrawArcs {
    
    public static void main(String[] args) {
       
        //cria frame para ArcsJPanel
        JFrame frame = new JFrame("Drawing Arcs");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ArcsJPanel arcsJPanel = new ArcsJPanel();
        frame.add(arcsJPanel);
        frame.setSize(300,210);
        frame.setVisible(true);
    }
}
