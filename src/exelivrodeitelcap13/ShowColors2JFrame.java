/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Diogo
 */
public class ShowColors2JFrame extends JFrame {

    private final JButton changeColorJButton;
    private Color color = Color.LIGHT_GRAY;
    private final JPanel colorJPanel;

    //configura a GUI, construtor
    public ShowColors2JFrame() {

        super("Using JColorChooser");

        //cria JPanel para exibir as cores
        colorJPanel = new JPanel();
        colorJPanel.setBackground(color);

        //configura changeColorJButton e registra sua rotina de tratamento de evento
        changeColorJButton = new JButton("Change Color");
        changeColorJButton.addActionListener(new ActionListener() { //classe interna anonima)
            //exibe JColorChooser quando o usuario clica no botao
            @Override
            public void actionPerformed(ActionEvent event) {
                color = JColorChooser.showDialog(ShowColors2JFrame.this, "Choose a color", color);

                //configura a cor padrao, se nenhuma cor for retornada
                if (color == null) {
                    color = Color.LIGHT_GRAY;
                }

                //muda a cor de fundo do painel de conteudo
                colorJPanel.setBackground(color);
            } // fim do metodo actionPerformed
        }//fim da classe interna anonima
        ); // fim da chamada para actionListener

        add(colorJPanel, BorderLayout.CENTER);
        add(changeColorJButton, BorderLayout.SOUTH);

        setSize(400, 130);
        setVisible(true);
    } // fim do construtor ShowColor
}//fim da classe ShowColor
