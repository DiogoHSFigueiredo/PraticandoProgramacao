/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap12;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

/**
 *
 * @author Diogo
 */
public class TextFieldFrame extends JFrame {

    private final JTextField textField1; //campo de texto com tamanho configurado
    private final JTextField textField2; //campo de texto com texto
    private final JTextField textField3; //campo de texto com texto e tamanho
    private final JPasswordField passwordField; //campo de senha com texto

    //construtor TextFieldFrame adiciona JTextFields a JFrame
    public TextFieldFrame() {
        super("Testing JTextField and JPasswordField");
        setLayout(new FlowLayout());

        //cria campo de texto com 10 colunas
        textField1 = new JTextField(10);
        add(textField1); //adiciona textField1 ao JFrame

        //cria campo de texto com texto padrao
        textField2 = new JTextField("Enter text here");
        add(textField2); //adiciona textField2 ao JFrame

        //cria campo de texto com texto padrao e 21 colunas
        textField3 = new JTextField("Uneditable text field", 21);
        textField3.setEditable(false); //desativa edicao
        add(textField3); //adiciona textField3 ao JFrame

        //cria campo de senha com texto padrao
        passwordField = new JPasswordField("Hidden text");
        add(passwordField); // adiciona passwordField ao JFrame

        //rotinas de tratamento de evento registradoras
        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }

//classe interna private para tratamento de evento
    private class TextFieldHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            String string = "";

            if (event.getSource() == textField1) {        //usuario pressionou Enter no JTextField textField1
                string = String.format("textField1: %s", event.getActionCommand());
            } else if (event.getSource() == textField2) { //usuario pressionou enter no JTextField textField2
                string = String.format("textField2: %s", event.getActionCommand());
            } else if (event.getSource() == textField3) { //usuario pressionou enter no JTextField textField3
                string = String.format("textField3: %s", event.getActionCommand());
            } else if (event.getSource() == passwordField) { //usuario pressionou enter no JTextField passwordField
                string = String.format("passwordField: %s", event.getActionCommand());
            }
            //exibe o conteudo de JTextField
            JOptionPane.showMessageDialog(null, string);
        }
    }
}
