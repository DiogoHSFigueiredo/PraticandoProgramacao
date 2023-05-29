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
public class DrawPolygons {

    public static void main(String[] args) {
       
        //cria frame PolygonsJPanel
        JFrame frame = new JFrame("Drawing Polygons");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        PolygonsJPanel polygonsJPanel = new PolygonsJPanel();
        frame.add(polygonsJPanel);
        frame.setSize(280,270);
        frame.setVisible(true);
        
    }
    
}
