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
public class EquivalenteDecimal {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        System.out.println("Digite um numero binario de 5 digitos");
        int numero = tec.nextInt();
        int n1, n2, n3, n4, n5, vlBinario;

        n5 = (numero % 10); // valor binario da posicao 1
        n4 = ((numero / 10) % 10); //valor binario da posicao 2
        n3 = (((numero / 10) / 10) % 10); //valor binario da posicao8
        n2 = ((((numero / 10) / 10) / 10) % 10); //valor binario da posicao 16
        n1 = (((((numero / 10) / 10) / 10) / 10) % 10); //valor binario da posicao 32

        vlBinario = (1 * n5 + 2 * n4 + 4 * n3 + 8 * n2 + 16 * n1);
        System.out.println(vlBinario);
    }
}
