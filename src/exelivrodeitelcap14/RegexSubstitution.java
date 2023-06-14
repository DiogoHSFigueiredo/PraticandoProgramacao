/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap14;

import java.util.Arrays;

/**
 *
 * @author Diogo
 */
public class RegexSubstitution {

    public static void main(String[] args) {

        String firstString = "This sentence ends is 5 stars *****";
        String secondString = "1, 2, 3, 4, 5, 6, 7, 8";
        System.out.println("Original String 1:" + firstString);

        //substitui '*' por '^'
        firstString = firstString.replaceAll("\\*", "^");
        System.out.println("^ Substituted for *: " + firstString);

        //substitui asteriscos por circunflexos
        firstString = firstString.replaceAll("stars", "carets");
        System.out.printf("\"carets\" substituted for \"stars\": %s%n", firstString);

        //substitui 'palavras' por 'palavra'
        System.out.printf("Every word replaced by \"word\": %s%n%n", firstString.replaceAll("\\w+", "word"));

        //substitui os tres digitos pelo 'digito'
        for (int i = 0; i < 3; i++) {
            secondString = secondString.replaceFirst("\\d", "digit");
        }
        System.out.printf("First 3 digitis repalced by \"digit\" : %s%n", secondString);

        System.out.print("String split at commas: ");
        String[] results = secondString.split(",\\s*"); //divide em virgulas
        System.out.println(Arrays.toString(results));
    }
}
