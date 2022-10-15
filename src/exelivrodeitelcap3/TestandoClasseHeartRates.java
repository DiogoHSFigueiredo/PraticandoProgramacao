/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap3;

import javax.swing.JOptionPane;

/**
 *
 * @author Diogo
 */
public class TestandoClasseHeartRates {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Bem vindo, vamos calcular sua idade e como esta sua frequencia cardiaca");
        String nome = JOptionPane.showInputDialog(null, "Dite seu nome");
        String sobreNome = JOptionPane.showInputDialog(null, "Dite seu nome Sobrenome");
        int diaNascimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Dite o dia de nascimento"));
        int mesNascimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Dite o mes de nascimento"));
        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Dite o ano de nascimento"));
        
        HeartRates Diogo = new HeartRates(nome, sobreNome, diaNascimento, mesNascimento, anoNascimento);
        
        JOptionPane.showMessageDialog(null,"Nome: "+Diogo.getNome()+"\nSobrenome: "+Diogo.getSobrenome()+"\nIdade: "+Diogo.getIdade()+"\nFrequencia Cardiaca Maxima: "+Diogo.getfCM()+"\nFrequencia cardiaca alvo mininma: "+Diogo.getfCAMin()+"\nFrequencia cardiava alvo Maxima: "+Diogo.getfCAMax());


    }

} // fim da classe
