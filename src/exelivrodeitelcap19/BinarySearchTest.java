package exelivrodeitelcap19;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Diogo
 */
//Utiliza a pesquisa binaria para localizar um item em um Array.
public class BinarySearchTest {

    //realiza uma pesquisa binária sobre os dados
    public static int binarySearch(int[] data, int key) {

        int low = 0; //extremidade baixa da area de pesquisa
        int high = data.length - 1; //extremidade alta da area de pesquisa
        int middle = (low + high + 1) / 2; //elemento do meio
        int location = -1; //valor de retorno; -1 se nao localizado

        do //faz um loop para procurar o elemento
        {
            //imprime os elementos remanescentes do array
            System.out.print(remainingElements(data, low, high));

            //gera espacos para alinhamento
            for (int i = 0; i < middle; i++) {
                System.out.print("   ");
            }
            System.out.println(" * "); //indica o meio atual

            //se o elemento for localizado no meio
            if (key == data[middle]) {
                location = middle; //a localizacao é o meio atual
            } else if (key < data[middle]) { //elemento do meio é muito alto
                high = middle - 1; // elimina a metade mais baixa
            } else { //elemento do meio e muito baixo
                low = middle + 1; //elimina a metade mais alta
            }

            middle = (low + high + 1) / 2; //recalcula o meio
        } while ((low <= high) && (location == -1));
        return location; //retorna a localizacao da chave de pesquisa
    } // fim do metodo binarySearch

    //metodo para gerar saida de certos valores no array
    private static String remainingElements(int[] data, int low, int high) {
        StringBuilder temporary = new StringBuilder();

        //acrescenta espacos para alinhamento
        for (int i = 0; i < low; i++) {
            temporary.append("   ");
        }

        //gera a saida dos elementos que permanecem no array
        for (int i = low; i <= high; i++) {
            temporary.append(data[i] + " ");
        }
        return String.format("%s%n", temporary);
    }// fim do metodo remainingElements

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        SecureRandom generator = new SecureRandom();

        int[] data = new int[15]; //cria o array

        for (int i = 0; i < data.length; i++) //preenche o array
        {
            data[i] = 10 + generator.nextInt(90);
        }

        Arrays.sort(data); //binarySearch requer array classificado
        System.out.printf("%s%n%n", Arrays.toString(data)); //exibe o array

        //obtem a entrada de usuario
        System.out.print("Please enter an integer value (-1 to quit): ");
        int searchInt = input.nextInt();
        //insere repetidamente um inteiro; -1 termina o programa
        while (searchInt != -1) {

            //realiza a pesquisa
            int location = binarySearch(data, searchInt);

            if (location == -1) //nao encontrado
            {
                System.out.printf("%d was not found%n%n", searchInt);
            } else { //encontrado
                System.out.printf("%d was found in position %d%n%n", searchInt, location);
            }

            //obtem a entrada de usuario
            System.out.print("Please enter an integer value (-1 to quit): ");
            searchInt = input.nextInt();
        }
    } // fim de main
} //fim da classe BinarySearchTest
