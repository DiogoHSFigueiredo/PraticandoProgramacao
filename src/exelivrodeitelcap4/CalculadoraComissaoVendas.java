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
public class CalculadoraComissaoVendas {

    public static void main(String[] args) {

        String nome;
        double pgmtoSemanalF = 200;
        double vlrVendasSemanal = 0;
        double vlrComissao = 0;
        double vlrPagamento = 0;
        int cont = 1;
        double item1 = 0;
        double item2 = 0;
        double item3 = 0;
        double item4 = 0;
        int item = 0;
        int qtdItem = 0;
        Scanner tec = new Scanner(System.in);

        System.out.println("Bem vindo!!!\nInforme o nome do funcionario");
        nome = tec.nextLine();

        while (cont != 0) {
            System.out.println("Informe o numero de item e a quantidade vendida.\nPara sair digite 0\nLista de produtos: \nItem 1: 239.99\nItem 2: 129.75\nItem 3: 99.95\nItem 4: 350.89");
            item = tec.nextInt();
            if (item == 0) {
                cont = 0;
                break;
            }
            System.out.println("Digite a quantidade vendida do item");
            qtdItem = tec.nextInt();
            if (item == 1) {
                item1 += (qtdItem * 239.99);

            }
            if (item == 2) {
                item2 += (qtdItem * 129.75);
            }
            if (item == 3) {
                item3 += (qtdItem * 99.95);
            }
            if (item == 4) {
                item4 += (qtdItem * 350.89);
            }

        }

        vlrComissao = (item1 + item2 + item3 + item4) * 0.09;
        vlrVendasSemanal = item1 + item2 + item3 + item4;
        vlrPagamento = (pgmtoSemanalF + vlrComissao);
        System.out.println("Parabens " + nome + "\nSuas vendas brutas nesta semana foram de: " + String.format("%.2f", vlrVendasSemanal) + "\nSeu pagamento fixo e: " + pgmtoSemanalF + "\nSua comissao e: " + String.format("%.2f", vlrComissao) + "\nSeus redimentos totais sao: " + String.format("%.2f", vlrPagamento));
    }

}
