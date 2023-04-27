/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap12;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Diogo
 */
public class PaintPanel extends JPanel {

    //lista das referencias Point
    private final ArrayList<Point> points = new ArrayList<>();

    //configura GUI e registra rotinas de tratamento de evento de mouse
    public PaintPanel() {
        //trata evento de movimento de mouse do frame
        addMouseMotionListener(new MouseMotionAdapter()// classe interna anonima
        {
            //armazena coordenadas da acao de arrastar e repinta
            @Override
            public void mouseDragged(MouseEvent event) {
                points.add(event.getPoint());
                repaint(); //repinta JFrame
            }
        }
        );
    }

    //desenha ovais em um quadro delimitador de 4x4 nas localizacoes especificadas da janela
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // limpa a area de desenho do painel

        //desenha todos os pontos
        for (Point point : points) {
            g.fillOval(point.x, point.y, 4, 4);
        }
    }
} // fim da classe 
