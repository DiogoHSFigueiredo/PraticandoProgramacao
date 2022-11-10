/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap8;

/**
 *
 * @author Diogo
 */
public class Time2Test {

    public static void main(String[] args) {

        Time2 t1 = new Time2(); //00:00:00
        Time2 t2 = new Time2(2); //02:00:00
        Time2 t3 = new Time2(21, 34); //21:34:00
        Time2 t4 = new Time2(12, 25, 42); // 12:25:42
        Time2 t5 = new Time2(t4); //12:25:42
        Time2 t7 = new Time2(22, 59, 59); // 00:00:01

        System.out.println("Constructed with:");
        displayTime("t1: all default arguments", t1);
        displayTime("t2: hour specified; default minute and second", t2);
        displayTime("t3: hour and minute specified; default second", t3);
        displayTime("t4: hour, minute and second specified", t4);
        displayTime("t5: Time2 object t4 specified", t5);
        displayTime("t7: Time2 object t7 specified", t7);

        //tenta inicializar t6 com valores invalidos
        try {
            Time2 t6 = new Time2(27, 74, 99); // valores invalidos
        } catch (IllegalArgumentException e) {
            System.out.printf("%nException while initializing t6: %s%n", e.getMessage());
        }
        System.out.println("Calculadora de segundos a apartir da hora informada " + t1.converteSegundos(1, 1, 28));

        //testa o metodo tick da classe time2 que incrementa 1 segundo ao objeto Time2
        t7.incrementSecond(t7);
        displayTime("\nt7: Time2 object t7 specified apos chamar o metodo IncrementSecond", t7);

        t7.incrementMinute(t7);
        displayTime("\nt7: Time2 object t7 specified apos chamar o metodo IncrementMinute", t7);

        t7.incrementHour(t7);
        displayTime("\nt7: Time2 object t7 specified apos chamar o metodo IncrementHour", t7);

    } // Fim do Metodo main

    //exibe um objeto Time2 nos formatos de 24 horas e 12 horas
    private static void displayTime(String header, Time2 t) {
        System.out.printf("%s%n  %s%n  %s%n", header, t.toUniversalString(), t.toString());
    }

} // fim da classe Time2Test
