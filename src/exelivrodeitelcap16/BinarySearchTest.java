/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Diogo
 */
public class BinarySearchTest {

    public static void main(String[] args) {
        //cria um ArrayList <String> a partir do conteudo do array colors
        String[] colors = {"red", "white", "blue", "black", "yellow", "purple", "tan", "pink"};
        List<String> list = new ArrayList<>(Arrays.asList(colors));

        Collections.sort(list); //classifica ArrayList
        System.out.printf("Sorted ArrayList: %s%n", list);

        //pesquisa vários valores na lista
        printSearchResults(list, "black");// primeiro item
        printSearchResults(list, "red"); //item do meio
        printSearchResults(list, "pink"); //ultimo item
        printSearchResults(list, "aqua"); //abaixo do mais baixo
        printSearchResults(list, "gray"); //nao existem
        printSearchResults(list, "teal"); //nao existe
    }
//realiza pesquisa e exibe o resultado

    private static void printSearchResults(List<String> list, String key) {
        int result = 0;
        System.out.printf("%nSearching for: %s%n", key);
        result = Collections.binarySearch(list, key);

        if (result >= 0) {
            System.out.printf("Found at index %d%n", result);
        } else {
            System.out.printf("Not Found (%d)%n", result);
        }
    }
}
