/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap14;

/**
 *
 * @author Diogo
 */
public class StringBuilderInsertDelete {

    public static void main(String[] args) {

        Object objectRef = "hello";
        String string = "goodbye";
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean booleanV = true;
        char characterV = 'Z';
        int integerV = 7;
        long longV = 10000000L;
        float floatV = 2.5f;
        double doubleV = 33.333;

        StringBuilder buffer = new StringBuilder();

        buffer.insert(0, objectRef);
        buffer.insert(0, " "); //cada um desses contem dois espacos
        buffer.insert(0, string);
        buffer.insert(0, " ");
        buffer.insert(0, charArray);
        buffer.insert(0, " ");
        buffer.insert(0, charArray, 3, 3);
        buffer.insert(0, " ");
        buffer.insert(0, booleanV);
        buffer.insert(0, " ");
        buffer.insert(0, characterV);
        buffer.insert(0, " ");
        buffer.insert(0, integerV);
        buffer.insert(0, " ");
        buffer.insert(0, longV);
        buffer.insert(0, " ");
        buffer.insert(0, floatV);
        buffer.insert(0, " ");
        buffer.insert(0, doubleV);

        System.out.printf("buffer after inserts:%n%s%n%n", buffer.toString());
        buffer.deleteCharAt(9); //Exclui 5 em 2.5
        buffer.delete(2, 6); //exclui .333 em 33.333
        System.out.printf("buffer after deletes:%n%s%n", buffer.toString());
    }
}
