/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap7;

/**
 *
 * @author Diogo
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PintandoCirculos extends JPanel {

//Define cores Indigo e Violeta
    private final static Color VIOLETA = new Color(128, 0, 128);
    private final static Color INDIGO = new Color(75, 0, 130);

//Cores a utilizar no arco-iris, da parte interna para fora
//As entradas em branco resultam em um arco vazio no centro
    private Color[] cores = {Color.WHITE, Color.WHITE, VIOLETA, INDIGO, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};

//Construtor
    public PintandoCirculos() {
        setBackground(Color.WHITE); //Configura a cor do fundo como branco
    }

//Desenha arco iris utilizando arcos concentricos
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int radius = 20; // raio de um arco

        //desenha arco iris perto da parte central inferior
        int centerX = getWidth() / 2;
        int centerY = getHeight() - 10;

        //desenha arcos preenchidos com o mais externo
        for (int counter = cores.length; counter > 0; counter--) {

            //configura a cor para o arco atual
            g.setColor(cores[counter - 1]);

            //preenche o arco de 0 a 180 graus
            g.fillArc(centerX - counter * radius, centerY - counter * radius, counter * radius * 2, counter * radius * 2, 0, 180);
        }

    }
} // fim da classe

