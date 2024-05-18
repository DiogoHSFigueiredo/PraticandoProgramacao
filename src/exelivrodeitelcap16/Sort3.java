package exelivrodeitelcap16;

import exelivrodeitelcap8.Time2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Diogo
 */
public class Sort3 {

    public static void main(String[] args) {

        List<Time2> list = new ArrayList<>(); // cria List

        list.add(new Time2(6, 24, 34));
        list.add(new Time2(18, 14, 58));
        list.add(new Time2(6, 05, 34));
        list.add(new Time2(12, 14, 58));
        list.add(new Time2(6, 24, 22));

        //gera saida de elementos List
        System.out.printf("Unsorted array elements:%n%s%n", list);

        //classifica em ordem utilizando um comparador
        Collections.sort(list, new TimeComparator());

        //gera saida de elementos List
        System.out.printf("Sorted list elements:%n%s%n", list);
    }
}
