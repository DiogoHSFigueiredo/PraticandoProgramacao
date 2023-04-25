/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap9;

/**
 *
 * @author Diogo
 */
public class ComissionEmployee extends Object {

    protected final String firstName;
    protected final String lastName;
    protected final String socialSecurityNumber;
    protected double grossSales; //vendas brutas semanais
    protected double comissionRate; //porcentagem da comissao

    //construtor de cinco argumentos
    public ComissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double comissionRate) {

        //a chamada implicita para o construtor padrão de Object ocorre aqui
//se grossSales e invalido, lanca uma excecao
        if (grossSales < 0.0) {
            throw new IllegalArgumentException(
                    "Gross sales must be >= 0.0");
        }
        //se comissionRate e invalido, lanca uma excecao
        if (comissionRate <= 0.0 || comissionRate >= 1.0) {
            throw new IllegalArgumentException("Comission rate must be >0.0 and < 1.0");

        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.comissionRate = comissionRate;

    } //fim do construtor

    //retorna o nome
    public String getFirstName() {
        return firstName;
    }

    //retorna o sobrenome
    public String getLastName() {
        return lastName;
    }

    //retorna o numero de seguro social
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    //configura a quantidade de vendas brutas
    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException(
                    "Gross sales must be >0.0");
        }

        this.grossSales = grossSales;
    }

    //retorna a quantidade de vendas brutas
    public double getGrossSales() {
        return grossSales;
    }

    //configura a taxa de comissao
    public void setComissionRate(double comissionRate) {
        if (comissionRate <= 0.0 || comissionRate >= 1.0) {
            throw new IllegalArgumentException(
                    "Comission rate must be > 0.0 and < 1.0");
        }
        this.comissionRate = comissionRate;
    }

    //retorna a taxa de comissao
    public double getComissionRate() {
        return comissionRate;
    }

    //calcula os lucros
    public double earnings() {
        return getComissionRate() * getGrossSales();
    }

    //retorna a representacao String do objeto ComissionEmployee
    @Override //indica que esse metodo substitui um metodo da superclasse
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", "comission employee", getFirstName(), getLastName(), "social security number", getSocialSecurityNumber(), "gross sales", getGrossSales(), "comission rate", getComissionRate());
    }

}// fim da classe ComissionEmployee
