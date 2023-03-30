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
public class QuilometragemCombustivel {

    public static void main(String[] args) {

        int kmRodado = 0;
        int qtdLitroViagem = 0;
        int kmGlobal = 0;
        int qtdLitroGlobal = 0;
        double mediaAtual = 0;
        double mediaGlobal = 0;
        int p = 1;

        Scanner tec = new Scanner(System.in);

        while (p == 1) {
            System.out.println("Digite a kilometragem rodada");
            kmRodado = tec.nextInt();

            System.out.println("Digite a quantidade de gasolina cosumida");
            qtdLitroViagem = tec.nextInt();

            mediaAtual = (double) kmRodado / qtdLitroViagem;
            System.out.printf("O consumo medio na viagem foi: %.2f KM/L\n", mediaAtual);

            kmGlobal += kmRodado;
            qtdLitroGlobal += qtdLitroViagem;

            System.out.println("Digite: \n1 - Continuar\n2 - Sair");
            p = tec.nextInt();

        }
        mediaGlobal = (double) kmGlobal / qtdLitroGlobal;
        System.out.printf("%s%d\n%s%d\n%s%.2f\n", "Kilometragem total rodada: ", kmGlobal, "Quantidade total de litros de combustivel utilizado: ", qtdLitroGlobal, "Media de consumo global: ", mediaGlobal);
    }

}
