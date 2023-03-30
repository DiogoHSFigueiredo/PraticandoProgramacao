/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap3;

//classe de funcionario e salario
import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class Employee {

//variaveis    
    private String nome;
    private String sobrenome;
    private double salario;

//construtor
    public Employee(String nome, String sobrenome, double salario) {

        while (salario <= 0) {
            System.out.println("Salario inválido, favor digite um salario mensal para o funcionário");
            Scanner tec = new Scanner(System.in);
            salario = tec.nextDouble();
        }

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

//metodos getter's e setter's
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
