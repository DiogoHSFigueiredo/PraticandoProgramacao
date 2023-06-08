/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap14;

/**
 *
 * @author Diogo
 */
public class OtherCharMethods {

    public static void main(String[] args) {

        Character c1 = 'B';
        Character c2 = 'b';

        System.out.printf("c1 = %s%nc2 = %s%n%n", c1.charValue(), c2.toString());

        if (c1.equals(c2)) {
            System.out.println("c1 and c2 are equals");
        } else {
            System.out.println("c1 and c2 are not equals");
        }

    }

}
