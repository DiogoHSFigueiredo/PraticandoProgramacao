package exelivrodeitelcap4;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Diogo
 */
public class Exe421E423 {

    public static void main(String[] args) {

        double num = 0;
        double maior = 0;
        double maior2 = 0;
        int cont = 1;
        Scanner tec = new Scanner(System.in);

        while (cont <= 10) {
            System.out.println("Digite o valor das vendas");
            num = tec.nextDouble();

            if (maior2 == 0) {
                maior2 = num;
            }
            if (maior2 < num && maior2 != maior) {
                maior2 = num;
            }
            if (num > maior) {
                maior = num;
            }
            cont++;
        }

        System.out.println("O maior numero e: " + maior);
        System.out.println("O segundo maior numero e: " + maior2);
    }
}
