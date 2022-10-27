/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap8;

/**
 *
 * @author Diogo
 */
public class TestSavingAccount {

    public static void main(String[] args) {
        SavingAccount saver1 = new SavingAccount(2.000, 15.0);
        SavingAccount saver2 = new SavingAccount(3.000, 15.0);

        for (int i = 0; i < 5; i++) {
            System.out.println("Mes " + (i + 1) + " Conta 1 \nValor Inicial = " + (String.format("%.3f", saver1.getValorSaldo())));
            System.out.println(String.format("Valor final = %.3f", saver1.calcJurosMensal()));
            System.out.println("");
            System.out.println("Mes " + (i + 1) + " Conta 2 \nValor Inicial = " + (String.format("%.3f", saver2.getValorSaldo())));
            System.out.println(String.format("Valor final = %.3f", saver2.calcJurosMensal()));
            System.out.println("-------------");

        }


    }

}
