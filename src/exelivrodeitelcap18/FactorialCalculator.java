/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap18;

/**
 *
 * @author Diogo
 */
public class FactorialCalculator {

    //metodo fatorial recursivo (supoe que o parametro e >= 0)
    public static long factorial(long number) {

        if (number <= 1) //testa caso básico
        {
            return 1; //casos basicos: 0! = 1 e 1! = 1
        } else //passo de recursao
        {
            return number * factorial(number - 1);
        }
    }

    //gera saida de fatoriais para valores de 0 a 21
    public static void main(String[] args) {

        //calcula o fatorial ded 0 a 21
        for (int counter = 0; counter <= 21; counter++) {
            System.out.printf("%d! = %d%n", counter, factorial(counter));
        }
    }
}// fim da classe
