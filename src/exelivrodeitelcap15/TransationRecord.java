/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap15;

/**
 *
 * @author Diogo
 */
public class TransationRecord {

    private int numconta;
    private double valorTransacao;

    public TransationRecord(Account conta, double valorTransacao) {

        numconta = conta.getAccount();
        this.valorTransacao = valorTransacao;

    }

    public void setValorTransacao(double valor) {

        this.valorTransacao += valor;

    }

    public double getValortransacao() {

        return valorTransacao;
    }

    public void setNumConta(Account conta) {

        this.numconta = conta.getAccount();
    }

    public double getNumConta() {

        return numconta;
    }

}
