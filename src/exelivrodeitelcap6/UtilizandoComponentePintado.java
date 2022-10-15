/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap6;

/**
 *
 * @author Diogo
 */
import javax.swing.JFrame;

public class UtilizandoComponentePintado {
    
    public static void main(String[] args){
        
        PintandoRostos painel = new PintandoRostos();
        JFrame app = new JFrame();
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(painel);
        app.setSize(230, 250);
        app.setVisible(true);
        
        
        
    }
    
    
}
