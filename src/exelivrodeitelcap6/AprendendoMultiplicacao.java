/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap6;

import java.security.SecureRandom;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Diogo
 */
public class AprendendoMultiplicacao {

    public static void main(String[] args) {
        //cria objetos para serem utilizados no app
        SecureRandom numero = new SecureRandom();
        Scanner tec = new Scanner(System.in);

        //declara variaveis para controle e execucao
        int resp = 0;
        boolean x = true;

        JOptionPane.showMessageDialog(null, "VAMOS MULTIPLICAR\nDIGITE 0 PARA SAIR");
        int n1 = 1 + numero.nextInt(10);
        int n2 = 1 + numero.nextInt(10);

        while (x) {
            resp = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor de " + n1 + " X " + n2));

            //testa condicao de continuacao do loop
            if (resp == 0) {
                x = false;
                break;
            }
            if (n1 * n2 == resp) {
                JOptionPane.showMessageDialog(null, "PARABENS ACERTOU");
            } else {
                JOptionPane.showMessageDialog(null, "VAMOS TENTAR NOVAMENTE");
                continue;
            }
            n1 = 1 + numero.nextInt(10);
            n2 = 1 + numero.nextInt(10);
        }
    }

}
