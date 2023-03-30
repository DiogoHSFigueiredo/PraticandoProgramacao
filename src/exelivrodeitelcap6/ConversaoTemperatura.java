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
public class ConversaoTemperatura {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("\t\tOla \nCalculadora de conversao de temperatura\nDigite 1 - Celsius => Fahrenheit\nDigite 2 - Fahrenheit = > Celsius");
        int opcao = tec.nextInt();
        System.out.println("Digite agora a temperatura para conversao");
        double temperatura = tec.nextDouble();

        if (opcao == 1) {
            System.out.println("A temperatura digita em Celsius e: " + temperatura + " convertida para Fahrenheit e: " + String.format("%.3f", celsiusToF(temperatura)));

        } else if (opcao == 2) {
            System.out.println("A temperatura digita em Fahrenheit e: " + temperatura + " convertida para Celsius e: " + String.format("%.3f", fahrenheitToC(temperatura)));
        } else {
            System.out.println("Voce nao digitou uma opcao valida");
        }

    }

    public static double celsiusToF(double celsius) {
        double temp;

        temp = (9.0 / 5.0) * celsius + 32;

        return temp;
    }

    public static double fahrenheitToC(double fahrenheit) {
        double temp;

        temp = 5.0 / 9.0 * (fahrenheit - 32);
        return temp;
    }
}
