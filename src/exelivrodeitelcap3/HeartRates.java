/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap3;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Diogo
 */
public class HeartRates { //inicio da classe de padroes cardiacos

    private String nome;
    private String sobrenome;
    private int anoNascimento;
    private int mesNascimento;
    private int diaNascimento;
    private int idade;
    private int fCM;
    private int fCAMax;
    private int fCAMin;

//construtor
    public HeartRates(String nome, String sobrenome, int diaNascimento, int mesNascimento, int anoNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = calcIdade(diaNascimento, mesNascimento, anoNascimento);

    } //fim construtor

//metodo que calcula idade
    private int calcIdade(int diaNascimento, int mesNascimento, int anoNascimento) {

        int calIdade = 0;
        int diaAtual = Calendar.DATE;
        int mesAtual = Calendar.MONTH;
        int anoAtual = Calendar.YEAR;

        if (mesAtual >= mesNascimento) {
            if (diaNascimento > diaAtual) {
                calIdade = (anoAtual - anoNascimento) + 1;
            }
        } else {
            calIdade = (anoAtual - anoNascimento);
        }

        return calIdade;
    } // fim metodo calcula idade

//metodos get e set para os atributos da classe
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getfCM() {
        fCM = (220 - this.idade);

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

} // fim da classe
