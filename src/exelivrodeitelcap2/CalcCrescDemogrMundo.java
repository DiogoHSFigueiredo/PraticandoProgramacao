/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap2;

import javax.swing.JOptionPane;

/**
 *
 * @author Diogo
 */
public class CalcCrescDemogrMundo {

    private static long popWorld = 7753; //numero em milhoes
    private static final double txCresci = 1; //valor em porcentagem exe. '1' = '1%'
    private int anos = 0;

    public static long  calcPopulacao(int ano) {

        while (ano > 0) {

            popWorld += (txCresci * 1 / 100) * popWorld;

            ano--;
        }
        JOptionPane.showMessageDialog(null, "A popula��o mundial sera de: " + popWorld +" MI");

        return popWorld;

    }

    public static void main(String[] args) {

         JOptionPane.showMessageDialog(null, "A populacao mundial em 2022 � de: "+popWorld+" MI");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos anos quer projetar para calculo da popula��o mundial "));

        if (ano != 0) {

            calcPopulacao(ano);

        } else {
            JOptionPane.showMessageDialog(null, "Voce digitou ano = 0, impossivel calcular");

        }

    }
}
