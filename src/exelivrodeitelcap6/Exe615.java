/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap6;

import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class Exe615 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.println("Ola, vamos calcular a hipotenusa de um triangulo retangulo");
        System.out.println("Digite o valor do 1 cateto");
        int c1 = tec.nextInt();
        System.out.println("Digite o valor do 2 cateto");
        int c2 = tec.nextInt();
        System.out.printf("%s%.3f\n", "O valor da hypotenusa e: ", (double) hypotenuse(c1, c2));

    }

    public static double hypotenuse(double s1, double s2) {
        double vlhypotenuse = (Math.pow(s1, 2.0) + Math.pow(s2, 2.0));

        vlhypotenuse = Math.sqrt(vlhypotenuse);

        return vlhypotenuse;

    }

}
