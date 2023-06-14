/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Diogo
 */
public class RegexMatches {

    public static void main(String[] args) {

//cria expressão regular
        Pattern expression = Pattern.compile("J.*\\d[0-35-9]-\\d\\d-\\d\\d");

        String string1 = "Jane's Birthday is 05-12-75\n"
                + "Dave's Birthday is 11-04-68\n"
                + "John's Bithday is 04-28-73\n"
                + "Joe's Bithday is 12-17-77";

        //corresponde expressao regular a string e imprime as correspondencias
        Matcher matcher = expression.matcher(string1);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
