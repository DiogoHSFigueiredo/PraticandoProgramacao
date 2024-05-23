/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap22;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;

/**
 *
 * @author Diogo
 */
public class PopupFrame extends JFrame {

    private final JRadioButtonMenuItem[] items; //contem itens para cores
    private final Color[] colorValues = {Color.BLUE, Color.YELLOW, Color.RED}; //cores a serem utilizadas
    private final JPopupMenu popupMenu; //permite que o usuario selecione a cor

    //construtor sem argumento configure a GUI
    public PopupFrame() {

        super("Using JPopupMenus");

        ItemHandler handler = new ItemHandler(); //rotina de tratamento para itens de menu
        String[] colors = {"Blue", "Yellow", "Red"};

        ButtonGroup colorGroup = new ButtonGroup(); //gerencia itens de cor
        popupMenu = new JPopupMenu(); //cria menu pop-up
        items = new JRadioButtonMenuItem[colors.length];

        //cria item de menu, adiciona-o ao menu pop-up, permite tratamento de eventos
        for (int count = 0; count < items.length; count++) {
            items[count] = new JRadioButtonMenuItem(colors[count]);
            popupMenu.add(items[count]); //adiciona o item ao menu pop-up
            colorGroup.add(items[count]); //adiciona o item ao grupo de botoes
            items[count].addActionListener(handler); //adiciona handler
        }

        setBackground(Color.WHITE);

        //declara um MouseListener para a janela a fim de exibir o menu pop-up
        addMouseListener(
                new MouseAdapter() //classe interna anonima
        {
            //trata eventos de pressionamento de mouse
            @Override
            public void mousePressed(MouseEvent event) {
                checkForTriggerEvent(event);
            }

            //trata eventos de liberacao de botao do mouse
            @Override
            public void mouseReleased(MouseEvent event) {
                checkForTriggerEvent(event);
            }

            //determina se o evento deve acionar o menu pop-up
            private void checkForTriggerEvent(MouseEvent event) {
                if (event.isPopupTrigger()) {
                    popupMenu.show(event.getComponent(), event.getX(), event.getY());
                }

            }

        });
    } // fim do construtor PopupFrame

    //classe interna privada para tratar eventos de item de menu
    private class ItemHandler implements ActionListener {

        //processa selecoes de items de menu
        @Override
        public void actionPerformed(ActionEvent event) {

            //determina qual item de menu foi selecionado
            for (int i = 0; i < items.length; i++) {
                if (event.getSource() == items[i]) {
                    getContentPane().setBackground(colorValues[i]);
                    return;
                }
            }
        }
    } //fim da classe interna privada ItemHandler
} //fim da classe PopupFrame
