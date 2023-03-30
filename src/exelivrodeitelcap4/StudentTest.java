/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap4;

/**
 *
 * @author Diogo
 */
public class StudentTest {
    
    public static void main(String[] args) {
       
        Student a1 = new Student("Barto", 93.5);
        Student a2 = new Student("Barin", 72.75);
        
        System.out.printf("%s's letter grade is: %s%n", a1.getName(), a1.getLetterGrade());
        System.out.printf("%s's letter grade is: %s%n", a2.getName(), a2.getLetterGrade());
    }
}
