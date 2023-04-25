/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap12;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import static javax.swing.SwingConstants.CENTER;

/**
 *
 * @author Diogo
 */
public class CheckBoxFrame extends JFrame {

    private final JTextField textField; //exibe o texto na alteracao de fontes
    private final JCheckBox boldJCheckBox; //para marcar/desmarcar estilo negrito
    private final JCheckBox italicJCheckBox; //para marcar/desmarcar estilo itálico
    private final JCheckBox colorCheckBox; //configura a cor do texto
    //construtor CheckBoxFrame adiciona JCheckboxes ao JFrame

    public CheckBoxFrame() {
        super("JCheckBox Test");
        setLayout(new FlowLayout());

        //Abre a janela no centro da tela
        this.setLocationRelativeTo(null);

        //configura JTextField e sua fonte
        textField = new JTextField("Watch the font style change", 20);
        textField.setFont(new Font("Serif", Font.PLAIN, 14));
        add(textField); //adiciona textField ao JFrame

        boldJCheckBox = new JCheckBox("Bold");
        italicJCheckBox = new JCheckBox("Italic");
        colorCheckBox = new JCheckBox("Color RED");
        add(boldJCheckBox); //adiciona caixa de selecao de estilo negrito ao JFrame
        add(italicJCheckBox); //adiciona caixa de selecao de itálico ao JFrame
        add(colorCheckBox); //adiciona a caixa de selecao de cor vermelha

        //listeners registradores para JCheckBoxes
        CheckBoxHandler handler = new CheckBoxHandler();
        boldJCheckBox.addItemListener(handler);
        italicJCheckBox.addItemListener(handler);
        colorCheckBox.addItemListener(handler);

    }

    //classe interna private para tratamento de evento ItemListener
    private class CheckBoxHandler implements ItemListener {

        //responde aos eventos de caixa de selecao
        @Override
        public void itemStateChanged(ItemEvent event) {
            Font font = null; //armazena a nova Font

            //determina quais CheckBoxes estao marcadas e cria Font
            if (boldJCheckBox.isSelected() && italicJCheckBox.isSelected()) {
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            } else if (boldJCheckBox.isSelected()) {
                font = new Font("Serif", Font.BOLD, 14);
            } else if (italicJCheckBox.isSelected()) {
                font = new Font("Serif", Font.ITALIC, 14);
            } else {
                font = new Font("Serif", Font.PLAIN, 14);
            }
            textField.setFont(font);
            if (colorCheckBox.isSelected()) {
                textField.setForeground(Color.red);
            } else {
                textField.setForeground(Color.black);
            }

        }

    }

}
