/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap15;

import java.io.Serializable;

/**
 *
 * @author Diogo
 */
public class Account implements Serializable {

    private int account;
    private String firstName;
    private String lastName;
    private double balance;

    //inicializa uma account com valores padrao
    public Account() {

        this(0, "", "", 0.0); //chama outro construtor
    }

    public Account(int account, String firstName, String lastName, double balance) {
        this.account = account;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    //configura o numero de conta
    public void setAccount(int acct) {
        this.account = acct;
    }

    //obtem numero de conta
    public int getAccount() {
        return account;
    }

    //configura o nome
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //obtem o nome
    public String getFirstName() {
        return firstName;
    }

    //configura o sobrenome
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //obtem o sobrenome
    public String getLastName() {
        return lastName;
    }

    //configura o saldo
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //obtem  saldo
    public double getBalance() {
        return balance;
    }

    public void combine(TransationRecord transacao) {

        if (transacao.getNumConta() == this.getAccount()) {
            this.balance += (transacao.getValortransacao());
        } else {
            System.out.println("Alteração monetaria solicitada para contas com numeracao diferente");
        }

    }
}//fim da classe Account
