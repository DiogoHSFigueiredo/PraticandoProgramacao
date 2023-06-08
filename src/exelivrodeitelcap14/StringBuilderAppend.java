/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap14;

/**
 *
 * @author Diogo
 */
public class StringBuilderAppend {
    
    public static void main(String[] args) {
       
        Object objectRef = "hello";
        String string = "goodbye";
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean booleanV = true;
        char characterV = 'Z';
        int integerV = 7;
        long longV = 10000000000L;
        float floatV = 2.5F;
        double doubleV = 33.333;
        
        StringBuilder lastBuffer = new StringBuilder("last buffer");
        StringBuilder buffer = new StringBuilder();
        
        buffer.append(objectRef).append("\n").append(string).append("\n").append(charArray).append("\n").append(charArray, 0, 3).append("\n").append(booleanV).append("\n").append(characterV).append("\n").append(integerV).append("\n").append(longV).append("\n").append(floatV).append("\n").append(doubleV).append("\n").append(lastBuffer);
        
        System.out.printf("buffer contais %n%s%n", buffer.toString());
               
    }
}
