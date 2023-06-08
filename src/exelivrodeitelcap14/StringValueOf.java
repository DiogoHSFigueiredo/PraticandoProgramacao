/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap14;

/**
 *
 * @author Diogo
 */
public class StringValueOf {
    
    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean booleanValue = true;
        char characterValue = 'Z';
        int integerValue = 7;
        long longValue = 10000000000L; //sufixo L indica tipo long
        float floatValue = 2.5F; // F indica que 2.5 e um tipo float
        double doubleValue = 33.333; //sem sufixo, tipo double é padrão
        Object objectRef = "hello"; //atribui string a uma referencia Object
        
        System.out.printf("char array = %s%n", String.valueOf(charArray));
        System.out.printf("part of char array = %s%n", String.valueOf(charArray, 3, 3));
        System.out.printf("boolean = %s%n", String.valueOf(booleanValue));
        System.out.printf("char = %s%n", String.valueOf(characterValue));
        System.out.printf("int = %s%n", String.valueOf(integerValue));
        System.out.printf("long = %s%n", String.valueOf(longValue));
        System.out.printf("float = %s%n", String.valueOf(floatValue));
        System.out.printf("Object = %s%n", String.valueOf(objectRef));
        
       
    }
    
}
