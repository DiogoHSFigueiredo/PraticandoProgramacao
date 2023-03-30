package exelivrodeitelcap5;

import java.util.Scanner;

public class Exe516 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        System.out.println("Vamos imprimir \"barras\" conforme o numero digitado.\nDigite 5 numeros inteiros");
        int a, b, c, d, e, x;
        a = tec.nextInt();
        b = tec.nextInt();
        c = tec.nextInt();
        d = tec.nextInt();
        e = tec.nextInt();

        x = a;
        for (int i = 0; i < a; i++) {

            System.out.print("*");

        }
        System.out.println();

        for (int i = 0; i < b; i++) {

            System.out.print("*");

        }
        System.out.println();

        for (int i = 0; i < c; i++) {

            System.out.print("*");

        }
        System.out.println();

        for (int i = 0; i < d; i++) {

            System.out.print("*");

        }
        System.out.println();

        for (int i = 0; i < e; i++) {

            System.out.print("*");

        }
        System.out.println();

    }
}
