/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap3;
//classe driver para Classe Account

import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class AccountTest {

    public static void main(String[] args) {

        //cria objeto scanner para captar entrada do usuario
        Scanner tec = new Scanner(System.in);

        //cria um objeto account passando argumento nome p o construtor c/ paramentros
        Account myAccount = new Account("PrimeiraConta", -400.0);

        //cria um objeto account sem nenhum argumento, utilizando o construtor vazio
        Account myAccount2 = new Account();

        //exibe o valor inicial do nome
        displayAccount(myAccount);
        displayAccount(myAccount2);

        //solicita e lê o nome
        System.out.println("Please enter the name for this account2");
        String theName = tec.nextLine();
        myAccount2.setName(theName);
        System.out.println();

        //Altera o balanco inicial
        myAccount.deposit(150.0);
        myAccount2.deposit(50.0);

        //exibe o nome escolhido pelo usuario
        displayAccount(myAccount);
        displayAccount(myAccount2);;

        System.out.println("\nVamos realizar saque da conta 1\nDigite o valor desejado");
        int valor = tec.nextInt();
        myAccount.withDraw(myAccount, valor);

    }

    public static void displayAccount(Account accountToDisplay) {
        String nome = accountToDisplay.getName();
        double balance = accountToDisplay.getBalance();
        System.out.println("Conta: " + nome + "\nSaldo: " + balance);
    }

} // end the class
