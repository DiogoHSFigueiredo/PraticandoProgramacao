package exelivrodeitelcap4;

import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class Palindromos {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        System.out.println("Vamos testar se o numero digitado e um palindromo\nDigite um numero de 5 algarismo");
        int numero = tec.nextInt();
        int n1, n2, n3, n4, n5;

        n5 = (numero % 10); //recebe o �ltimo digito
        n4 = ((numero / 10) % 10); //recebe o 4 digito
        n3 = ((numero / 100) % 10); // recebe o 3 digito
        n2 = ((numero / 1000 % 10)); // recebe o 2 digito
        n1 = ((numero / 10000) % 10); // recebe o 1 digito

        if (n1 == n5) {
            if (n2 == n4) {
                System.out.println("O numero e palindromo");
            }
        } else {
            System.out.println("Nao e palindromo");
        }
    }

}
