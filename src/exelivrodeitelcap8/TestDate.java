/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap8;

/**
 *
 * @author Diogo
 */
public class TestDate {
    
    public static void main(String[] args) {
        Date data = new Date(12, 31, 2000);
        data.nextDay();
        System.out.println(data);
        data.nextDay();
        System.out.println(data);
        data.nextDay();
        System.out.println(data);
        
    }
}
