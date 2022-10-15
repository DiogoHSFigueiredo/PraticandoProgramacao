/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap1;

/**
 *
 * @author Diogo
 */
public class OperandoContaBanco {

    public static void main(String[] args) {

        Conta diogo = new Conta("Diogo", 400.0);
        diogo.setStatus(true);

        System.out.println("O saldo e " + diogo.getSaldo());
        diogo.deposito(500);
        System.out.println("O saldo e " + diogo.getSaldo());
        diogo.deposito(300);
        System.out.println("O saldo e " + diogo.getSaldo());
        
        Conta ana = new Conta("Ana", 300.0);
        ana.saque(800);
        ana.deposito(200);
        System.out.println(" O saldo de "+ana.getNome()+" e "+ana.saldo());
    }
}
