/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap18;

import java.math.BigInteger;

/**
 *
 * @author Diogo
 */
public class FactorialCalculatorBig {

    //metodo fatorial recursivo (supoe que o parametro e >=0)
    public static BigInteger factorial(BigInteger number) {
        if (number.compareTo(BigInteger.ONE) <= 0) //caso basico de teste
        {
            return BigInteger.ONE; //casos basicos: 0! = 1 e 1! = 1
        } else // passo de recursao
        {
            return number.multiply(factorial(number.subtract(BigInteger.ONE)));
        }
    }

    //gera saida de fatoriais para valores de 0 a 50
    public static void main(String[] args) {
        //calcula o fatorial de 0 a 50
        for (int counter = 0; counter <= 50; counter++) {
            System.out.printf("%d! = %d%n", counter, factorial(BigInteger.valueOf(counter)));
        }
    }
}
