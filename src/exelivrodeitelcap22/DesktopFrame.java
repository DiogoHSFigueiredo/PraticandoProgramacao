/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap22;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.SecureRandom;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author Diogo
 */
public class DesktopFrame extends JFrame {

    private final JDesktopPane theDesktop;

    //configura a GUI - Construtor da GUI
    public DesktopFrame() {
        super("Using a JDesktopPane");

        JMenuBar bar = new JMenuBar();
        JMenu addMenu = new JMenu("Add");
        JMenuItem newFrame = new JMenuItem("Internal Frame");

        addMenu.add(newFrame); //adiciona um novo item de quadro ao menu Add
        bar.add(addMenu);; //adiciona o menu Add a barra de menus
        setJMenuBar(bar); //configura a barra de menus para esse aplicativo

        theDesktop = new JDesktopPane();
        add(theDesktop); //adiciona painel de área de trabalho ao quadro

        //configura o ouvinte para o item de menu newFrame
        newFrame.addActionListener(
                new ActionListener() //classe interna anonima
        {
            //exibe a nova janela interna
            @Override
            public void actionPerformed(ActionEvent event) {
                //cria o quadro interno
                JInternalFrame frame = new JInternalFrame("Internal Frame", true, true, true, true);

                MyJPanel panel = new MyJPanel();
                frame.add(panel, BorderLayout.CENTER);
                frame.pack(); //configura o quadro interno de acordo com o tamanho do conteudo

                theDesktop.add(frame); //anexa o quadro interno
                frame.setVisible(true); //mostra o quadro interno
            }
        }
        );
    }//fim do construtor DesktopFrame
}//fim da classe DesktopFrame

//classe para exibir um ImageIcon em um painel
class MyJPanel extends JPanel {

    private static final SecureRandom generator = new SecureRandom();
    private final ImageIcon picture; //imagem a ser exibida
    private final static String[] images = {"carro1.png", "carro2.png", "carro3.png", "carro4.png", "carro5.png"};

    //carrega a imagem
    public MyJPanel() {
        int randomNumber = generator.nextInt(images.length);
        picture = new ImageIcon(images[randomNumber]); //configura o icone

    }

    //exibe imageIcon no painel
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        picture.paintIcon(this, g, 0, 0); //exibe o icone
    }

//retorna as dimensoes da imagem
    public Dimension getPreferredSize() {
        return new Dimension(picture.getIconWidth(), picture.getIconHeight());
    }
} //fim da classe MyJPanel
