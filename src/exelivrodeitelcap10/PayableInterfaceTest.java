/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap10;

/**
 *
 * @author Diogo
 */
public class PayableInterfaceTest {

    public static void main(String[] args) {

        //cria array Payable de quatro elementos
        Payable[] payableObjects = new Payable[4];

        //preencher o array com objetos que implementam Payable
        payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
        payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
        payableObjects[2] = new SalariedEmployee("Jhon", "Smith", "111-11-1111", 800.00);
        payableObjects[3] = new SalariedEmployee("Lisa", "Barnes", "888-88-8888", 1200.00);

        System.out.println("Invoices and Employees processed polymorphically");

        //processa genericamente cada elemento no array payableObjects
        for (Payable currentPayable : payableObjects) {

            //gera saida de currentPayable e sua quantia de pagamento apropriado
            System.out.printf("%n%s %n%s: $%,.2f%n", currentPayable.toString(), "payment due", currentPayable.getPaymentAmount()); // poderia invocar implicitamente);

        }
    } // fim de main

} // fim da classe
