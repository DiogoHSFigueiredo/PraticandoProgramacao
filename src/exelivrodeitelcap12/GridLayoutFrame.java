/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap12;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Diogo
 */
public class GridLayoutFrame extends JFrame implements ActionListener {

    private final JButton[] buttons; //array de botoes
    private static final String[] names = {"one", "two", "three", "four", "five", "six"};
    private boolean toggle = true; //alterna entre dois layouts
    private final Container container; //container do frame
    private final GridLayout gridLayout1; //primeio layout
    private final GridLayout gridLayout2; //segundo layout

    //construtor sem argumento
    public GridLayoutFrame() {
        super("GridLayout Demo");
        gridLayout1 = new GridLayout(2, 3, 5, 5); //2 por 3; lacunas de 5
        gridLayout2 = new GridLayout(3, 2); //3 por 2; nenhuma lacuna
        container = getContentPane();
        setLayout(gridLayout1);
        buttons = new JButton[names.length];

        for (int count = 0; count < names.length; count++) {
            buttons[count] = new JButton(names[count]);
            buttons[count].addActionListener(this); //ouvinte registrado
            add(buttons[count]); //adiciona o botao ao JFrame
        }
    }

    //trata eventos de botao alternado entre layouts
    @Override
    public void actionPerformed(ActionEvent event) {
        if (toggle) { //define layout com base nos botoes de alternacao
            container.setLayout(gridLayout2);
        } else {
            container.setLayout(gridLayout1);
        }
        toggle = !toggle;
        container.validate(); //refaz o layout do container
    }
} //fim da classe GridLayoutFrame
