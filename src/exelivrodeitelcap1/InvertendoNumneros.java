/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap1;
//classe recebe um numero inteiro de 5 diitos e os imprime em uma mesma linha com espacamento de 3 casas

import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class InvertendoNumneros {

    public static void main(String[] args) {

        //Variaveis
        int n1, n2, n3, n4, n5, numero;

        Scanner tec = new Scanner(System.in);

        //Solicita ao usu�rio a entrada do n�mero
        System.out.println("Digite um numero inteiro de cinco algarismos");

        //capta��o do n�mero digitado
        numero = tec.nextInt();

        n5 = (numero % 10); //recebe o �ltimo digito
        n4 = ((numero / 10) % 10); //recebe o 4 digito
        n3 = ((numero / 100) % 10); // recebe o 3 digito
        n2 = ((numero / 1000 % 10)); // recebe o 2 digito
        n1 = ((numero / 10000) % 10); // recebe o 1 digito

        //realiza a saida dos n�meros digitados com espa�amento.
        System.out.println(n5 + "   " + n4 + "   " + n3 + "   " + n2 + "   " + n1);

    }

}
