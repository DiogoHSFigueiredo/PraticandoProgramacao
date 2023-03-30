/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap3;

import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class DateTest {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        Date data1 = new Date(02, 02, 2023);
        System.out.println(data1.displayDate(data1)+"\n");

        System.out.println("Digite o dia");
        int dia = tec.nextInt();
        System.out.println("Digite o mes");
        int mes = tec.nextInt();
        System.out.println("Digite o ano");
        int ano = tec.nextInt();

        Date data2 = new Date(dia, mes, ano);
        System.out.println("\n"+data2.displayDate(data2));
    }

}
