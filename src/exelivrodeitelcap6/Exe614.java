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
public class Exe614 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.println("Ola, vamos calcular potencia");
        System.out.println("Digite o valor da base");
        int base = tec.nextInt();
        System.out.println("Digite o valor do expoente");
        int expoente = tec.nextInt();

        System.out.println("O valor da potencia e: " + integerPower(base, expoente));

    }

    public static int integerPower(int base, int exponent) {

        int valor = 1;
        while (exponent > 0) {

            valor *=  base;

            --exponent;

        }

        return valor;
    }

}
