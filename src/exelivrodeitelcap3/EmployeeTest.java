/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap3;

/**
 *
 * @author Diogo
 */
public class EmployeeTest {

    public static void main(String[] args) {

        Employee Ep1 = new Employee("Ep1", "S1", 5800);
        Ep1.setSalario((Ep1.getSalario() + Ep1.getSalario() * 0.1));
        System.out.println("Conta: " + Ep1.getNome() + " Sobrenome: " + Ep1.getSobrenome() + " Salario: " + Ep1.getSalario());
        System.out.println("Salario anual: " + (Ep1.getSalario() * 12));
    }

}
