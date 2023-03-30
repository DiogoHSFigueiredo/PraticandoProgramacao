/*
O QUE E
    Sistema para consolidar mensalmente as vendas diarias de 4 vendedores e 5 tipos de produtos

O QUE ELE FAZ
    Recebe o nome do vendedor; recebe o numero do produto; recebe o valor de vendas daquele produto naquele dia;
    Armazena as informacoe em um array
    Imprime o consolidado tabelado por nomes x produtos x valores vendidos por produto / por vendedor

COMO ELE FAZ
    Cria objeto scanner para receber entrada do usuario
    Cria objeto array para armazenar as informacoes
    Cria variaveis nomeVendedor; nome produto; vlVendaDiaria
    Armazena as informacoes conforme estrutura do array
    Imprimi o consolidado de forma tabular vendas por vendedor x produto
    


 */
package exelivrodeitelcap7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class VendasTotais {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int[][] tabela = new int[5][7];

        int numVendedor;
        int numProduto;
        int vlVendaDia;
        boolean x = true;

        System.out.println("\tBEM VINDO AO SISTEMA DE LANCAMENTO DE NOTAS");

        do {
            System.out.println("DIGITE SEU NUMERO DE VENDEDOR 1-4\nSair DIGITE - 0");
            numVendedor = tec.nextInt();
            if (numVendedor == 0) {
                x = false;
                break;
            }
            System.out.println("DIGITE O NUMERO DO PRODUTO 1-5");
            numProduto = tec.nextInt();
            System.out.println("DIGITE O VALOR VENDIDO NESTE DIA");
            vlVendaDia = tec.nextInt();

            //preeche a coluna vendedor da tabela de saida com vendedor n 1 a 4
            for (int i = 0, j = 0; i < 4; i++) {
                tabela[i][j] = i + 1;
            }

            tabela[numVendedor - 1][numProduto] += vlVendaDia;
            tabela[numVendedor - 1][6] += vlVendaDia;
            tabela[4][numProduto] += vlVendaDia;
            tabela[4][6] += tabela[numVendedor - 1][numProduto];

        } while (x);

        System.out.println("VENDEDOR\tITEM - 1\t ITEM - 2\t ITEM - 3\t ITEM - 4\t ITEM - 5\t VALOR TOTAL");

        for (int l = 0; l < tabela.length; l++) {
            System.out.println();

            for (int c = 0; c < tabela[l].length; c++) {
                if (l == 4) {
                    break;
                }
                System.out.print(tabela[l][c] + "\t\t");
            }

        }

        System.out.print("TOTAIS\t\t" + tabela[4][1] + "\t\t" + tabela[4][2] + "\t\t" + tabela[4][3] + "\t\t" + tabela[4][4] + "\t\t" + tabela[4][5]
                + "\t\t" + tabela[4][6]);
        System.out.println();
    }

}
