/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap10;

import exelivrodeitelcap9.BasePlusCommissionEmployee1;
import exelivrodeitelcap9.ComissionEmployee;

/**
 *
 * @author Diogo
 */
public class PolimorfismoTeste {
    
    public static void main(String[] args) {
       
       // atribui uma referencia de superclasse a variavel de superclasse
       ComissionEmployee commissionEmployee = new ComissionEmployee("Sue", "Jones", "222-22-2222", 1000, .06);
        
       //atribui uma referencia de subclasse a variavel de subclasse
       BasePlusCommissionEmployee1 basepPlusCommissionEmployee = new BasePlusCommissionEmployee1 ("Bob", "Lewis", "333-33-3333", 5000, .04, 300
       );
       
       //invoca ToString no objeto de superclasse utilizando a variavel de superclasse
       System.out.printf("%s %s:%n%n%s%n%n", "Call CommissionEmployee's toString with superclass reference ", "to superclass object", commissionEmployee.toString());
       
       //invoca toString no objeto de subclasse utilizando a variavel de subclasse
       System.out.printf("%s %s:%n%n%s%n%n", "Call BasePlusCommissionEmployee's toString with subclass", "reference to subclass object", basepPlusCommissionEmployee.toString());
       
       //invoca toString no objeto de subclasse utilizando a variavel de superclasse
       ComissionEmployee commissionEmployee2 = basepPlusCommissionEmployee;
       System.out.printf("%s %s:%n%n%s%n", "Call BasePlusCommissionEmployee1's toString with superclass", "reference to subclass object", commissionEmployee2.toString());
       
    } //fim de main
    
} //fim da classe
