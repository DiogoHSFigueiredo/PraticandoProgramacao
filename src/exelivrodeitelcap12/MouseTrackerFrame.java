/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler;

/**
 *
 * @author Diogo
 */
public class MouseTrackerFrame extends JFrame {

    private final JPanel mousePanel; //painel em que os eventos de mouse ocorrem 
    private final JLabel statusBar; //exibe informacoes do evento

    //construtor MouseTrackerFrame configura GUI e registra rotinas de tratamento de evento de mouse
    public MouseTrackerFrame() {
        super("Demonstrating Mouse Events");
        mousePanel = new JPanel();
        mousePanel.setBackground(Color.WHITE);
        add(mousePanel, BorderLayout.CENTER); //adiciona painel ao JFrame

        statusBar = new JLabel("Mouse outside JPanel");
        add(statusBar, BorderLayout.SOUTH); // adiciona o JLabel ao Frame
        
        //cria e registra listener para mouse e eventos de movimento de mouse
        MouseHandler handler = new MouseHandler();
        mousePanel.addMouseListener(handler);
        mousePanel.addMouseMotionListener(handler);

    }

    private class MouseHandler implements MouseListener, MouseMotionListener {
        //rotinas de tratamento de evento MouseListener

        //Trata evento quando o mouse é liberado imediatamente depois de ter sido pressionado
        @Override
        public void mouseClicked(MouseEvent event) {
            statusBar.setText(String.format("Clicked at [%d, %d]", event.getX(), event.getY()));
        }

        //trata evento quando mouse é pressionado
        @Override
        public void mousePressed(MouseEvent event) {
            statusBar.setText(String.format("Pressed at[%d, %d]", event.getX(), event.getY()));
        }

        //trata evento quando o mouse é liberado
        @Override
        public void mouseReleased(MouseEvent event) {
            statusBar.setText(String.format("Released at [%d, %d]", event.getX(), event.getY()));
        }

        //trata evento quando o mouse entra na area
        @Override
        public void mouseEntered(MouseEvent event) {
            statusBar.setText(String.format("Mouse entered at[%d, %d]", event.getX(), event.getY()));
            mousePanel.setBackground(Color.GREEN);
        }

        //trata evento quando mouse sai da area
        @Override
        public void mouseExited(MouseEvent event) {
            statusBar.setText("Mouse outside JPanel");
            mousePanel.setBackground(Color.WHITE);
        }

        //rotinas de tratamento de evento MouseMotionListener
        //trata o evento quando o usuario arrasta o mouse com o botao pressionado
        @Override
        public void mouseDragged(MouseEvent event) {
            statusBar.setText(String.format("Dragged at [%d, %d]", event.getX(), event.getY()));
        }

        //trata evento quando usuario move o mouse
        @Override
        public void mouseMoved(MouseEvent event) {
            statusBar.setText(String.format("Moved at [%d, %d]", event.getX(), event.getY()));
        }
    }//fim da classe interna MouseHandler
}// fim da classe MouseTrackerFrame
