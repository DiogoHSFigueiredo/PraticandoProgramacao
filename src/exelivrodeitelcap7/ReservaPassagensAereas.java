/*
O QUE E:
    Sistema para reservas de passagens aereas. Com 5 poltronas na primeira classe e 5 na segunda classe. O usuario deve escolher entre uma das opcoes ou aceitar uma das disponivel

O QUE ELE FAZ:
    Se apresenta; Informa ao usuario sobre as opções de assentos; Pergunta a opção do usuario; Executa a reserva se opção disponivel; Sugere opção disponivel caso a escolha do usuario nao for possivel; Imprime a organizao geral de assentos no voo;

COMO ELE FAZ:
    Envia mensagem de apresentacao
        OUTPUT
    Solcita e registra o nome do usuario
        OBJETO SCANNER E VARIAVEL NOME
    Informa as opcoes de assentos disponivel
        LEITURA E OUTPUT DE ARRAY DE ASSENTOS
    Registra e valida opcao escolhida pelo usuario
        VARIAVEL E REGISTRO NO ARRAY
    Caso opcao indisponivel sugerir nova opcao
        OUTPUT VALIDACAO E REGISTRO
    Loop para reserva de assentos enquanto usuario desejar
        WHILE
    Gerar saida de organizacao de assentos 
        OUTPUT DO ARRAY
 */
package exelivrodeitelcap7;

import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class ReservaPassagensAereas {

    public static void main(String[] args) {

        System.out.println("BEM VINDO A GOLD AIRLINES");

        Scanner tec = new Scanner(System.in);
        boolean x = true, d;
        boolean[] reservas = new boolean[10];
        int y = 1, o = 1;
        int opcao, assento;
        do {
            System.out.println("\nDESEJA RESERVAR UM ASSENTO?\n\tDIGITE\n 1 - SIM\n 0 - NAO");
            opcao = tec.nextInt();
            if (opcao == 0) {
                x = false;
                break;
            } else if (opcao == 1) {
                for (boolean verificar : reservas) {

                    if (verificar) {
                        System.out.println("Assento: " + y + " RESERVADO");
                        y++;
                    } else {
                        System.out.println("Assento: " + y + " Disponivel");
                        y++;
                    }

                }

                System.out.println("\nDigite o assento desejado");
                assento = tec.nextInt();

                if (assento < 1 || assento > 10) {
                    System.out.println("\nDigite um assento valido entre 1 e 10");
                } else if (reservas[assento - 1] == false) {
                    reservas[assento - 1] = true;
                    if (assento <= reservas.length / 2) {
                        System.out.println("Reserva PRIMEIRA CLASSE EFETUADA");
                    } else {
                        System.out.println("Reserva na CLASSE ECONOMICA EFETUADA");
                    }
                } else {
                    System.out.println("Indisponivel, escolha outro assento");
                }
                y = 1;

            } else {
                System.out.println("OPCAO INCORRETA\n");
            }

        } while (x);

        System.out.println("\tSTATUS DO VOO\n");
        for (boolean exibir : reservas) {

            if (exibir) {
                System.out.println("Assento " + o + " OCUPADO");
                o++;
                    
            } else {
                System.out.println("Aseento " + o + " DISPONIVEL");
                o++;
            }
        }

    }

}
