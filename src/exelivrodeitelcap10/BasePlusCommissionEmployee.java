/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap10;

/**
 *
 * @author Diogo
 */
public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary; //salario de base por semana

    //construtor
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        if (baseSalary < 0.0) //valida
        {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    //configura o salario-base
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) //valida baseSalary
        {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    //retorna o salario-base
    public double getBaseSalary() {
        return baseSalary;
    }

    //calcula os vencimentos; sobrescreve o metodo earnings em CommissionEmployee
    @Override
    public double getPaymentAmount() {
        return getBaseSalary() + super.getPaymentAmount();
    }

    //retorna a representacao String do objeto BasePlusCommissionEmployee
    @Override
    public String toString() {
        return String.format(" %s %s; %s: $%,.2f", "base salaried", super.toString(), "base salary", getBaseSalary());
    }

} // fim da classe
