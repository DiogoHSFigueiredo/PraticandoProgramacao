/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap9;

/**
 *
 * @author Diogo
 */
//criando "subclasses" a partir de composicao e nao heranca
public class BasePlusCommissionEmployeeComposition {

    private double baseSalary;
    private ComissionEmployee empregado;

    //Construtor utilizando composicao
    public BasePlusCommissionEmployeeComposition(ComissionEmployee empregado, double baseSalary) {

        //valida baseSalary como nao negativo
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >=0.0");
        }

        this.baseSalary = baseSalary;
        this.empregado = empregado;
    } // fim do construtor

    public void setBaseSalary(double baseSalary) {
        //valida baseSalary como nao negativo
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >=0.0");
        }
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    //calcula os lucros
    public double earnings() {
        return baseSalary + empregado.earnings();
    }

    public String toString() {
        return String.format("%s %s%n%s: %.2f", "base-salaried", empregado.toString(), "base salary", getBaseSalary());
    }

}
