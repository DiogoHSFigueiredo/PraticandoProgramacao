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
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Diogo
 */
public class GridBagFrame extends JFrame {

    private final GridBagLayout layout; //layout desse frame
    private final GridBagConstraints constraints; //restricoes de layout

    //Construtor, configura a GUI
    public GridBagFrame() {

        super("GridBagLayout");
        layout = new GridBagLayout();
        setLayout(layout); //configura o layout de frame
        constraints = new GridBagConstraints(); //instancia restricoes

        //cria componentes GUI
        JTextArea textArea1 = new JTextArea("TextArea1", 5, 10);
        JTextArea textArea2 = new JTextArea("TextArea2", 2, 2);

        String[] names = {"Iron", "Steel", "Brass"};
        JComboBox<String> comboBox = new JComboBox<String>(names);

        JTextField textField = new JTextField("TextField");
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        //weightx e weightt para textArea 1 sao 0: o padrao
        //anchor para todos os componentes CENTER: o padrao
        constraints.fill = GridBagConstraints.BOTH;
        addComponent(textArea1, 0, 0, 1, 3);

        //weightx e weightt para button1 sao 0: o padrao
        constraints.fill = GridBagConstraints.HORIZONTAL;
        addComponent(button1, 0, 1, 2, 1);

        //weightx e wighty para comboBox sao 0: o padrao
        //fill e HORIZONTAL
        addComponent(comboBox, 2, 1, 2, 1);

        //button2
        constraints.weightx = 1000; //pode crescer na largura
        constraints.weighty = 1; //pode crescer na altura
        constraints.fill = GridBagConstraints.BOTH;
        addComponent(button2, 1, 1, 1, 1);

        //preenchmento e BOTH para button3
        constraints.weightx = 0;
        constraints.weighty = 0;
        addComponent(button3, 1, 2, 1, 1);

        //weightx e weighty para textField sao 0, prencimento e BOTH
        addComponent(textField, 3, 0, 2, 1);

        //weightx e weighty para textArea2 sao 0, prencimento e BOTH
        addComponent(textArea2, 3, 2, 1, 1);

    }//fim do construtor

    //metodo para configurar restricoes em
    private void addComponent(Component component, int row, int column, int width, int height) {
        constraints.gridx = column;
        constraints.gridy = row;
        constraints.gridwidth = width;
        constraints.gridheight = height;
        layout.setConstraints(component, constraints); //configura constraints
        add(component);
    }
} // fim da classe GridBagFrane
