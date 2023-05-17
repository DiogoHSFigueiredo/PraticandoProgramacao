/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Diogo
 */
public class TextAreaFrame extends JFrame {

    private final JTextArea textArea1; //exibe string demo
    private final JTextArea textArea2; //texto destacado é copiado aqui
    private final JButton copyJButton; //comeca a copiar o texto

    //construtor sem argumento
    public TextAreaFrame() {
        super("TextArea Demo");
        Box box = Box.createHorizontalBox(); //cria box
        String demo = "This is a demo String to\n" + "illustrate copying text\nfrom one textarea to\n" + "another textarea using an\nexternal event\n";

        textArea1 = new JTextArea(demo, 10, 15);
        box.add(new JScrollPane(textArea1)); //adiciona scrollpane

        copyJButton = new JButton("Copy >>>"); //cria botao de copia
        box.add(copyJButton); //adiciona o botao de copia a box
        copyJButton.addActionListener(
                new ActionListener() //classe interna anonima
        {
            //configura texto em textArea2 como texto selecionado de textArea1
            @Override
            public void actionPerformed(ActionEvent event) {
                textArea2.setText(textArea1.getSelectedText());
            }
        }
        );
        textArea2 = new JTextArea(10, 15);
        textArea2.setEditable(false);
        box.add(new JScrollPane(textArea2)); //adiciona scrollpane

        add(box); //adiciona box ao frame
    }
}
