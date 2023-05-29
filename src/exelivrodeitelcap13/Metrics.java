/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap13;

import javax.swing.JFrame;

/**
 *
 * @author Diogo
 */
public class Metrics {
    
    public static void main(String[] args) {
        //cria frame para MetricsJPanel
        JFrame frame = new JFrame("Demonstrating FontMetrics");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MetricsJPanel metricsJPanel = new MetricsJPanel();
        frame.add(metricsJPanel);
        frame.setSize(510, 240);
        frame.setVisible(true);
    }
}
