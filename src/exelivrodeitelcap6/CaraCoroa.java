package exelivrodeitelcap6;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class CaraCoroa {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int c = 1;
        int ca = 0;
        int co = 0;

        enum Coin {
            HEADS, TAILS
        };

        while (c == 1) {
            System.out.println("Digite 1 para tirar a sorte\nDigite 0 para sair");
            c = tec.nextInt();
            if (c == 0 || c != 1) {
                break;
            }
            if (tirarSorte()) {
                System.out.println(Coin.HEADS);
                ca++;
            } else {
                System.out.println(Coin.TAILS);
                co++;
            }

        }
        System.out.println(Coin.HEADS + " " + ca);
        System.out.println(Coin.TAILS + " " + co);

    }

    public static boolean tirarSorte() {
        boolean x;
        SecureRandom sorte = new SecureRandom();
        x = sorte.nextBoolean();
        return x;

    }

}
