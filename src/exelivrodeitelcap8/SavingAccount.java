/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap8;

/**
 *
 * @author Diogo
 */
public class SavingAccount {

    private static double taxaJurosAnual;
    private double valorSaldo;

    //construtor
    public SavingAccount(double vlSaldo, double txJuros) {

        taxaJurosAnual = txJuros;
        valorSaldo = vlSaldo;

    }

    public double calcJurosMensal() {

        double jurosMensal = this.valorSaldo * ((taxaJurosAnual/100) / 12);
        this.valorSaldo += jurosMensal;
        return this.valorSaldo;
    }

    public static double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public static void setTaxaJurosAnual(double taxaJurosAnual) {
        SavingAccount.taxaJurosAnual = taxaJurosAnual;
    }

    public double getValorSaldo() {
        return this.valorSaldo;
    }

    public void setValorSaldo(double valorSaldo) {
        this.valorSaldo = valorSaldo;
    }

} // fim da classe
