/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap10;

/**
 *
 * @author Diogo
 */
public abstract class Employee implements Payable {

    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    //contrutor
    public Employee(String firstName, String lastName, String socialSecurityNumber) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

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

    //retorna a representacao de String do objeto Employee
    @Override
    public String toString() {
        return String.format("%s %s%nsocial security number: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
    }

    //o metodo abstract deve ser sobrescrito pelas subclasses concretas
    // public abstract double getPaymentAmount(); //nenhuma implementacao aqui


} // fim da classe
