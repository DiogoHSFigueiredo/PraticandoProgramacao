/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap4;

import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class CaluladoraDeSalarios {

    public static void main(String[] args) {

        Scanner tec1 = new Scanner(System.in);
        Scanner tec2 = new Scanner(System.in);
        Scanner tec3 = new Scanner(System.in);

        String nome1, nome2, nome3;
        double salarioHora1, salarioHora2, salarioHora3;
        double horasTrabalhadas1, horasTrabalhadas2, horasTrabalhadas3;
        double salarioTotal1 = 0, salarioTotal2 = 0, salarioTotal3 = 0;
        int cont = 0;

        System.out.println("\tBem vindo\n\tVamos calcular os salarios");

        System.out.println("Digite o nome do 1 funcionario");
        nome1 = tec1.nextLine();
        System.out.println("Digite o salario por hora do funcionário 1");
        salarioHora1 = tec1.nextDouble();
        System.out.println("Digite quantas horas trabalhadas na semana anterior");
        horasTrabalhadas1 = tec1.nextDouble();
        if (horasTrabalhadas1 <= 40) {
            salarioTotal1 = salarioHora1 * horasTrabalhadas1;
        }
        if (horasTrabalhadas1 > 40) {
            salarioTotal1 = (salarioHora1 * horasTrabalhadas1) + ((salarioHora1 * 0.5) * (horasTrabalhadas1 - 40));
        }
        

        System.out.println("Digite o nome do 2 funcionario");
        nome2 = tec2.nextLine();
        System.out.println("Digite o salario por hora do funcionário 2");
        salarioHora2 = tec2.nextDouble();
        System.out.println("Digite quantas horas trabalhadas na semana anterior");
        horasTrabalhadas2 = tec2.nextDouble();
        if (horasTrabalhadas2 <= 40) {
            salarioTotal2 = salarioHora2 * horasTrabalhadas2;
        }
        if (horasTrabalhadas2 > 40) {
            salarioTotal2 = (salarioHora2 * horasTrabalhadas2) + ((salarioHora2 * 0.5) * (horasTrabalhadas2 - 40));
        }
        

        System.out.println("Digite o nome do 3 funcionario");
        nome3 = tec3.nextLine();
        System.out.println("Digite o salario por hora do funcionário 3");
        salarioHora3 = tec3.nextDouble();
        System.out.println("Digite quantas horas trabalhadas na semana anterior");
        horasTrabalhadas3 = tec3.nextDouble();
        if (horasTrabalhadas1 <= 40) {
            salarioTotal3 = salarioHora3 * horasTrabalhadas3;
        }
        if (horasTrabalhadas1 > 40) {
            salarioTotal3 = (salarioHora3 * horasTrabalhadas3) + ((salarioHora3 * 0.5) * (horasTrabalhadas3 - 40));
        }

        System.out.println("O funcionario 1 Recebera: " + String.format("%.2f", salarioTotal1));
        System.out.println("O funcionario 2 Recebera: " + String.format("%.2f", salarioTotal2));
        System.out.println("O funcionario 3 Recebera: " + String.format("%.2f", salarioTotal3));
    }
}
