package exelivrodeitelcap6;

import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class Exe621 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        System.out.println("Digite um numero de ate 5 digitos para fazermos a sua separacao de digitos");
        int numero = tec.nextInt();
        System.out.println("Seu numero digitado foi" + displayDigits(Integer.toString(numero)));
    }

    public static String displayDigits(String numeroD) {
        //exe numero 12345

        int digito = Integer.parseInt(numeroD);
        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0;
        boolean x = true;
        int a = 1;
        int b;
        int c = 0;
        String numero = " ";

        //loop que conta o numero de casas decimais o numero digitado tem no contador c;
        while (x) {
            b = quoInt(digito, a);
            a *= 10;
            c++;
            if (b == 0) {
                x = false;
                c--;
            }

        }
        System.out.println("O numero possui " + c + " digitos");

        switch (c) {
            case (5): {
                n5 = intRes(digito / (int) (Math.pow(10, 4)), 10);
            }
            case (4): {
                n4 = intRes(digito / (int) (Math.pow(10, 3)), 10);
            }
            case (3): {
                n3 = intRes(digito / (int) (Math.pow(10, 2)), 10);
            }
            case (2): {
                n2 = intRes(quoInt(digito, 10), 10);
            }
            case (1): {
                n1 = intRes(digito, 10);
            }
        }

        switch (c) {
            case (5): {
                numero += "  " + n5;
            }
            case (4): {
                numero += "  " + n4;
            }
            case (3): {
                numero += "  " + n3;
            }
            case (2): {
                numero += "  " + n2;
            }
            case (1): {
                numero += "  " + n1;
            }
        }

        return numero;
    }

    public static int intRes(int a, int b) {

        int intRes = a % b;

        return intRes;
    }

    public static int quoInt(int a, int b) {

        int intquo = a / b;

        return intquo;
    }
}
