/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap9;

/**
 *
 * @author Diogo
 */
public class ComissionEmployeeTest {

    public static void main(String[] args) {
        //instancia o objeto CommissionEmployee
        ComissionEmployee employee = new ComissionEmployee("Sue", "jones", "222-22-2222", 10000, .06);

        //obtem os dados de empregado comissionado
        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s %s%n", "First name is", employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is", employee.getLastName());
        System.out.printf("%s %s%n", "Social security number is", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is", employee.getGrossSales());
        System.out.printf("%s %.2f%n", "Comission rate is", employee.getComissionRate());

        employee.setGrossSales(5000);
        employee.setComissionRate(.1);

        System.out.printf("%n%s:%n%n%s%n", "Update employee information obtained by toString", employee);
    
    } // fim de main
} // fim da classe ComissionEmployeeTest
