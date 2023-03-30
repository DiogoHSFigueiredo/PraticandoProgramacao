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
public class Mdc {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite dois inteiros para acharmos o MDC\nDigite o primeiro");
        int n1 = tec.nextInt();
        System.out.println("Digite o segundo");
        int n2 = tec.nextInt();
        System.out.println("O MDC dos numeros digitados e: " + mDC(n1, n2));

    }

    public static int mDC(int n1, int n2) {
        int nd = 2;
        int mdc = 1;
        boolean x = true;

        while (x) {
            if (nd > n1 || nd > n2) {
                x = false;
                break;
            }
            if ((n1 % nd == 0) && (n2 % nd == 0)) {
                n1 = n1 / nd;
                n2 = n2 / nd;
                mdc *= nd;
            } else {
                nd++;
            }

        }
        return mdc;
    }

}
