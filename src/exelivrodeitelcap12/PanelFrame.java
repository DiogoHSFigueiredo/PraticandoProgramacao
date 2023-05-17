package exelivrodeitelcap12;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Diogo
 */
public class PanelFrame extends JFrame {

    private final JPanel buttonJPanel; //painel para armazenar botoes
    private final JButton[] buttons;

    //construtor sem argumento
    public PanelFrame() {

        super("Panel Demo");
        buttons = new JButton[5];
        buttonJPanel = new JPanel();
        buttonJPanel.setLayout(new GridLayout(1, buttons.length));

        //cria e adiciona botoes
        for (int count = 0; count < buttons.length; count++) {
            buttons[count] = new JButton("Button" + (count + 1));
            buttonJPanel.add(buttons[count]); //adiciona botao ao painel
        }
        add(buttonJPanel, BorderLayout.SOUTH); //adiciona painel ao JFrame regiao sul
    }
} //fim da classe
