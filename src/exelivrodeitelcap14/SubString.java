/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap14;

/**
 *
 * @author Diogo
 */
public class SubString {

    public static void main(String[] args) {

        String letters = "abcdefghijklmabcdefghijklm";

        //testa metodos substring
        System.out.printf("Substring from index 20 to end is \"%s\"%n", letters.substring(20));
        System.out.printf("%s \"%s\"%n", "Substring from index 3 up to, but not including 6 is", letters.substring(3, 8));
    }

}
