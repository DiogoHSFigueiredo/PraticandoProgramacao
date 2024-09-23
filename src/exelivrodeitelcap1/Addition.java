/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap1;

import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class Addition {

    //M�todo principal
    public static void main(String[] args) {

        //Cria objeto Scanner para utiliza��o
        Scanner input = new Scanner(System.in);

        //Declara vari�veis para utiliza��o
        int number1; //Receber� o primeiro n�mero do usu�rio
        int number2; //Receber� o 2 n�mero do usu�rio
        int number3;
        int number4;
        int number5;

        int sum; //Receber� a soma dos 2 n�meros

        System.out.print("Enter first integer: ");
        number1 = input.nextInt(); //L� o primeiro n�mero digitado e armazena na primeira vari�vel

        System.out.print("Enter second integer: ");
        number2 = input.nextInt(); //L� o segundo n�mero digitado  e armazena na segunda vari�vel

        System.out.println("Enter third integer");
        number3 = input.nextInt();

        System.out.println("Enter fourth integer");
        number4 = input.nextInt();

        System.out.println("Enter fifth integer");
        number5 = input.nextInt();

        sum = number1 + number2 + number3 + number4 + number5; // soma os n�meros, depois armazena o total em sum

        System.out.printf("Sum is \t%d%nCONGRATULATIONS\n", sum); // exibe a soma

    }// fim de main

} // fim da classe
