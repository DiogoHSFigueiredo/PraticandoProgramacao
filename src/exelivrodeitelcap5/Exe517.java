package exelivrodeitelcap5;

import java.util.Scanner;

public class Exe517 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.println("Bem vindo ao mercado\nLista de produtos:\n1-Agua\n2-Biscoito\n3-Cafe\n4-Chocolate\n5-Salgadinho\n");

        int x = 1, qtd = 0, np1 = 0, np2 = 0, np3 = 0, np4 = 0, np5 = 0;
        double qtd1 = 0, qtd2 = 0, qtd3 = 0, qtd4 = 0, qtd5 = 0, total = 0;

        while (x != 0) {
            System.out.println("Digite o numero do produto\nOu digite '0' para sair");
            x = tec.nextInt();
            if (x == 0) {
                break;
            }
            System.out.println("Digite a quantidade");
            qtd = tec.nextInt();

            switch (x) {
                case (1): {
                    System.out.println("Agua : Valor = 2.98 x " + qtd + " = " + (qtd * 2.98));
                    qtd1 += (qtd * 2.98);
                    np1 += qtd;
                    break;
                }
                case (2): {
                    System.out.println("Biscoito : Valor = 4.50 x " + qtd + " = " + (qtd * 4.50));
                    qtd2 += (qtd * 4.50);
                    np2 += qtd;
                    break;
                }
                case (3): {
                    System.out.println("Cafe : Valor = 9.98 x " + qtd + " = " + (qtd * 9.98));
                    qtd3 += (qtd * 9.98);
                    np3 += qtd;
                    break;
                }
                case (4): {
                    System.out.println("Chocolate : Valor = 4.99 x " + qtd + " = " + (qtd * 4.49));
                    qtd4 += (qtd * 4.49);
                    np4 += qtd;
                    break;
                }
                case (5): {
                    System.out.println("Salgadinho : Valor = 6.87 x " + qtd + " = " + (qtd * 6.87));
                    qtd5 += (qtd * 6.87);
                    np5 += qtd;
                    break;
                }

            }
        }

        System.out.println("Obrigado\nVoce comprou um total de: " + (np1 + np2 + np3 + np4 + np5) + " produtos");
        System.out.println("O valor total dos produtos e: " + String.format("%,.2f", (qtd1 + qtd2 + qtd3 + qtd4 + qtd5)));

    }

}
