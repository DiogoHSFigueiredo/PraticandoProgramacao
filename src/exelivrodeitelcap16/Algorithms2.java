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
public class Algorithms2 {

    public static void main(String[] args) {
        //inicializa list1 e list2
        String[] colors = {"red", "white", "yellow", "blue"};
        List<String> list1 = Arrays.asList(colors);
        ArrayList<String> list2 = new ArrayList<>();

        list2.add("black"); // adiciona "black" ao final de list2
        list2.add("red"); //adiciona "red" ao finalo da list2
        list2.add("green"); // adiciona "green" ao final da list2

        System.out.print("Before addall, list2 contains: ");

        //exibe os elementos em list2
        for (String s : list2) {
            System.out.printf("%s ", s);

        }
 
        Collections.addAll(list2, colors); //adiciona Strigns colors a list2.

        System.out.printf("%nAfter addAll, list2 contains: ");

        //exibe os elementos em list2
        for (String s : list2) {
            System.out.printf("%s ", s);
        }

        //obtem frequencia de "red"
        int frequency = Collections.frequency(list2, "red");
        System.out.printf("%nFrequency of red in list2: %d%n", frequency);

        //verifica se list1 e list2 tem elementos em comum
        boolean disjoint = Collections.disjoint(list1, list2);

        System.out.printf("list1 and list2 %s elements in comon%n", (disjoint ? "do not have" : "have"));
    }
}
