/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcapE;
//Classe Account para representar uma conta banc�ria


/**
 *
 * @author Diogo
 */
public class AccountE {

    //vari�veis
    private String name;
    private double balance;

    //declara um construtor vazio
    public AccountE() {

    }

    //declara construtor explicito para modular a criacao do objeto
    public AccountE(String name, double balance) {

        this.name = name;

        if (balance > 0.0) {
            this.balance = balance;
        }

    }

    //metodoS para SETER'S E GETER'S
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0) {
            this.balance += depositAmount;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    //metodo que realiza saques
    public void withDraw(AccountE nome, double withdraw) {

        System.out.println("Olá, bem vindo! Seu saldo é: " + nome.getBalance());

        if (withdraw > nome.getBalance()) {

            System.out.println("Saque não realizado. Valor solicitado excede o limite disponível");
        }
        if (withdraw < nome.getBalance()) {

            nome.balance -= withdraw;
            System.out.println("Saque realizado. Seu limite atualizado é: " + nome.getBalance());
        }

    }

} // fim da classe
