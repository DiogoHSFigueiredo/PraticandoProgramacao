/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap8;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 *
 * @author Diogo
 */
public class Interest {

    public static void main(String[] args) {

// quantidade principal antes dos juros
        BigDecimal principal = BigDecimal.valueOf(1000.0);
        BigDecimal rate = BigDecimal.valueOf(0.05); //taxa de juros

//exibe cabeçalhos
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

//Calcula quantidade de depósito para cada um dos dez anos
        for (int year = 1; year <= 10; year++) {

//calcula quantidade durante ano especificado
            BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));

//exibe o ano e a quantidade
            System.out.printf("%1d%20s%n", year, NumberFormat.getCurrencyInstance().format(amount));
        }

    } // fim do metodo principal
} //fim da classe
