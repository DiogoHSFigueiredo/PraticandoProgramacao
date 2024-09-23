/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap23;

import java.security.SecureRandom;
import java.text.NumberFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

/**
 *
 * @author Diogo
 */
public class SortComparison {

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        //cria um array de ints aleatorios e entao o copia
        int[] array1 = random.ints(15_000_00).toArray();
        int[] array2 = new int[array1.length];
        System.arraycopy(array1, 0, array2, 0, array1.length);

        //cronometra a classificacao de array1 com metodo sort de Arrays
        System.out.println("Starting sort");
        Instant sortStart = Instant.now();
        Arrays.sort(array1);
        Instant sortEnd = Instant.now();

        //exibe os resultados do timing
        long sortTime = Duration.between(sortStart, sortEnd).toMillis();
        System.out.printf("Total time in milliseconds: %d%n%n", sortTime);

        //cronometra a classificacao de array2 com o metodo parallelSort de Arrays
        System.out.println("Starting parallelSort");
        Instant parallelSortStart = Instant.now();
        Arrays.parallelSort(array2);
        Instant parallelSortEnd = Instant.now();

        //exibe os resultados no timing
        long parallelSortTime = Duration.between(parallelSortStart, parallelSortEnd).toMillis();
        System.out.printf("Total time in milliseconds: %d%n%n", parallelSortTime);

        //exibe a diferenca de tempo como um percentual
        String percentage = NumberFormat.getPercentInstance().format((double) sortTime / parallelSortTime);
        System.out.printf("%nsort took %s more time than parallelSort%n", percentage);
    }
} //fim da classe SortComparison
