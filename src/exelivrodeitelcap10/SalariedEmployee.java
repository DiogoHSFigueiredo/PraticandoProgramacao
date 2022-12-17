/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap10;

/**
 *
 * @author Diogo
 */
public class SalariedEmployee extends Employee {

    private double weeklySalary;

    //construtor
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);

        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException(
                    "Weekly salary must be >= 0.0");
        }
        this.weeklySalary = weeklySalary;
    }

    //configura o salario
    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException(
                    "Weekly salary must be >= 0.0");
        }
        this.weeklySalary = weeklySalary;
    }

    //retorna o salario
    public double getWeeklySalary() {
        return weeklySalary;
    }

    //calcula os rendimentos; implementa o metodo Payable da interface que era abstrata na superclasse Employee
    @Override
    public double getPaymentAmount() {
        return getWeeklySalary();
    }

    //retorna a representacao String do objeto SalariedEmployee
    @Override
    public String toString() {
        return String.format("salaried employee: %s%n%s: $%,.2f", super.toString(), "weekly salary", getWeeklySalary());
    }

    
} //fim da classe
