/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap10;

import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Diogo
 */
//classe de execucao
public class CriandoFormas extends JPanel {

    private SecureRandom randomNum = new SecureRandom();
    private Scanner teclado = new Scanner(System.in);
    private MyShape[] formas;
    private int num;

    //Construtor de um painel com formas, parametro com numero de formas
    public CriandoFormas() {
        
        //define a cor do painel
        setBackground(Color.WHITE);

        //Solicita o numero de formas que o usuario deseja criar
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de formas que deseja criar"));
      
         
        //criar array com numero de formas escolhidas pelo usuario
        formas = new MyShape[num * 3];

        //cria as formas
        for (int i = 0; i < formas.length; i++) {

            //gera cor aleatoria para cada nova forma
            Color color = new Color(randomNum.nextInt(256), randomNum.nextInt(256), randomNum.nextInt(256));

            //cria as formas
            formas[i] = new MyLine(randomNum.nextInt(200), randomNum.nextInt(200), randomNum.nextInt(200), randomNum.nextInt(200), color);
           i++;
            formas[i] = new MyOval(randomNum.nextInt(200), randomNum.nextInt(200), randomNum.nextInt(200), randomNum.nextInt(200), color);
            i++;
            formas[i] = new MyRectangle(randomNum.nextInt(200), randomNum.nextInt(200), randomNum.nextInt(200), randomNum.nextInt(200), color);
            

        }
    } // fim do construtor

    //desenha as formas individuais para o array
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //desenha as formas
        for (MyShape forma : formas) {
            forma.desenhar(g);
        }
    }
} // fim da classe

