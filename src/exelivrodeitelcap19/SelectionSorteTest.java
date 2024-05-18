package exelivrodeitelcap19;

import java.security.SecureRandom;
import java.util.Arrays;

/**
 *
 * @author Diogo
 */
public class SelectionSorteTest {

    //classifica o array utilizando a classifiacao por selecao
    public static void selectionSort(int[] data) {

        //faz um loop sobre data.length -1 elementos
        for (int i = 0; i < data.length - 1; i++) {
            int smallest = i; //primeiro indice do array remanescente

            //faz um loop para localizar o indice do menor elemento
            for (int index = i + 1; index < data.length; index++) {
                if (data[index] < data[smallest]) {
                    smallest = index;
                }
            }

            swap(data, i, smallest); //troca o menor elemento na posicao
            printPass(data, i + 1, smallest); //passagem de saida do algoritmo
        }
    } // fim metodo selectionSort

    //metodo auxiliar para trocar valores em dois elementos
    private static void swap(int[] data, int first, int second) {
        int temporary = data[first]; //armazena o primeiro em temporario
        data[first] = data[second]; //substitui o primeiro pelo segundo
        data[second] = temporary; //coloca o temporario no segundo
    }

    //imprime uma passagem pelo algoritmo
    private static void printPass(int[] data, int pass, int index) {
        System.out.printf("after pass %2d: ", pass);

        //saida de elementos ate item selecionado
        for (int i = 0; i < index; i++) {
            System.out.printf("%d ", data[i]);

        }

        System.out.printf("%d* ", data[index]); //indica elemento que será trocado        

        //termina de gerar a saida do array
        for (int i = index + 1; i < data.length; i++) {
            System.out.printf("%d ", data[i]);
        }

        System.out.printf("%n            "); //para alinhamento

        //indica a quantidade do array que é classificado
        for (int j = 0; j < pass; j++) {
            System.out.print("-- ");

        }
        System.out.println();

    }

    public static void main(String[] args) {
        SecureRandom generator = new SecureRandom();

        int[] data = new int[10]; // cria o array

        for (int i = 0; i < data.length; i++) //preenche o array
        {
            data[i] = 10 + generator.nextInt(90);
        }

        System.out.printf("Unsorted array: %n%s%n%n", Arrays.toString(data)); //exibe o array
        selectionSort(data); //classifica o array

        System.out.printf("Sorted array: %n%s%n%n", Arrays.toString(data));// //exibe o array
    }
}
