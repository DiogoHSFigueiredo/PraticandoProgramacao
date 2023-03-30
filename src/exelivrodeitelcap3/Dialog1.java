/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap3;

import javax.swing.JOptionPane;
/**
 *
 * @author Diogo
 */
public class Dialog1 {
    
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Vamos aprender seu nome", "Seja bem Vindo", 2);
        String name = JOptionPane.showInputDialog("Digite seu nome");
        JOptionPane.showMessageDialog(null, name, "Seu nome é: ", 1);

    }
    
}
