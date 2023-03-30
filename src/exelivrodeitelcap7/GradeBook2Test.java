/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap7;

/**
 *
 * @author Diogo
 */
public class GradeBook2Test {

    public static void main(String[] args) {

        int[][] gradesArray = {{87, 96, 70}, {68, 87, 90}, {94, 100, 90}, {100, 81, 82}, {83, 65, 85}, {78, 87, 65}, {85, 75, 83}, {91, 94, 100}, {76, 72, 84}, {87, 93, 73}};

        GradeBook2 myGradeBook = new GradeBook2("Cs101 Introduction to Java Programming", gradesArray);
        System.out.printf("Welcome to te grade book for%n%s%n%n", myGradeBook.getCourseName());
        myGradeBook.processGrades();

    }

}
