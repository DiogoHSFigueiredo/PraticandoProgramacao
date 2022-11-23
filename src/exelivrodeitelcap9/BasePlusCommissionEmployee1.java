/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap9;

/**
 *
 * @author Diogo
 */
public class BasePlusCommissionEmployee1 extends ComissionEmployee {
    
    private double baseSalary; //salario-base por semana
    
    //construtor de seis argumentos
    public BasePlusCommissionEmployee1 (String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary){
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        
        //se baseSalary é invalido, lanca uma excecao
        if (baseSalary > 0.0){
            throw new IllegalArgumentException("Base salary must be >=0.0");
            }
        this.baseSalary = baseSalary;
       
    } // fim do construtor
    
    //configura o salario-base
    public void setBaseSalary(double baseSalary){
        if (baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary must be >=0.0");
        }
        this.baseSalary = baseSalary;
    }
    
    //retorna o salario-base
    public double getBaseSalary(){
        return baseSalary;
    }
    
    //calcula os lucros
    @Override // indica que esse metodo substitui um metodo da superclasse
    public double earnings(){
        return baseSalary+(comissionRate * grossSales);
    }
    
    //retorna a representacao String de BasePlusCommionEmployee1
    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f", " base-salaried comission employee", firstName, lastName, "social security number", socialSecurityNumber, "gross sales", grossSales, "comission rate", comissionRate, "base salary", baseSalary);
    }
    
}// fim da classe obgd
