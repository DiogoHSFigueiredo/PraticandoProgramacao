package exelivrodeitelcap12;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Diogo
 */
public class ListFrame extends JFrame {

    private final JList<String> colorJList; //lista para exibir cores
    //vetor com nomes de cores
    private static final String[] colorNames = {"Black", "Blue", "Cyan", "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange", "Pink", "Red", "White", "Yellow"};
    //vetor com objetos cores
    private static final Color[] colors = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW};

    //construtor ListFrame adiciona JScrollPane que contem JList ao JFrame
    public ListFrame() {
        super("List Test");
        setLayout(new FlowLayout());

        colorJList = new JList<String>(colorNames); //lista de colorNames
        colorJList.setVisibleRowCount(6); //exibe cinco linhas de uma vez

        //nao permite multiplas selecoes
        colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        //adiciona um JScroolPane que contme Jlist ao frame
        add(new JScrollPane(colorJList));

        colorJList.addListSelectionListener(new ListSelectionListener() //classe interna anonima
        {
            //trata eventos de selecao de lista
            @Override
            public void valueChanged(ListSelectionEvent event) {
                getContentPane().setBackground(colors[colorJList.getSelectedIndex()]);
            }
        }
        ); //fim da classe anonima
    }
} //fim da classe ListFrame
