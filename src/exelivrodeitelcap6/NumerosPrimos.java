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
public class NumerosPrimos {

    public static void main(String[] args) {
        boolean x = true;
        while (x) {
            Scanner tec = new Scanner(System.in);
            System.out.println("\nDigite um numero para verificar se ele e todos abaixo dele sao primos\nOu digite -0- para sair");
            int nD = tec.nextInt();
            System.out.println();
            if (nD == 0) {
                System.out.println("Exit");
                break;
            }
            while (nD > 0) {
                testPrimo(nD);
                nD--;
            }
        }
    }

    public static void testPrimo(int numero) {
        int num = numero;
        int x = 0;

        while (num > 0) {
            if (numero % num == 0) {
                x++;
            }
            num--;
        }
        if (x == 1) {
            System.out.println("O numero 1 por definicao -NAO- e PRIMO");
        } else if (x == 2) {
            System.out.println(numero + " PRIMO");
        } else {
            System.out.println(numero + " -NAO- PRIMO");
        }
    }

}
