/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap9;

/**
 *
 * @author Diogo
 */
public class BasePlusCommissionEmployee {

    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales; // vendas brutas semanais
    private double comissionRate; //porcentagem da comissao
    private double baseSalary; //salario-base por semana

    //construtor de seis argumentos
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double comissionRate, double baseSalary) {

        //chamada implicita para o construtor padrao de Object ocorre aqui
        //se grossSales é invalido, lanca uma excecao
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >=0.0");
        }
        // se comissionRate e invalido, lanca uma excecao
        if (comissionRate <= 0.0 || comissionRate >= 1.0) {
            throw new IllegalArgumentException("Comission rate must be >0.0 and 1.0");
        }
        //se baseSalary e invalido, lanca uma excecao
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >=0.0");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.comissionRate = comissionRate;
        this.baseSalary = baseSalary;
    }//fim do construtor

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
            throw new IllegalArgumentException("Gross sales must be >=0.0");
        }
        this.grossSales = grossSales;
    }

    //retorna a quantidade de vendas brutas
    public double getGrossSales() {
        return grossSales;
    }

    //configura a taxa de comissao
    public void setComissionRate(double comissionrate) {
        if (comissionRate <= 0.0 || comissionRate >= 1.0) {
            throw new IllegalArgumentException("Comission rate must be > 0.0 and 1.0");
        }
        this.comissionRate = comissionRate;
    }

    //retorna a taxa de comissao
    public double getComissionRate() {
        return comissionRate;
    }

    //configura o salario-base
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >=0.0");
        }
        this.baseSalary = baseSalary;
    }

    //retorna o salario base
    public double getBaseSalary() {
        return baseSalary;
    }

    //calcula os lucros
    public double earning() {
        return getBaseSalary() + (getComissionRate() * getGrossSales());
    }

    //retorna a representacao de String de BasePlusCommissionEmployee
    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f", "base-salaried comission employee", getFirstName(), getLastName(), "social security number", getSocialSecurityNumber(), "gross sales", getGrossSales(), "comission rate", getComissionRate(), "base salary", getBaseSalary());
    }
} // fim da classe 
