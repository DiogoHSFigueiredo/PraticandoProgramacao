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
public class Exe616 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        boolean y = true;
        System.out.println("Digite 2 inteiros para saber se o segundo e multiplo do primeiro");

        while (y) {
            System.out.println("Digite o primeiro inteiro");
            int n1 = tec.nextInt();
            System.out.println("Digite o segundo inteiro");
            int n2 = tec.nextInt();

            if ((n1 == 0 || n2 == 0)) {
                break;
            }
            isMultiple(n1, n2);
        }
    }

    public static boolean isMultiple(int n1, int n2) {
        boolean resultado;

        if ((n1 % n2) == 0) {
            System.out.println("Sim o 2 inteiro e multiplo do primeiro\n");
            resultado = true;
        } else {
            System.out.println("O segundo inteiro nao e multiplo do primeiro\n");
            resultado = false;
        }

        return resultado;
    }
}
