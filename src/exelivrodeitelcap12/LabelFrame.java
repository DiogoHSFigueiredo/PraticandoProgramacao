/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap12;

/**
 *
 * @author Diogo
 */
import java.awt.FlowLayout; //especifica como os componentes são organizados
import javax.swing.JFrame; //fornece recursos basicos de janela
import javax.swing.JLabel; //exibe texto e imagens
import javax.swing.SwingConstants; //constantes comuns utilizadas com swing
import javax.swing.Icon; //interface utilizada para manipular imagens
import javax.swing.ImageIcon; //carrega imagens

public class LabelFrame extends JFrame {

    private final JLabel label1; //Jlabel com texto    
    private final JLabel label2; //label construido com texto e icone
    private final JLabel label3; //label com texto e icone adicionados

    //construtor labelFrame adiciona jlabels a JFrame
    public LabelFrame() {
        super("Testing JLabel");
        setLayout(new FlowLayout()); //configura o layout de frame

        //construtor jlabel com um argumento de string
        label1 = new JLabel("Label with text");
        label1.setToolTipText("This is label1");
        add(label1); //adiciona o lalbel1 ao JFrame

        //construtor JLabel com String, icon e argumentos de alinhamento
        Icon bug = new ImageIcon(getClass().getResource("bug.jpeg"));
        label2 = new JLabel("Label with text and icon", bug, SwingConstants.LEFT);
        label2.setToolTipText("This is label2");
        add(label2); // adiciona label2 ao JFrame

        label3 = new JLabel(); //construtor jlabel sem argumento
        label3.setText("Label with icon and text at bottom");
        label3.setIcon(bug); // adiciona o icone ao Jlabel
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label3");
        add(label3);
    }
}
