/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap7;

import java.security.SecureRandom;
import java.util.Arrays;

/**
 *
 * @author Diogo
 */
public class PasseioDoCavalo {

    public static void main(String[] args) {

        int[][] tabuleiro = new int[8][8]; //array que simula o tabuleiro

        //arrays utliziados no mesmo indice para simular o andar do cavalo no xadrez
        int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2}; //array com o numero de movimentos na linha que o cavalo executa 
        int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1}; //array com o numero de movimentos na coluna que o cavalo executa

        boolean x = true; //variavel de controle do loop que faz o sorteio de movimentos do cavalo dentro do tabuleiro
        int b = 0; // variavel de contagem de lancamentos de jogadas
        int t = 0; // variavel que verifica se todas as 64 jogadas foram feitas
        int sorteado = 0;

        //preenche o tabuleiro com numeros 0
        for (int[] row : tabuleiro) {
            Arrays.fill(row, 0);
        }

        //variaveis que armazenam o ultimo local visitado pelo cavalo. inicia em 0-0
        int currentColumn = 0;
        int currentRow = 0;

        //objeto para sortear novos movimentos do cavalo
        SecureRandom sortear = new SecureRandom();

        int moveNumber;

        //Loop ate que todas as posicoes do tabuleiro sejam visitadas pelo cavalo
        while (b < 64) {

            moveNumber = 1 + sortear.nextInt(7);

            if (horizontal[moveNumber] + currentRow >= 0 && horizontal[moveNumber] + currentRow <= 7) {
                if (vertical[moveNumber] + currentColumn >= 0 && vertical[moveNumber] + currentColumn <= 7) {

                    currentRow += horizontal[moveNumber];
                    currentColumn += vertical[moveNumber];
                    sorteado++;

                    if (tabuleiro[currentRow][currentColumn] == 0) {
                        tabuleiro[currentRow][currentColumn] = 1;
                        b++;
                    } else {
                        tabuleiro[currentRow][currentColumn] += 1;
                    }
                }
            }

        }
        for (int[] row : tabuleiro) {
            System.out.println();
            for (int column : row) {
                System.out.print(column + " ");
            }
        }
        System.out.println("\n\nSorteado " + sorteado + " vezes");

    }
}
