/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap8;

/**
 *
 * @author Diogo
 */
public class TesteDateAndTime {

    public static void main(String[] args) {

        DateAndTime t1 = new DateAndTime();
        System.out.println("Imprimindo T1 " + t1 + " || T1 a partir do universal String " + t1.toUniversalString());
        DateAndTime t2 = new DateAndTime(23, 12, 55, 12, 31, 2020);
        System.out.println("Imprimindo T2 " + t2 + " || T1 a partir do universal String " + t2.toUniversalString());
        t2.incrementHour(t2);
        System.out.println("Imprimindo T2 apos incremento de horas " + t2 + " || T1 a partir do universal String " + t2.toUniversalString());

    }

}
