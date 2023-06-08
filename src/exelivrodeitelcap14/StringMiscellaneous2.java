/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap14;

/**
 *
 * @author Diogo
 */
public class StringMiscellaneous2 {

    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "GOODBYE";
        String s3 = "   spaces  gold   ";

        System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%n%n", s1, s2, s3);

//testa o metodo replace
        System.out.printf("Replace 'l' with 'L' in s1: %s%n%n", s1.replace('l', 'L'));

//testa o toLowerCase e toUpperCase
        System.out.printf("s1.toUpperCase() = %s%n", s1.toUpperCase());
        System.out.printf("s2.toLowerCase() = %s%n%n", s2.toLowerCase());

//testa o metodo trim
        System.out.printf("s3 after trim = \"%s\"%n%n", s3.trim());

//testa o metodo toCharArray
        char[] charArray = s1.toCharArray();
        System.out.print("s1 as a character array = ");

        for (char character : charArray) {
            System.out.print(character);
        }
        System.out.println();

    }

}
