/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap1;

import javax.swing.JFrame;

/**
 *
 * @author Diogo
 */
public class TestePainelDesenho {

    public static void main(String[] args) {

        //cria painel com o desenho que fizemos
        PainelDesenho desenho = new PainelDesenho();
        
        //cria quadro para armazenar o desenho
        JFrame app = new JFrame();
        
        //configura o frame para fechar quando o x e clicado
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        app.add(desenho); // adiciona o desenho ao painel
        app.setSize(250, 250); //configura o tamanho inicial
        app.setVisible(true);
        
    }

}
