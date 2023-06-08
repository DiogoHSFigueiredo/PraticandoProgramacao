/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap14;

import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class StaticCharMethods2 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        //obtem radical
        System.out.println("Please enter a radix:");
        int radix = tec.nextInt();

        //obtem escolha de usuario
        System.out.printf("Please choose one: %n1 -- %s%n2 -- %s%n", "Convert digit to character", "Convert character to digit");
        int choice = tec.nextInt();

        //processa solicitacao
        switch (choice) {
            case 1: {
                System.out.println("Enter a digit:");
                int digit = tec.nextInt();
                System.out.printf("Convert digit to character: %s%n", Character.forDigit(digit, radix));
                break;
            }

            case 2: {
                System.out.println("Enter a character");
                char character = tec.next().charAt(0);
                System.out.printf("Convet character to digit: %s%n", Character.digit(character, radix));
                break;
            }
        }
    }

}
