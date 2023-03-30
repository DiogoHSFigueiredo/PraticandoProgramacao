/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap4;

import javax.swing.JFrame;

/**
 *
 * @author Diogo
 */
public class DrawPanelE1Test {
    
    public static void main(String[] args) {
       
        DrawPanelE1 painel = new DrawPanelE1();
        
        JFrame janela = new JFrame();
        
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        janela.add(painel);
        janela.setSize(250,250);
        janela.setVisible(true) ;
    }
    
}
