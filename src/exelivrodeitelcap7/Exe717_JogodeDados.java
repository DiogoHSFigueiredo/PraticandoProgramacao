/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap7;

import java.security.SecureRandom;

/**
 *
 * @author Diogo
 */
public class Exe717_JogodeDados {

    public static void main(String[] args) {

        int[] array = new int[13];

        for (int i = 1; i < 36000000; i++) {
            ++array[jogarDados()];
        }
        int i = 0;
        for (int a : array) {

            System.out.println("Valor " + i + " Repeticoes " + a);
            i++;
        }
    }

    public static int jogarDados() {
        SecureRandom n = new SecureRandom();
        int d1;
        int d2;
        int valor;
        d1 = 1 + n.nextInt(6);
        d2 = 1 + n.nextInt(6);
        valor = d1 + d2;

        return valor;
    }

}
