/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap13;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Diogo
 */
public class LinesRectsOvals {

    public static void main(String[] args) {
        //cria frame para LinesRectsOvals
        JFrame frame = new JFrame("Drawing Lines, rectangles and ovals");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LinesRectsOvalsJPanel linesRectsOvalsJPanel = new LinesRectsOvalsJPanel();
        linesRectsOvalsJPanel.setBackground(Color.WHITE);
        frame.add(linesRectsOvalsJPanel);
        frame.setSize(400,210);
        frame.setVisible(true);
    }
}
