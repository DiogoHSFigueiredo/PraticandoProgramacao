/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap1;

//Classe recebe dois inteiros e determina se o primeiro � m�ltiplo do segundo.

import java.util.Scanner;


/**
 *
 * @author Diogo
 */
public class Multiplus {
    
    public static void main(String[] args) {
        
        //Vari�veis 
        int n1;
        int n2;
              
        
        //cria objeto scanner para captar a entrada do teclado
        Scanner tec = new Scanner(System.in);
        
        
        //Recebe as entradas do usu�rio
        System.out.println("Digite o primeiro inteiro");
        n1 = tec.nextInt();
        
        System.out.println("Digite o segundo inteiro");
        n2 = tec.nextInt();
        
        if (n1%n2 == 0) {
            System.out.println("O segundo n�mero � m�ltiplo do primeiro");
        }
        if (n2%n1 == 0) {
            System.out.println("O primeiro n�mero � m�ltiplo do segundo");
        }
        
    }
    
    
    
}
