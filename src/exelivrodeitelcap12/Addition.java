/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap12;

import javax.swing.JOptionPane;

/**
 *
 * @author Diogo
 */
public class Addition {

    public static void main(String[] args) {

        //obtem entrada do usuario a partir de caixas de dialogo
        String firstNumber = JOptionPane.showInputDialog("Enter first integer");
        String secondNumber = JOptionPane.showInputDialog("Enter second integer");

        //converte a String em inteiros para calculos
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);

        int sum = number1 + number2;

        //exibe o resultado em um dialogo de mensagem JOptionPane
        JOptionPane.showMessageDialog(null, "The sun is " + sum, "Sum of two Integers", JOptionPane.PLAIN_MESSAGE);
    }

}
