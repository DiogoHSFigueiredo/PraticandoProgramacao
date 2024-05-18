package exelivrodeitelcap17;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 *
 * @author Diogo
 */
public class ArraysAndStreams2 {

    public static void main(String[] args) {
        String[] strings = {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};

        //exibe strings originais
        System.out.printf("Original strings: %s%n", Arrays.asList(strings));

        //strings em maiusculas
        System.out.printf("string in uppercase: %s%n", 
                Arrays.stream(strings)
                .map(String::toUpperCase)
                .collect(Collectors.toList()));

        //String menores que "n" (sem distincao maiusc/minusc) en ordem crescente
        System.out.printf("Strings greater than m sorted ascending: %s%n", 
                Arrays.stream(strings)
                .filter(s -> s.compareToIgnoreCase("m") < 0)
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList()));

        //String menores que "n" (com distincao maius/minusc) em ordem decrescente
        System.out.printf("string greater than m sorted descending: %s%n", 
                Arrays.stream(strings)
                .filter(s -> s.compareToIgnoreCase("m") < 0)
                .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                .collect(Collectors.toList()));
    }
}
