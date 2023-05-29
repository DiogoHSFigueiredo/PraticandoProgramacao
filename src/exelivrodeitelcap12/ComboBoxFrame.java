package exelivrodeitelcap12;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Diogo
 */
public class ComboBoxFrame extends JFrame {

    private final JComboBox<String> imagesJComboBox; //contem nomes de icones
  
    private final JLabel label; //exibe o icone selecionado

    private static final String[] names = {"pig1.png", "pig2.png", "pig3.png", "pig3.png"};
    private final Icon[] icons = {new ImageIcon(getClass().getResource(names[0])), new ImageIcon(getClass().getResource(names[1])), new ImageIcon(getClass().getResource(names[2])), new ImageIcon(getClass().getResource(names[3]))};

    //construtor JComboBoxFrame
    public ComboBoxFrame() {

        super("Testing JComboBox");
        setLayout(new FlowLayout()); //configura o layout de frame

        imagesJComboBox = new JComboBox<String>(names); //configura JComboBox
        imagesJComboBox.setMaximumRowCount(3); //exibe três linhas

        imagesJComboBox.addItemListener(new ItemListener() // classe interna anonima)
        {
            //trata evento JComboBox
            @Override
            public void itemStateChanged(ItemEvent event) {
                //determina se o item está selecionado
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    label.setIcon(icons[imagesJComboBox.getSelectedIndex()]);
                }
            }
        } // fim da classe interna anonima
        ); // fim da chamada para addItemlistener
        
        add(imagesJComboBox); // adiciona caixa de combinacao ao JFrame
        label = new JLabel(icons[0]); //exibe primeiro icone
        add(label); //adiciona rotulo ao JFrame
    }
}
