package exelivrodeitelcap12;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Diogo
 */
public class RadioButtonFrame extends JFrame {

    private final JTextField textField; //utilizado para exibir alteracoes de fonte
    private final Font plainFont; //fonte para texto simples
    private final Font boldFont; //font para texto em negrito
    private final Font italicFont; // fonte para texto em italico
    private final Font boldItalicFont; //fonte para negrito e italico
    private final JRadioButton plainJRadioButton; //seleciona texto simples
    private final JRadioButton boldJRadioButton; //seleciona texto em negrito
    private final JRadioButton italicJRadioButton; //seleciona texto em italico
    private final JRadioButton boldItalicJRadioButton; //negrito e italico
    private final ButtonGroup radioGroup; //contem botoes de opcao

    //construtor RadioButonFrame adiciona JRadioButtons ao JFrame
    public RadioButtonFrame() {
        super("RadioButon Test");
        setLayout(new FlowLayout());

        textField = new JTextField("Watch the font style change", 25);
        add(textField); //adiciona textField ao JFrame

        //cria botoes de opcao
        plainJRadioButton = new JRadioButton("Plain", true);
        boldJRadioButton = new JRadioButton("Bold", false);
        italicJRadioButton = new JRadioButton("Italic", false);
        boldItalicJRadioButton = new JRadioButton("Bold/Italic", false);
        //adiciona botoes de opcao ao Frame
        add(plainJRadioButton);
        add(boldJRadioButton);
        add(italicJRadioButton);
        add(boldItalicJRadioButton);

        //cria relaciomaneto logico entre JRadioButtons
        radioGroup = new ButtonGroup(); // cria ButtonGroup
        radioGroup.add(plainJRadioButton);//adiciona texto simples ao grupo
        radioGroup.add(boldJRadioButton); //adiciona negrito ao grrupo
        radioGroup.add(italicJRadioButton); //adiciona italico ao grupo
        radioGroup.add(boldItalicJRadioButton);//adiciona negrito e italico

        //cria fonte objetos
        plainFont = new Font("Serif", Font.PLAIN, 14);
        boldFont = new Font("Serif", Font.BOLD, 14);
        italicFont = new Font("Serif", Font.ITALIC, 14);
        boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
        textField.setFont(plainFont);

        //registra eventos para JRadioButtons
        plainJRadioButton.addItemListener(new RadioButtonHandler(plainFont));
        boldJRadioButton.addItemListener(new RadioButtonHandler(boldFont));
        italicJRadioButton.addItemListener(new RadioButtonHandler(italicFont));
        boldItalicJRadioButton.addItemListener(new RadioButtonHandler(boldItalicFont));
    }

//clase interna private para tratar eventos de botao de opcao
    private class RadioButtonHandler implements ItemListener {

        private Font font; //fonte associada com esse listener

        //construtor da classe interna
        public RadioButtonHandler(Font f) {
            font = f;
        }

        //trata eventos de botao de opcao
        @Override
        public void itemStateChanged(ItemEvent event) {
            textField.setFont(font);
        }

    }

}
