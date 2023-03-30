/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap4;

/**
 *
 * @author Diogo
 */
public class Mystery3 {

    public static void main(String[] args) {
        int row = 10;
        while (row >= 1) {
            int column = 1;
            while (column <= 10) {
                System.out.print(row % 2 == 1 ? "<" : ">");
                ++column;
            }
            --row;
            System.out.println();
        }
    }

}
