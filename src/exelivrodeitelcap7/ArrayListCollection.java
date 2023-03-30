/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap7;

import java.util.ArrayList;

/**
 *
 * @author Diogo
 */
public class ArrayListCollection {

    public static void main(String[] args) {

        //cria novo ArrayList de String com capacidade inicial 10
        ArrayList<String> items = new ArrayList();

        items.add("red"); //adiciona 1 item a lista
        items.add(0, "yellow"); //adiciona 1 item a lista no indice 0

        //cabecalho
        System.out.print("Display list contents with coutner-controlled loop:");

        //exibe as cores na lista
        for (int i = 0; i < items.size(); i++) {
            System.out.printf(" %s", items.get(i));
        }

        //exibe cores usando for aprimorado
        display(items, "%nDisplay list contents with enhanced for statment:");

        items.add("green");
        items.add("yellow");
        display(items, "List with two new elements:");

        items.remove("yellow");
        display(items, "Remove first istance of yellow: ");

        items.remove(1); // remove o item no indice 1
        display(items, "Remove second list element (green): ");

        //verifica se um valor esta na list
        System.out.printf("\"red\" is %sin the list%n", items.contains("red") ? "" : "not ");

        //exibe o numero de elementos list
        System.out.printf("Size: %s%n", items.size());
    }

    //exibe os elementos do ArrayList no console
    public static void display(ArrayList<String> items, String header) {
        System.out.printf(header);

        //exibe cada elemento de itens
        for (String item : items) {
            System.out.printf(" %s", item);
        }
        System.out.println();
    }
}
