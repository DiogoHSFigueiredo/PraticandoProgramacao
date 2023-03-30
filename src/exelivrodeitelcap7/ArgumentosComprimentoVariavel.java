/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap7;

import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class ArgumentosComprimentoVariavel {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int n;

        System.out.println("Chamando metodo com 5 parametros (5,7,8,10,) = " + produtoInt(5, 7, 8, 10));
        System.out.println("Chamando metodo com 3 parametros (5,2,3) = " + produtoInt(5, 2, 3));
        System.out.println("Chamando metodo com 2 parametros (5,2) = " + produtoInt(5, 2));

    }

    public static int produtoInt(int... valores) {
        int valor = 1;

        for (int v : valores) {
            valor *= v;
        }
        return valor;
    }
}
