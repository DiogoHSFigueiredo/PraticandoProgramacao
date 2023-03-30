/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap6;

import java.security.SecureRandom;

/**
 *
 * @author Diogo
 */
public class Exe613 {

    public static void main(String[] args) {

        SecureRandom numero = new SecureRandom();

        // 1<= n <=2
        int n = 2 + 2 * numero.nextInt(5);

        //1<= n <=100
        int o = 3 + 2 * numero.nextInt(5);

        //1000 <= n <=1112
        int p = 6 + 4 * numero.nextInt(5);

        System.out.println(n);
        System.out.println(o);
        System.out.println(p);
    }

}
