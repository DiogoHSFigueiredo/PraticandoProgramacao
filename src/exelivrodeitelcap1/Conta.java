/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap1;

import java.math.BigDecimal;
import javax.swing.JOptionPane;

/**
 *
 * @author Diogo
 */
public class Conta {

    //Atributos da conta bancária
    private String nome;
    private double saldo;
    private int limite;
    private int numero;
    private boolean status;

    // construtor da conta, precisa passar os argumentos nome e saldo para iniciar
    public Conta(String nome, double saldo) {
        this.nome = nome;
        this.status = true;
        if (saldo > 0) {
            this.saldo = saldo;
        } else {
            this.saldo = 0;
        }
    }

    // metodo que realiza um saque se houver saldo na conta solicitante
    void saque(double valorSaque) {
        if (valorSaque < this.saldo) {
            this.saldo = this.saldo - valorSaque;
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para saque "+this.nome);

        }
    }

    //Metodo que realiza um deposito na conta solicitante
    /**
     * Este metodo realiza um deposito se o valor for positivo
     * @param valorDeposito 
     */
    void deposito(double valorDeposito) {
        if (valorDeposito > 0) {
            this.saldo = this.saldo + valorDeposito;
        } else {
            JOptionPane.showMessageDialog(null, "Impossivel depositar valor negativo");

        }
    }

    //Metodo que retorna o saldo da conta solicitante
    double saldo() {
        double saldo = 0;
        if (status) {
            saldo = this.saldo;
        } else {
            JOptionPane.showMessageDialog(null, "Conta desativada, impossivel verificar saldo");
        }
        return saldo;
    }

    //Metodos get e set dos atributos da conta
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
