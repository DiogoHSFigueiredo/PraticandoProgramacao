/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap22;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextField;

/**
 *
 * @author Diogo
 */
public class GridBagFrame2 extends JFrame {

    private final GridBagLayout layout; //layout desse frame
    private final GridBagConstraints constraints; //restricoes de layout

    //Construtor e configura a GUI
    public GridBagFrame2() {

        super("GridBagLayout");
        layout = new GridBagLayout();
        setLayout(layout); //configura o layout do frame
        constraints = new GridBagConstraints(); //instancia restricoes

        //cria componentes GUI
        String[] metals = {"Copper", "Aluminum", "Silver"};
        JComboBox comboBox = new JComboBox(metals);

        JTextField textField = new JTextField("TextField");

        String[] fonts = {"Serif", "Monospaced"};
        JList list = new JList(fonts);

        String[] names = {"zero", "one", "two", "three", "four"};
        JButton[] buttons = new JButton[names.length];

        for (int count = 0; count < buttons.length; count++) {
            buttons[count] = new JButton(names[count]);
        }

        //define restricoes dos componentes GUI para textField
        constraints.weightx = 1;
        constraints.weighty = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        addComponent(textField);

        //buttons[0] -- wightx e weighty sao 1: fill e BOTH
        constraints.gridwidth = 1;
        addComponent(buttons[0]);

        //buttons[1] -- wightx e weighty sao 1: fill e BOTH
        constraints.gridwidth = GridBagConstraints.RELATIVE;
        addComponent(buttons[1]);

        //buttons[2] -- wightx e weighty sao 1: fill e BOTH
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        addComponent(buttons[2]);

        //comboBox -- wightx e 1: fill e BOTH
        constraints.weighty = 0;
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        addComponent(comboBox);

        //buttons[3] -- weightx e 1: fill e BOTH
        constraints.weighty = 1;
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        addComponent(buttons[3]);

        //butons[4] -- weightx e weighty sao 1: fill e BOTH
        constraints.gridwidth = GridBagConstraints.RELATIVE;
        addComponent(buttons[4]);

        //list -- wightx e weighty sao 1: fill e BOTH
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        addComponent(list);

    } //fim do construtor

    //adiciona um componene ao conteiner
    private void addComponent(Component component) {
        layout.setConstraints(component, constraints);
        add(component); //adiciona componente
    }
} //fim da classe GridBagFrame2

