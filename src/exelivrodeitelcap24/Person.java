/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Classe Person que representa uma entrada em um livro de endereços.
package exelivrodeitelcap24;

/**
 *
 * @author Diogo
 */
public class Person {

    private int addressID;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    //construtor vazio
    public Person() {

    }

    //construtor
    public Person(int addressId, String firstName, String lastName, String email, String phoneNumber) {
        setAddresID(addressId);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setPhoneNumber(phoneNumber);
    }

    //define o AddressID
    public void setAddresID(int addresID) {
        this.addressID = addresID;
    }

    //retorna o AddressID
    public int getAddressID() {
        return addressID;
    }

    //define o firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //retorna o nome
    public String getFirstName() {
        return firstName;
    }

    //define o lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //retorna o sobrenome
    public String getLastName() {
        return lastName;
    }

    //define o endereco de e-mail
    public void setEmail(String email) {
        this.email = email;
    }

    //retorna o endereco de e-mail
    public String getEmail() {
        return email;
    }

    //define o numero de telefone
    public void setPhoneNumber(String phone) {
        this.phoneNumber = phone;
    }

    //retorna o numero de telefone
    public String getPhoneNumber() {
        return phoneNumber;
    }
} //fim da classe Person
