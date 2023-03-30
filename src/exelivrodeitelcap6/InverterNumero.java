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
public class InverterNumero {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Vamos inverter um inteiro. \nDigite o numero para ser invertido");
        int numeroD = tec.nextInt();
        System.out.printf("%s%d\n", " Numero Digitado e: ", numeroD);
        System.out.println("Numero Invertido e: " + inverterNum(numeroD));

    }

    public static String inverterNum(int numero) {
        int invertido;
        int ultimoNum;
        String num = "";
        boolean x = true;

        while (x) {

            ultimoNum = numero % 10;
            numero = numero / 10;

            if (ultimoNum == 0 && numero < 1) {
                x = false;
                break;
            }
            num += ultimoNum;
        }

        return num;
    }

}
