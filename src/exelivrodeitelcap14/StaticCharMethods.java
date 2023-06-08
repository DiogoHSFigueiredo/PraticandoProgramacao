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
public class StaticCharMethods {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in); //cria scanner
        System.out.println("Enter a character and press Enter");
        String input = tec.next();
        char c = input.charAt(1); //obtem o primeiro caractere de entrada

        //exibe informacoes de caracter
        System.out.printf("is defined: %b%n", Character.isDefined(c));
        System.out.printf("is digit: %b%n", Character.isDigit(c));
        System.out.printf("is first character in a Java identifier: %b%n", Character.isJavaIdentifierStart(c));
        System.out.printf("is part of a Java identifier: %b%n", Character.isJavaIdentifierPart(c));
        System.out.printf("is letter: %b%n", Character.isLetter(c));
        System.out.printf("is letter or digit: %b%n", Character.isLetterOrDigit(c));
        System.out.printf("is lower case: %b%n", Character.isLowerCase(c));
        System.out.printf("is upper case: %b%n", Character.isUpperCase(c));
        System.out.printf("to upper case: %s%n", Character.toUpperCase(c));
        System.out.printf("to lower case: %s%n", Character.toLowerCase(c));
        
        
    }
}
