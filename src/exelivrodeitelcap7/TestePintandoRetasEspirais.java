/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap7;

import javax.swing.JFrame;

/**
 *
 * @author Diogo
 */
public class TestePintandoRetasEspirais {

    public static void main(String[] args) {

        PintandoRetasEspirais tela = new PintandoRetasEspirais();
        JFrame janela = new JFrame();

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.add(tela);
        janela.setSize(1000,1000);
        janela.setVisible(true);
    }
}
