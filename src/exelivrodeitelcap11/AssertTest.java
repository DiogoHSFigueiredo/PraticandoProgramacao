/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap11;

import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class AssertTest {
    
    public static void main(String[] args) {
       Scanner tec = new Scanner(System.in);
       
       System.out.print("Enter a number between 0 and 10: ");
       int number = tec.nextInt();
       
       //afirma que o valor � >= 0 e <=10
       
       
       //necessário ativar no prompt do java comando "java -ea AssertTest"
       assert(number <= 10) : "bad number: "+number;
       
       System.out.printf("You entered %d%n", number);
    }
    
} // fim da classe
