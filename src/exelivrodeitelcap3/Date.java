/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap3;

//classe para manipulacao de dia/mes/ano
/**
 *
 * @author Diogo
 */
public class Date {

    private int dia;
    private int mes;
    private int ano;

    public Date(int dia, int mes, int ano) {

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    }

    public String displayDate(Date date) {
        String data = String.format("%d/%d/%d", this.dia, this.mes, this.ano);
        return data;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    

}
