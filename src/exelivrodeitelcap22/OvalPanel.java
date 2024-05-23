/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap22;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Diogo
 */
public class OvalPanel extends JPanel {

    private int diameter = 10; //diametro padrao

    //desenha uma oval do diamentro especificado
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(10, 10, diameter, diameter);
    }

    //valida e configura o diametro e entao repinta
    public void setDiameter(int newDiameter) {

        //se diametro invalido, assume o padrao de 10
        diameter = (newDiameter >= 0 ? newDiameter : 10);
        repaint(); //repinta o painel
    }

    //utilizado pelo gerenciador de layout para determinar o tamanho preferido
    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }

    //utilizado pelo gerenciador de layout para determinar o tamanho minimo
    public Dimension getMinimumSize() {
        return getPreferredSize();
    }

} // fim da classe OvalPanel
