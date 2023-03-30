/*
 */
package exelivrodeitelcap4;

import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class CalcPopMundial {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double popMAtual;
        double txCresci;
        double popProjetada = 0;
        int cont = 1;

        System.out.println("Digite a populacao mundial atual em bilhoes");
        popMAtual = tec.nextDouble();

        System.out.println("Digite a taxa de crescimento");
        txCresci = tec.nextDouble();

        popProjetada = popMAtual;

        while (cont <= 75) {

            popProjetada += popProjetada * (txCresci / 100);

            System.out.println("Em " + cont + " ano(s) a populacao mundial sera de: " + String.format("%.3f Bilhoes", popProjetada));

            cont++;
        }

    }

}
