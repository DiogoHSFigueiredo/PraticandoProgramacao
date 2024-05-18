/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap16;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Diogo
 */
public class Sort1 {

    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        //Cria e exibe uma lista contendo os elementos do array naipes
        List<String> list = Arrays.asList(suits);
        System.out.printf("Unsorted array elements: %s%n", list);

        Collections.sort(list); //classifica ArrayList
        System.out.printf("Sorted array elements: %s%n", list);
    }
}
