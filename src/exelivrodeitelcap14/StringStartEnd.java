/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap14;

/**
 *
 * @author Diogo
 */
public class StringStartEnd {
    
    public static void main(String[] args) {
       
        String[] strings = {"started", "starting", "ended", "ending"};
        
        //testa o metodo startWish
        for(String string : strings){
            if(string.startsWith("st")){
                System.out.printf("\"%s\" starts with \"st\"%n", string);
            }
        }
        System.out.println();
        
        //testa o metodo startWith iniciando na posicao 2 de string
        for(String string : strings){
            if(string.startsWith("art",2)){
                System.out.printf("\"%s\" starts with\"art\" at position 2%n", string);
            }
        }
        System.out.println();
        
        //testa o metodo endsWith
        for(String string:strings){
            if(string.endsWith("ed")){
                System.out.printf("\"%s\" ends with \"ed\"%n", string);
            }
        }
    }
    
}
