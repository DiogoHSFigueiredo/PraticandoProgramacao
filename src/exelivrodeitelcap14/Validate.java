/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap14;

import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class Validate {

    public static void main(String[] args) {
        //obtem entrada de usuario

        Scanner tec = new Scanner(System.in);
        System.out.println("Please enter first name:");
        String firstName = tec.nextLine();
        System.out.println("Please enter the last name:");
        String lastName = tec.nextLine();
        System.out.println("Please enter address:");
        String address = tec.nextLine();
        System.out.println("Please enter city:");
        String city = tec.nextLine();
        System.out.println("Please enter state:");
        String state = tec.nextLine();
        System.out.println("Please enter zip:");
        String zip = tec.nextLine();
        System.out.println("Please enter phone:");
        String phone = tec.nextLine();

        //valida entrada de usuario e exibe mensagem de erro
        System.out.println("\nValidate result:");

        if (!ValidateInput.validateFirstName(firstName)) {
            System.out.println("Invalid first name");
        } else if (!ValidateInput.validateLastName(lastName)) {
            System.out.println("invalid last name");
        } else if (!ValidateInput.validateAddress(address)) {
            System.out.println("Invalid address");
        } else if (!ValidateInput.validateCity(city)) {
            System.out.println("Invalid city");
        } else if (!ValidateInput.validateState(state)) {
            System.out.println("Invalid state");
        } else if (!ValidateInput.validateZip(zip)) {
            System.out.println("Invalid zip code");
        } else if (!ValidateInput.validatePhone(phone)) {
            System.out.println("Invalid phone number");
        } else {
            System.out.println("Valid input. Thank you.");
        }

    }
}
