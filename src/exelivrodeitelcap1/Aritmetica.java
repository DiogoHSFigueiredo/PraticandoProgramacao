/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Programa que receber� uma entrada do usu�rio com 3 n�meros e realizara o calculo e retornar� o maior numero, o menor n�mero, o produto deles bem como a parte inteira da m�dia ddeles.
package exelivrodeitelcap1;

import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class Aritmetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //declara as vari�veis
        int n1;
        int n2;
        int n3;
        int soma;
        int media;
        int produto;
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;

        //cria objeto teclado para captar a entrada do usu�rio
        Scanner tec = new Scanner(System.in);

        //Entradas do usu�rio
        System.out.println("Digite o primeiro numero inteiro");
        n1 = tec.nextInt();

        System.out.println("Digite o segundo numero inteiro");
        n2 = tec.nextInt();

        System.out.println("Digite o terceiro numero inteiro");
        n3 = tec.nextInt();

        // Atribui a vari�vel menor o menor n�mero digitado.
        if (menor > n1) {
            menor = n1;
        }
        if (menor > n2) {
            menor = n2;
        }
        if (menor > n3) {
            menor = n3;
        }

        //Atribui a vari�vel o maior n�mero digitado.
        if (maior < n1) {
            maior = n1;
        }
        if (maior < n2) {
            maior = n2;
        }
        if (maior < n3) {
            maior = n3;
        }

        //Realiza a m�dia dos n�meros
        media = (n1 + n2 + n3) / 3;

        //Realiza o produto dos n�meros
        produto = n1 * n2 * n3;

        System.out.println("O menor n�mero �: " + menor);
        System.out.println("O maior n�mero �: " + maior);
        System.out.println("A m�dia dos n�meros �:" + media);
        System.out.println("O produto dos n�meros �: " + produto);
    }

}
