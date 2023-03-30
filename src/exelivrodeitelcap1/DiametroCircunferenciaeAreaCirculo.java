/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap1;
//Classe para receber o raio de um circulo em inteiro e determinar seu diametro, circunferencia e area.

import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class DiametroCircunferenciaeAreaCirculo {

    public static void main(String[] args) {

        //variaveis
        float diametro;
        float circunferencia;
        float area;
        int raio;

        //cria objeto scanner para captar entrada do usuario
        Scanner tec = new Scanner(System.in);

        //pede entrada do raio em valor inteiro ao usuario
        System.out.println("Digite o raio de um circulo em valor inteiro para que seja calculado sua area, circunferencia e diamentro");
        raio = tec.nextInt();

        diametro = 2 * raio;
        circunferencia = (float) (2 * Math.PI * raio);
        area = (float) (Math.PI * (raio * raio));

        System.out.printf("%s %f", "O Diametro do circulo é ", diametro);
        System.out.printf("\n%s %f", "A Circunferência do circulo é ", circunferencia);
        System.out.printf("\n%s %f", "A Area do circulo é ", area);
    }

}
