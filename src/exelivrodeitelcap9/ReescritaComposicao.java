/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap9;

/**
 *
 * @author Diogo
 */
public class ReescritaComposicao {
    
    private double baseSalary; //salario-base por semana
    
    //construtor 1 argumento e 1 objeto ComissionEmployeee
    public ReescritaComposicao(ComissionEmployee obj, double baseSalary){
         //se baseSalary é invalido, lanca uma excecao
        if (baseSalary < 0.0){
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
   public double earnings(ComissionEmployee obj){
        return baseSalary+(obj.comissionRate * obj.grossSales);
    }
    
    //retorna a representacao String de BasePlusCommionEmployee1

    public String toString(ComissionEmployee obj){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f", " base-salaried comission employee", obj.firstName, obj.lastName, "social security number", obj.socialSecurityNumber, "gross sales", obj.grossSales, "comission rate", obj.comissionRate, "base salary", baseSalary);
    }
    
    
    
    
}
