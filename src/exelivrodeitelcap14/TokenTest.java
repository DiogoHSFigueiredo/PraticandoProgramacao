/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap14;

import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class TokenTest {
    
    public static void main(String[] args) {
       
        //obtem a frase
        Scanner tec = new Scanner(System.in);
        System.out.println("Enter asentence and press Enter");
        String sentence = tec.nextLine();
        
        //processa a frase
        String[] tokens = sentence.split(" "); //o espaco no argumento de split serve como parámetro para identificar/separar os tokens "a cada 'espaco' um token".
        System.out.printf("Number of elements: %d%nThe tokens are:%n", tokens.length);
        
        for(String token : tokens){
            System.out.println(token);
        }
        
        
        
    }
}
