/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap8;

/**
 *
 * @author Diogo
 */
public class Time1 {

    private int hour; //0-23
    private int minute; // 0-59
    private int second; //0-59

    //configura um novo valor de hora universal; lança uma exceção se a construção adotar parametros invalido
    public void setTime(int hour, int minute, int second) {
        //valida hora, minuto e segundo
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
            throw new IllegalArgumentException(
                    "hour, minute and/or second was out of range");
        }
        this.hour = hour; //
        this.minute = minute;
        this.second = second;

    }
//converte em String no formato de data/hora universal (HH: MM: SS)

    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

//Converte em String no formato padrao data/hora (H:MM:SS AM ou PM)
    public String toString() {
        return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour % 12), minute, second, (hour < 12 ? "AM" : "PM"));
    }

}//Fim da classe