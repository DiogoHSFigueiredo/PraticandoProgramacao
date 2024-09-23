/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcapE;

/**
 *
 * @author Diogo
 */
public class AccountTestE {

    //metodo main inicia a execucao
    public static void main(String[] args) {
        AccountE account = new AccountE("Jane Green", 50.00);

        //exive o saldo inicial do objeto Account
        System.out.printf("initial account balance: $%.2f%n", account.getBalance());

        double depositAmount = 25.0; //deposita uma quantia

        System.out.printf("%nadding %.2f to account balance%n%n", depositAmount);
        account.deposit(depositAmount); //adiciona ao saldo da conta

        //exibe um novo saldo
        System.out.printf("new account balance: $%.2f%n", account.getBalance());
    }

}
