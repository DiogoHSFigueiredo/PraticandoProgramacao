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
public class exe618 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite a quantidade de asteriscos que deseja desenhar LxL");

        int n = tec.nextInt();
        squareOfAsterisks(n);

    }

    public static void squareOfAsterisks(int num) {

        int numero = num * num;
        int cont = 0;
        while (numero > 0) {
            System.out.print("*");
            numero--;
            cont++;
            if (cont == num) {
                System.out.println("");
                cont = 0;
            }
        }
    }
}
