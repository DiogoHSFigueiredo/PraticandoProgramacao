/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap4;

import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class DesenhandoQuadrado {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Vamos desenhar um quadrado de lado entre 1 e 20\nDigite o valor do lado desejado");
        int numero = tec.nextInt();
        int coluna = 1;
        int linha = 1;

        while (coluna <= numero) {
            
            while (linha <= numero) {

                System.out.print("*");
                if (linha == numero) {
                    System.out.println();
                }
                linha++;
            }
            linha = 1;
            coluna++;

        }

        /*
        se a linha for 1 preenche ou linha maxima preenche tudo
                ao chegar no final pula linha
                        se a coluna for 1 ou maxima preenche]
                            senao deixa em branco
         */
    }
}
