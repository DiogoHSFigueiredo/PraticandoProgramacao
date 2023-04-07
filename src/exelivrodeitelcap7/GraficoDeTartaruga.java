/*
O QUE E
    Um aplicativo que simula um jogo onde uma tartaura com uma caneta desenha ou não o local por onde passa, conforme a vontade do usuario.

O QUE ELE FAZ
    "Desenha" um rastro de "Caminho" por onde o usuario quiser fazer a tartatura andar e caso a caneta esteja virada para baixo

COMO ELE FAZ
    Cria um array multidimensional para ser o "tabuleiro/mapa onde iremos percorrer"
    Cria um Switch para decidir os comandos a serem executados conforme a opcao do usuario
    Cria variavel para guardar ultima localizacao da "tartagura"
    Cria variavel boolean para verificar se caneta esta em pe/true ou deitada/false
    Cria um output em forma de grafito de todo o array multidimensional

 */
package exelivrodeitelcap7;

import java.util.Arrays;

/**
 *
 * @author Diogo
 */
public class GraficoDeTartaruga {

    String[][] tabuleiro = new String[20][20];
    boolean canetaOn = false;
    int direcao = 0;
    int lastX;
    int lastY;
    int direcaoX;
    float[][] ultimaLocalizacao = new float[20][20];

    public GraficoDeTartaruga() {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = "|_|";

            }
        }
    }

    public float andar(int direcao, int ande) {
        if (direcao == 3) {
            for (int i = 0; i < ande; i++) {

                tabuleiro[0][i] = " * ";
            }
            lastX = ande;

        }
        if (direcao == 4) {
            for (int i = ande; i >= 0; i--) {

                tabuleiro[lastX][i] = " * ";
            }
            lastX = ande;

        }

        if (direcao == 1) {

            for (int i = 0; i < ande; i++) {

                tabuleiro[i][lastX] = " * ";

            }
            lastX = ande;
        }

        return direcao;
    }

    public void exibir() {
        for (int i = 0; i < tabuleiro.length; i++) {
            System.out.println();
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j]);

            }
        }

    }
}
