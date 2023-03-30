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
    

    //Método principal
    public static void main(String[] args) {
       
        //Cria objeto Scanner para utilização
        Scanner input = new Scanner(System.in);
        
        //Declara variáveis para utilização
        int number1; //Receberá o primeiro número do usuário
        int number2; //Receberá o 2 número do usuário
        int sum; //Receberá a soma dos 2 números
        
        System.out.print("Enter first integer: ");
        number1 = input.nextInt(); //Lê o primeiro número digitado e armazena na primeira variável
        
        System.out.print("Enter second integer: ");
        number2 = input.nextInt(); //Lê o segundo número digitado  e armazena na segunda variável
        
        sum = number1 + number2; // soma os números, depois armazena o total em sum
        
        System.out.printf("Sum is \t%d%nCONGRATULATIONS\n", sum); // exibe a soma
        
    }// fim de main
    
} // fim da classe
