/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Classe para desenhar um prontuario medico do paciente
package exelivrodeitelcap3;

import javax.swing.JOptionPane;

/**
 *
 * @author Diogo
 */
public class HealthProfile {

    private String nome;
    private String sobrenome;
    private int anoNascimento;
    private int mesNascimento;
    private int diaNascimento;
    private int idade;
    private int fCM;
    private int fCAMax;
    private int fCAMin;
    private String sexo;
    private double altura;
    private double peso;

    //construtor
    public HealthProfile(String nome, String sobrenome, int anoNascimento, int mesNascimento, int diaNascimento, String sexo, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.anoNascimento = anoNascimento;
        this.mesNascimento = mesNascimento;
        this.diaNascimento = diaNascimento;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    //metodo que calcula idade
    private int calcIdade() {

        int calIdade = 0;
        int diaAtual = 8;
        int mesAtual = 3;
        int anoAtual = 2022;

        if (mesAtual >= mesNascimento) {
            if (diaNascimento > diaAtual) {
                calIdade = (anoAtual - anoNascimento) + 1;
            }
        } else {
            calIdade = (anoAtual - anoNascimento);
        }

        return calIdade;
    }

    //metodo que calcula o IMC
    public String calcIMC(HealthProfile pessoa) {

        double imc = 0;
        String msgIMC = "";
        if (pessoa.peso == 0 || pessoa.altura == 0) {
            JOptionPane.showMessageDialog(null, "Valores em branco, impossivel calcular");
        } else {
            imc = pessoa.peso / (pessoa.altura * pessoa.altura);
            if (imc < 18) {
                msgIMC = "Baixo peso";
            }
            if (imc >= 18.5 && imc <= 24.9) {
                msgIMC = "Peso Normal";
            }
            if (imc >= 25 && imc <= 29.9) {
                msgIMC = "Sobrepeso";
            }
            if (imc >= 30 && imc <= 34.9) {
                msgIMC = "Obesidade grau 1";
            }
            if (imc >= 35 && imc <= 39.9) {
                msgIMC = "Obesidade grau 2";
            }
            if (imc >= 40) {
                msgIMC = "Obesidade grau 3";
            }
        }

        return msgIMC;
    }

    //getter's e setter's
    public int getfCM() {
        fCM = (220 - this.calcIdade());

        return fCM;
    }

    public void setfCM(int fCM) {

        this.fCM = fCM;
    }

    public int getfCAMax() {
        fCAMax = (int) (fCM * 0.85);

        return fCAMax;
    }

    public void setfCAMax(int fCAMax) {
        this.fCAMax = fCAMax;
    }

    public int getfCAMin() {
        fCAMin = (int) (fCM * 0.5);
        return fCAMin;
    }

    public void setfCAMin(int fCAMin) {
        this.fCAMin = fCAMin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }

    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        idade = calcIdade();
        return idade;
    }

}
