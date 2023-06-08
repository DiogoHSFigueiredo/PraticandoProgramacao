/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap14;

/**
 *
 * @author Diogo
 */
public class StringBuilderCaplen {

    public static void main(String[] args) {

        StringBuilder buffer = new StringBuilder("Hello, how are you?");

        System.out.printf("buffer = %s%nlength = %d%ncapacity = %d%n%n", buffer.toString(), buffer.length(), buffer.capacity());

        buffer.ensureCapacity(75);
        System.out.printf("New capacity = %d%n%n", buffer.capacity());

        buffer.setLength(10);
        System.out.printf("New length = %d%nbuffer = %s%n", buffer.length(), buffer.toString());

    }

}
