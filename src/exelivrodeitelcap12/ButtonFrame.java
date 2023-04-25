/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap12;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Diogo
 */
public class ButtonFrame extends JFrame {

    private final JButton plainJButton; //botao apenas com texto
    private final JButton fancyJButton; //botao com icones

    //ButtonFrame adiciona JButtons ao JFrame
    //construtor
    public ButtonFrame() {
        super("Testing Buttons");
        setLayout(new FlowLayout());

        plainJButton = new JButton("Plain Button"); //botão com texto
        add(plainJButton); //adiciona plainJbutton ao JFrame

        Icon bug1 = new ImageIcon(getClass().getResource("bug.jpeg"));
        Icon bug2 = new ImageIcon(getClass().getResource("bug1.jpeg"));
        fancyJButton = new JButton("Fancy Button", bug1); //configura imagem
        fancyJButton.setRolloverIcon(bug2); //configura imagem de rollover
        add(fancyJButton); //adiciona fancyJButton ao JFrame

        //cria novo ButtonHandler de tratamento para tratamento de evento de botao
        ButtonHandler handler = new ButtonHandler();
        fancyJButton.addActionListener(handler);
        plainJButton.addActionListener(handler);

    }

    //classe interna para tratamento de evento de botao
    private class ButtonHandler implements ActionListener {

        //trata evento de botao
        @Override
        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format("You pressed: %s", event.getActionCommand()));
        }

    }

} //fim da classe
