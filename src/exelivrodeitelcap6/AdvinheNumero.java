/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap6;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class AdvinheNumero {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        SecureRandom ns = new SecureRandom();
        int numero;
        int tentativa = 0;
        boolean x = true;
        int palpite = 0;

        numero = 1 + ns.nextInt(1000);
        System.out.println("\nEstou pensando em um numero entre 1 e 1.000.\nVamos tentar adivinha-lo?");

        while (x) {

            System.out.println("Digite seu palpite");

            palpite = tec.nextInt();

            tentativa = Math.abs(palpite - numero);

            if (tentativa >= 500 && tentativa < 1000) {
                tentativa = 500;
            } else if (tentativa >= 250 && tentativa < 500) {
                tentativa = 250;
            } else if (tentativa >= 100 && tentativa < 250) {
                tentativa = 100;
            } else if (tentativa >= 50 && tentativa < 100) {
                tentativa = 50;
            } else if (tentativa >= 25 && tentativa < 50) {
                tentativa = 25;
            } else if (tentativa >= 10 && tentativa < 25) {
                tentativa = 10;
            } else if (tentativa >= 5 && tentativa < 10) {
                tentativa = 5;
            } else if (tentativa >= 1 && tentativa < 5) {
                tentativa = 2;
            } else if (palpite == numero) {
                x = false;
                break;
            }

            switch (tentativa) {
                case (500): {
                    System.out.println("Estamos bem longe ainda\n|X| | | | | | | |");
                    break;
                }
                case (250): {
                    System.out.println("Aproximou um cadim\n|X|X| | | | | | |");
                    break;
                }
                case (100): {
                    System.out.println("Agora comecamos o jogo\n|X|X|X| | | | | |");
                    break;
                }
                case (50): {
                    System.out.println("Ta esquentando\n|X|X|X|X| | | | |");
                    break;
                }
                case (25): {
                    System.out.println("Ta esquentando mais\n|X|X|X|X|X|X| | |");
                    break;
                }
                case (10): {
                    System.out.println("Vai fever logo\n|X|X|X|X|X| | | |");
                    break;
                }
                case (5): {
                    System.out.println("Ta pegando fogo ja\n|X|X|X|X|X|X| | |");
                    break;
                }
                case (2): {
                    System.out.println("Preparando para o premio ja\n|X|X|X|X|X|X|X| |");
                    break;
                }
            }

        }
        System.out.println("PARABENS VOCE ACERTOU");

        System.out.println("Numero sorteado " + numero);

    }

}
