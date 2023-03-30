/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Programa que receberá uma entrada do usuário com 3 números e realizara o calculo e retornará o maior numero, o menor número, o produto deles bem como a parte inteira da média ddeles.
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

        //declara as variáveis
        int n1;
        int n2;
        int n3;
        int soma;
        int media;
        int produto;
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;

        //cria objeto teclado para captar a entrada do usuário
        Scanner tec = new Scanner(System.in);

        //Entradas do usuário
        System.out.println("Digite o primeiro numero inteiro");
        n1 = tec.nextInt();

        System.out.println("Digite o segundo numero inteiro");
        n2 = tec.nextInt();

        System.out.println("Digite o terceiro numero inteiro");
        n3 = tec.nextInt();

        // Atribui a variável menor o menor número digitado.
        if (menor > n1) {
            menor = n1;
        }
        if (menor > n2) {
            menor = n2;
        }
        if (menor > n3) {
            menor = n3;
        }

        //Atribui a variável o maior número digitado.
        if (maior < n1) {
            maior = n1;
        }
        if (maior < n2) {
            maior = n2;
        }
        if (maior < n3) {
            maior = n3;
        }

        //Realiza a média dos números
        media = (n1 + n2 + n3) / 3;

        //Realiza o produto dos números
        produto = n1 * n2 * n3;

        System.out.println("O menor número é: " + menor);
        System.out.println("O maior número é: " + maior);
        System.out.println("A média dos números é:" + media);
        System.out.println("O produto dos números é: " + produto);
    }

}
