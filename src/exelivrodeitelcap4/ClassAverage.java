/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap4;

import java.util.Scanner;

/**
 *
 * @author Diogo
 */
//programa para calcular a media de notas da classe
public class ClassAverage {

    public static void main(String[] args) {

        //cria objeto scanner
        Scanner tec = new Scanner(System.in);

        //variaveis
        int total = 0;
        int gradeCounter = 0;
        int grade = 0;

        System.out.println("Enter grade or -1 to quit:");
        grade = tec.nextInt();
        while (grade != -1) {

            total += grade;
            gradeCounter++;
            System.out.println("Enter grade or -1 to quit:");
            grade = tec.nextInt();
        }

        if (grade != 0) {
            double average = (double) total / gradeCounter;
            System.out.printf("%nTotal of the %d grades entered is %d%n", gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
        } else {
            System.out.println("No grades were entered");
        }
    }

}
