/*     1- O que ele é
            Exercicio que calcula o valor vendido por funcionários a partir do valor recebido como salario
            Regras: Pagamento semanala composto por comissão fixa semanal de 200, acrescido de 9% do valor total de vendas semanal
        
        2- O que ele faz (simplificado)
            Recebe o nome do funcionario
            Recebe o valor de salario recebido pelo funcionario
            Realiza calculos para conhecer o valor recebido como comissao
            Informa o valor recebido como salario fixo semanala e o valor recebido como comissao pelas vendas

        3- Como ele faz
            Recebe o nome do funcionario
            Recebe o valor bruto de salario recebido
            Subtrai o valor fixo de comissao
            Faz uma regra de 3 para conhecer o valor de venda que originou a comissao recebida
            Informa ao funcionario seu nome e discrimina os valores recebidos

 */
package exelivrodeitelcap7;

import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class ComissoesVendas {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in); //Cria objeto scanner para captar entradas do usuario

        //declara variaveis
        String nome = "";
        double vlSalario = 0;
        double vlVenda = 0;

        //int[] tabela = {99, 199, 299, 399, 499, 599, 699, 799, 899, 999}; //Declara vetor com tabela de comissoes ate 1000
        System.out.println("Ola\nDigite o nome do funcionario");
        nome = tec.nextLine();

        System.out.println("Digite o salario recebido");
        vlSalario = tec.nextInt();

        vlVenda = (vlSalario - 200) / 0.09;

        System.out.println(nome + "\nComissao Fixa: " + 200 + "\nValor das vendas : " + String.format("%.2f", vlVenda) + "\n9% de comissao pelas vendas:" + (vlSalario - 200) + "\nTotal: " + vlSalario);

    }

}

/*
Recebido = 9/100
Total = 100?


recebido * 100 = total * 0.09
 */
