/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap6;

import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class NumerosPerfeitos {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("\t\tOla\nDigite um numero para verificarmos se ele e todos os abaixo dele sao perfeitos");
        int numero = tec.nextInt();
        isPerfect(numero);
    }

    public static void isPerfect(int num) {
        int qtdPerfeito = 0;
        int contf = num;

        while (contf >= 1) {

            int teste = 0;
            int numd = contf;
            int cont = contf - 1;

            while (cont >= 1) {

                if ((contf % cont) == 0) {

                    teste += cont;
                }
                --cont;
            }
            if (teste == numd) {

                int d = contf - 1;
                String numeros = "";

                while (d >= 1) {
                    if (contf % d == 0) {
                        numeros += " " + d;
                    }
                    d--;
                }
                System.out.println("" + numd + "\t Numero e perfeito\nFATORES: " + numeros);
                qtdPerfeito++;

            } else {
                System.out.println("" + numd + " Este numero -NAO- e perfeito");
            }
            contf--;
        }
        System.out.println("Quantidade de numeros perfeitos encontrada " + qtdPerfeito);
    }

}
