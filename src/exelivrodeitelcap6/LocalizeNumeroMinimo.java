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
public class LocalizeNumeroMinimo {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("\t\tOla\nDigite 3 numeros float em sequencia para localizarmos o menor entre eles");
        float n1 = tec.nextFloat();
        float n2 = tec.nextFloat();
        float n3 = tec.nextFloat();
        System.out.printf("%s%.5f\n", "O menor numero e: ", minimum3(n1, n2, n3));

    }

    public static float minimum3(float n1, float n2, float n3) {
        float num;

        num = Math.min(n1, n2);
        if (n3 < num) {
            num = n3;
        }

        return num;
    }
}
