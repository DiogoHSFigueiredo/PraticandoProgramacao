/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap8;

/**
 *
 * @author Diogo
 */
public class Date {

    private int month;  //1-12
    private int day;    //1-31 conforme o mês
    private int year;   //qualquer ano

    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    //construtor: confirma o valor adequado para o mês e dia dado o ano
    public Date(int month, int day, int year) {

        //verifica se mês está no intervalo
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException("month (" + month + ") mus be 1-12");
        }

        //verifica se day está no intervalo para month
        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        }

        //verifica no ano bissexto se o mês é 2 e o dia é 29
        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            throw new IllegalArgumentException("Day (" + day + ")out-of-range for the specified month and year");
        }

        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf("Date object constructor for date %s%n", this);
    }

    //retorna uma String no formato mês/dia/ano
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }

    //Metodo que incrementa a data em 1 dia
    public void nextDay() {
        if (daysPerMonth[month] == day) {
            if (month != 12) {
                month += 1;
            } else if (month == 12) {
                month = 1;
                year += 1;
            }
            day = 1;
        } else {
            day += 1;
        }

    }

} // fim da classe
