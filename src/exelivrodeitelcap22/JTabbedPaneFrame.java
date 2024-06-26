/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap22;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

/**
 *
 * @author Diogo
 */
public class JTabbedPaneFrame extends JFrame {

    //Construtor/configura a GUI
    public JTabbedPaneFrame() {
        super("JTabbedPane Demo");

        JTabbedPane tabbedPane = new JTabbedPane(); //cria o JTabbedPane

        //configura o panel1 e o adiciona ao JTabbedPane
        JLabel label1 = new JLabel("pane one", SwingConstants.CENTER);
        JPanel panel1 = new JPanel();
        panel1.add(label1);
        tabbedPane.addTab("Tab One", null, panel1, "First Panel");

        //configura o panel2 e o adiciona a JTabbedPane
        JLabel label2 = new JLabel("panel two", SwingConstants.CENTER);
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.YELLOW);
        panel2.add(label2);
        tabbedPane.addTab("Tab two", null, panel2, "Second Panel");

        //configura o panel3 e o adiciona a JTabbedPane
        JLabel label3 = new JLabel("panel three");
        JPanel panel3 = new JPanel();
        panel3.setLayout(new BorderLayout());
        panel3.add(new JButton("North"), BorderLayout.NORTH);
        panel3.add(new JButton("West"), BorderLayout.WEST);
        panel3.add(new JButton("East"), BorderLayout.EAST);
        panel3.add(new JButton("South"), BorderLayout.SOUTH);
        panel3.add(label3, BorderLayout.CENTER);
        tabbedPane.addTab("Tab Three", null, panel3, "Third Panel");

        add(tabbedPane);
    }
} //fim da classe JTabbedPaneFrame


