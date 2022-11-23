/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap9;

/**
 *
 * @author Diogo
 */
public class BasePlusCommissionEmployeeTest {

    public static void main(String[] args) {

        //instancia o objeto BasePlusCommisionEmployee
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, .04, 300);

        //obtem os dados do empregado comissionado com salario-base
        System.out.println("Employee information obtained by get methods: %n");
        System.out.printf("%s %s%n", "First name is", employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is", employee.getLastName());
        System.out.printf("%s %s%n", "Social security number is", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sale is", employee.getGrossSales());
        System.out.printf("%s %.2f%n", "Comission rate is", employee.getCommissionRate());
        System.out.printf("%s %.2f%n", "Base salary is", employee.getBaseSalary());

        employee.setBaseSalary(1000);

        System.out.printf("%n%s:%n%n%s%n", "Updated employee information obained by toString", employee.toString());

    } // fim do metodo main

}// fim da classe
