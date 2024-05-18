/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap20;
//Somando os numeros em uma ArrayList<Number>

import java.util.ArrayList;

/**
 *
 * @author Diogo
 */
public class TotalNumbers {

    public static void main(String[] args) {

        //cria, inicializa e gera saida de ArrayList de numeros contendo
        //integers e doubles, e entao exibe o total dos elementos
        Number[] numbers = {1, 2.4, 3, 4.1}; //integers e doubles
        ArrayList<Number> numberList = new ArrayList<>();

        for (Number element : numbers) {
            numberList.add(element); //insere cada numero na numberlist
        }
        System.out.printf("numberList contains: %s%n", numberList);
        System.out.printf("Total of the elements in numberList: %.1f%n", sum(numberList));
    }

    //calcula o total de elementos em ArrayList
    public static double sum(ArrayList<Number> list) {

        double total = 0; //inicializa o total

        //calcula a soma
        for (Number element : list) {
            total += element.doubleValue();
        }
        return total;
    }

}//fim da classe Total Numbers
