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
public class DrawPanelTest {

    public static void main(String[] args) {

        //cria um painel que contém o desenho
        DrawPanel panel = new DrawPanel();

        //cria um novo quadro que contém o nosso desenho
        JFrame application = new JFrame();

        //configura o frame para ser encerrado quando ele é fechado
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel); //adiciona o painel ao frame
        application.setSize(550, 550); // configura o tamanho do frame
        application.setVisible(true); // torna o frame visível
    }

}
