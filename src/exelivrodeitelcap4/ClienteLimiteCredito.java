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
public class ClienteLimiteCredito {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        String nomeConta;
        int numConta;
        double saldoMes;
        double totalFatura;
        double totalCreditos;
        double limiteTotal;
        double saldoAtual;

        System.out.println("Digite o nome da Conta: ");
        nomeConta = tec.nextLine();

        System.out.println("Digite o numero da conta: ");
        numConta = tec.nextInt();

        System.out.println("Digite o limite do Mes: ");
        saldoMes = tec.nextDouble();

        System.out.println("Digite o total da fatura: ");
        totalFatura = tec.nextDouble();

        System.out.println("Digite o total de creditos: ");
        totalCreditos = tec.nextDouble();

        limiteTotal = saldoMes + totalCreditos;
        saldoAtual = limiteTotal - totalFatura;

        if (totalFatura > limiteTotal) {
            System.out.println("Voce excedeu seu limite de: " + (saldoMes + totalCreditos) + " seu limite atual e: -" + saldoAtual);
        } else {
            System.out.println("Parabens pela sua compra, seu limite atual e: " + saldoAtual);
        }
    }
}
