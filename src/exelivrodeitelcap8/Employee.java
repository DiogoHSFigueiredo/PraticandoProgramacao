/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap8;

/**
 *
 * @author Diogo
 */
public class Employee {

    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;

    //construtor para inicializar nome, data de nascimento e data de contratação
    public Employee(String firstName, String lastName, Date birthDate, Date hireDate) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    //converte Employee em formato de String
    public String toString() {
        return String.format("%s, %s Hired: %s Birthday: %s", lastName, firstName, hireDate, birthDate);
    }
} // fim da classe
