 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap2;

import javax.swing.JOptionPane;

/**
 *
 * @author Diogo
 */

//Classe recebe dados como altura e peso e retorna o IMC e a condicao do usuário.
public class CalculadoraImc {

    public static double calcIMC() {

        double peso;
        double altura;
        double imc = 0;

        JOptionPane.showMessageDialog(null, "Vamos calcular seu IMC");

        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso"));

        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));

        if (peso == 0 || altura == 0) {
            JOptionPane.showMessageDialog(null, "Valores em branco, impossivel calcular");
        } else {
            imc = peso / (altura*altura);
            if (imc < 18) {
                JOptionPane.showMessageDialog(null, "Baixo peso");
            }
            if (imc >= 18.5 && imc <= 24.9) {
                JOptionPane.showMessageDialog(null, "Peso Normal");
            }
            if (imc >= 25 && imc <= 29.9) {
                JOptionPane.showMessageDialog(null, "Sobrepeso");
            }
            if (imc >= 30 && imc <= 34.9) {
                JOptionPane.showMessageDialog(null, "Obesidade grau 1");
            }
            if (imc >= 35 && imc <= 39.9) {
                JOptionPane.showMessageDialog(null, "Obesidade grau 2");
            }
            if (imc >= 40) {
                JOptionPane.showMessageDialog(null, "Obesidade grau 3");
            }
        }
        return imc;
    }

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Seu IMC e: " + calcIMC());
    }
}
