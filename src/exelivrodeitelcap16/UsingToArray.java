package exelivrodeitelcap16;

import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author Diogo
 */
public class UsingToArray {

    //cria uma LinkedList, adiciona elementos e converte em array
    public static void main(String[] args) {

        String[] colors = {"black", "blue", "yellow"};
        LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));

        links.addLast("red"); //adiciona como o ultimo item
        links.add("pink"); //adiciona ao final
        links.add(3, "green"); //adiciona no terceiro indice
        links.addFirst("cyam"); //adiciona como primeiro item

        //obtém elementos LinkedList como um array
        colors = links.toArray(new String[links.size()]);

        System.out.println("colors: ");

        for (String color : colors) {
            System.out.println(color);
        }

    }
}
