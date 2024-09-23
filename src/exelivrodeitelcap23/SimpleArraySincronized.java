/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap23;

import java.security.SecureRandom;
import java.util.Arrays;

/**
 *
 * @author Diogo
 */
public class SimpleArraySincronized {

    private static final SecureRandom generator = new SecureRandom();
    private final int[] array; //array de inteiros compartilhado
    private int writeIndex = 0; //indice de proximo elemento a ser gravado

    //cria um SImpleArray de um determinado tamanho
    public SimpleArraySincronized(int size) {
        array = new int[size];
    }

    //adiciona um valor ao array compartilhado
    public synchronized void add(int value) {
            
        int position = writeIndex; //armazena o indice de gravacao

        try {
            //em aplicativos reais, nao se deve dormir enquanto se mantem um bloqueio
            Thread.sleep(generator.nextInt(500)); //apenas para demonstracao
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        //coloca o valor no elemento apropriado
        array[position] = value;
        System.out.printf("%s wrote %2d to element %d.%n", Thread.currentThread().getName(), value, position);

        ++writeIndex; //incrementa indice de elemento a ser gravado depois
        System.out.printf("Next write index: %d%n", writeIndex);
    }

    //usado para gerar o conteudo do array de inteiros compartilhado
    public synchronized String toString() {
        return Arrays.toString(array);
    }
} //fim da classe SimpleArray
