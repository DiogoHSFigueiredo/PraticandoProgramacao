/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap6;

import java.util.Scanner;

/**
 * @author Diogo0
 */
public class MaximumFinder {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.print("Enter three floating-point values separated by spaces: ");
        double number1 = tec.nextDouble();
        double number2 = tec.nextDouble();
        double number3 = tec.nextDouble();

        double result = maximum(number1, number2, number3);

        System.out.println("Maximum is: " + result);

    }

    public static double maximum(double x, double y, double z) {

        return Math.max(x, Math.max(x, y));
    }

}
