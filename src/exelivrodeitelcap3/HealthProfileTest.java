/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap3;

import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class HealthProfileTest {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.println("Olá, bem vindo!!");
        System.out.println("Digite seu nome");
        String nome = tec.next();
        System.out.println("Digite seu sobrenome");
        tec.reset();
        String sobrenome = tec.next();
        System.out.println("Digite o dia que nasceu");
        tec.reset();
        int dia = tec.nextInt();
        System.out.println("Digite o mes que nasceu");
        tec.reset();
        int mes = tec.nextInt();
        System.out.println("Digite o ano que nasceu");
        tec.reset();
        int ano = tec.nextInt();
        System.out.println("Digite seu sexo");
        tec.reset();
        String sexo = tec.next();
        System.out.println("Digite sua altura");
        tec.reset();
        double altura = tec.nextDouble();
        System.out.println("Digite seu peso");
        tec.reset();
        double peso = tec.nextDouble();

        HealthProfile paciente1 = new HealthProfile(nome, sobrenome, ano, mes, dia, sexo, altura, peso);
        Date dataNascimento = new Date(dia, mes, ano);

        System.out.println("\nVamos verificar seu prontuário\n");
        System.out.println("Nome: " + paciente1.getNome() + "\nSobrenome: " + paciente1.getSobrenome() + "\nSexo: " + paciente1.getSexo() + "\nData Nascimento: " + dataNascimento.displayDate(dataNascimento) + "\nAltura: " + paciente1.getAltura() + "\nPeso: " + paciente1.getPeso() + "\nIdade: " + paciente1.getIdade() + "\nIMC: " + paciente1.calcIMC(paciente1) + "\nFrequencia Cardiaca Máx: " + paciente1.getfCM() + "\nFrequencia Cardiaca Alvo Máx: " + paciente1.getfCAMax() + "\nFrequencia Cardiaca Alvo MIN: " + paciente1.getfCAMin());
    }

}
