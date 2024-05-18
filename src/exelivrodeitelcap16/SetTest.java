/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap16;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Diogo
 */
public class SetTest {

    public static void main(String[] args) {
        //Cria e exibe uma List<String>
        String[] colors = {"red", "white", "blue", "green", "gray", "orange", "tan", "white", "cyan", "peach", "gray", "orange"};
        List<String> list = Arrays.asList(colors);
        System.out.printf("List: %s%n", list);

        //elimina duplicatas, entao imprime os valores unicos
        printNonDuplicates(list);
    }

    //cria um Set de uma colecao para eliminar duplicatas
    private static void printNonDuplicates(Collection<String> values) {
        //cria um HashSet
        Set<String> set = new HashSet<>(values);
        System.out.printf("%nNonduplicates are : ");

        for (String value : set) {
            System.out.printf("%s ", value);
        }
    }
}
