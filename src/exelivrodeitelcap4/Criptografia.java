package exelivrodeitelcap4;

import java.util.Scanner;

public class Criptografia {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int n1, n2, n3, n4;
        System.out.println("Digite um numero de 4 algarismos para ser criptografado");
        int num = tec.nextInt();
        int c1, c2, c3, c4;

        n4 = (num % 10);
        n3 = ((num / 10) % 10);
        n2 = ((num / 100) % 10);
        n1 = ((num / 1000) % 10);

        n1 = (n1 + 7) % 10;
        n2 = (n2 + 7) % 10;
        n3 = (n3 + 7) % 10;
        n4 = (n4 + 7) % 10;

        c1 = n3;
        c2 = n4;
        c3 = n1;
        c4 = n2;

        System.out.println("Numero criptografado\n" + c1 + "" + c2 + "" + c3 + "" + c4);

        System.out.println("Digite um numero criptografado para descriptografia");
        num = tec.nextInt();

        n4 = (num % 10);
        n3 = ((num / 10) % 10);
        n2 = ((num / 100) % 10);
        n1 = ((num / 1000) % 10);

        n1 = (10 + (n1 % 10)) - 7;
        n2 = (10 + (n2 % 10)) - 7;
        n3 = (10 + (n3 % 10)) - 7;
        n4 = (10 + (n4 % 10)) - 7;

        if (n1 >= 10) {
            n1 -= 10;
        }
        if (n2 >= 10) {
            n2 -= 10;
        }
        if (n3 >= 10) {
            n3 -= 10;
        }
        if (n4 >= 10) {
            n4 -= 10;
        }

        c1 = n3;
        c2 = n4;
        c3 = n1;
        c4 = n2;

        System.out.println("numero descriptografado\n" + c1 + "" + c2 + "" + c3 + "" + c4);

    }
}
