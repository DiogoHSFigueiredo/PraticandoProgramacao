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
public class exe620 {

    public static void main(String[] args) {
        System.out.println("Vamos calcular a area do circulo");
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o valor do raio");
        int raio = tec.nextInt();
        System.out.printf("%s%.2f%n", "A area do circulo e: ", circleArea(raio));
    }

    public static double circleArea(double raio) {
        double circleArea;

        circleArea = Math.PI * Math.pow(raio, 2);

        return circleArea;
    }
}
