/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap5;

import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class CalculadoraJuros {

    public static void main(String[] args) {
        /*
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite o valor de deposito inicial");
        double vlInicial = tec.nextDouble();
        double montante = 0;
        System.out.println("Digite o valor da taxa de juros anual");
        double taxa = tec.nextDouble();

        for (int i = 1; i <= 10; i++) {
            montante = vlInicial * (1 + taxa);
            vlInicial = montante;
            System.out.printf("%s%.2f%n", "Valor ao final de cada ano ", montante);
        }
         */

        Scanner tec = new Scanner(System.in);

        System.out.println("Digite o valor de deposito inicial");
        int vlInicial = tec.nextInt();
        double montante = 0;
        System.out.println("Digite o valor da taxa de juros anual");
        double taxa = (tec.nextDouble() / 100);
        taxa += 1;
        System.out.printf("%s%20s %n", "Ano", "Valor em Deposito");

        for (int year = 1; year <= 10; year++) {

            montante = vlInicial * Math.pow(taxa, year);

            System.out.printf("%4d%,20.2f%n", year, montante);
        }
    }

}
