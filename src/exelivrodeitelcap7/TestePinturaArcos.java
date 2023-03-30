/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap7;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Diogo
 */
public class TestePinturaArcos {

    public static void main(String[] args) {

        PintandoCirculos painel = new PintandoCirculos();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(painel);
        app.setSize(400, 250);
        app.setVisible(true);

        
    }

} // fim da classe
