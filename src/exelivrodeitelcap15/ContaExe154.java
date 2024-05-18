/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap15;

/**
 *
 * @author Diogo
 */
public class ContaExe154 {

    private String nome;
    private String endereco;
    private String telefone;
    private double saldo;
    private double limiteCredito;
    private String termosDesconto;
    private String arranjosContrato;
    private String historicoCompras;
    private double pagamentoDinheiro;

    public ContaExe154(String nome, String endereco, String telefone, double saldo, double limiteCredito, String termosDesconto, String arranjosContrato) {

        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;

        if (saldo < 0) {
            System.out.println("Saldo negativo informado. A conta será iniciada com saldo 0");
            saldo = 0;
            this.saldo = saldo;
        }
        this.limiteCredito = limiteCredito;
        this.termosDesconto = termosDesconto;
        this.arranjosContrato = arranjosContrato;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public String getTermosDesconto() {
        return termosDesconto;
    }

    public void setTermosDesconto(String termosDesconto) {
        this.termosDesconto = termosDesconto;
    }

    public String getArranjosContrato() {
        return arranjosContrato;
    }

    public void setArranjosContrato(String arranjosContrato) {
        this.arranjosContrato = arranjosContrato;
    }

    public String getHistoricoCompras() {
        return historicoCompras;
    }

    public void setHistoricoCompras(String historicoCompras) {
        this.historicoCompras = historicoCompras;
    }

    public double getPagamentoDinheiro() {
        return pagamentoDinheiro;
    }

    public void setPagamentoDinheiro(double pagamentoDinheiro) {
        this.pagamentoDinheiro = pagamentoDinheiro;
    }
    
    

}
