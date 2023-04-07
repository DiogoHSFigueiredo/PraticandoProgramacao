/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap8;

/**
 *
 * @author Diogo
 */
public class TimeTest {

    public static void main(String[] args) {

//cria e inicializa objeto time
        Time1 time = new Time1(); //invoca o construtor time1

//gera saida de representação de String da data/hora
        displayTime("After time object is created", time);
        System.out.println();

        // altera a data/hora e gera saida da data/hora atualizada
        time.setTime(13, 27, 6);
        displayTime("After calling setTime", time);
        System.out.println(); //

        // tenta definir data/hora com valores invalidos
        try {
            time.setTime(99, 99, 99); //todos os valores fora do intervalo aceitavel

        } catch (IllegalArgumentException e) {
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }
// exibe a data/hora apos uma tentativa de definir valores invalidos
        displayTime("After calling setTime with invalid values", time);
    }

    //exibe um objeto time1 nos formatos de 24horas e 12 horas
    private static void displayTime(String header, Time1 t) {
        System.out.printf("%s%nUniversal time: %s%nStardad time: %s%n", header, t.toUniversal(), t.toString());

    }// fim metodo main
} //fim classe
