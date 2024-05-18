/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap20;

/**
 *
 * @author Diogo
 */
public class GenericMethodTest {

    public static void main(String[] args) {

        //cria arrays de Integer, Double e Character
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.printf("Array integerArray contains:%n");
        printArray(integerArray); //passa um array de Integer

        System.out.printf("%nArray doubleArray contains:%n");
        printArray(doubleArray); //passa um array de Double

        System.out.printf("%nArray characterArray contains:%n");
        printArray(characterArray); //passa um array de Character

    }

    //metodo generico printArray
    public static <T> void printArray(T[] inputArray) {

        //exibe elementos do array
        for (T element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
} //fim da classe GenericMethodTest
