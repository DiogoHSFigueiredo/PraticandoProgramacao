/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap8;

/**
 *
 * @author Diogo
 */
public class Time2 {

    private int hour; // 0-23
    private int minute; // 0-59
    private int second; // 0-59
    private int secondDaily; //0-86399 (segundos dentro de 24 horas)

    // construor sem argumento Time2:
    //Inicializa cada variavel de instancia para zero
    public Time2() {
        this(0, 0, 0); // invoca o construtor com três argumentos.
    }

    //Construtor Time2: hora fornecida, minuto e segundo padronizados para 0
    public Time2(int hour) {
        this(hour, 0, 0); //invoca o construtor com três argumentos.
    }

    // construor Time2: hora e minuto fornecidos, segundo padronizado para 0
    public Time2(int hour, int minute) {
        this(hour, minute, 0); // invoca o construtor com três argumentos.
    }

    //Construtor Time2: hora, minutos e segundos fornecidos
    public Time2(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour mus be 0-23");
        }
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minutes must be 0-59");
        }
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }
        this.hour = hour;
        
        
        
        this.minute = minute;
        this.second = second;
    }

    //Construtor Time2: outro objeto Time2 fornecido
    public Time2(Time2 time) {

        //invoca o construtor com três argumentos
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    //Metodos set
    // Configura um valor de tempo usando hora universal
    // valida os dados
    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour mus be 0-23");
        }
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minutes must be 0-59");
        }
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //valida e configura a hora
    public void setHour(int hour) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }
        this.hour = hour;
    }

    // valida e configura os minutos
    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minutes mus be 0-59");
        }
        this.minute = minute;
    }

    //valida e configura os segundos
    public void setSecond(int second) {
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }
        this.second = second;
    }

    //Métodos get
    // Obtém o valor da hora
    public int getHour() {
        return hour;
    }

    //Obtém o valor dos minutos
    public int getMinute() {
        return minute;
    }

    //Obtém o valor dos segundos
    public int getSecond() {
        return second;
    }

    //Converte em String no formato de data/hora universal (HH:MM:SS)
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    //Converte em String no formato padrão de data/hora (H:MM:SS AM ou PM)
    public String toString() {
        return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12), getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }

    //Metodo que recebe um formato em horas e retorna o valor em segundos.
    public int converteSegundos(int hora, int minutos, int segundos) {
        int segundosDaily = 0;
        if (segundos != 0) {
            segundosDaily += segundos;
        }
        if (minutos != 0) {
            segundosDaily += minutos * 60;
        }
        if (hora != 0) {
            segundosDaily += ((hora * 60) * 60);
        }
        return segundosDaily;
    }

    //método recebe um objeto Time2 e lhe incrementa 1 segundo à sua data/hora
    public void incrementSecond(Time2 obj) {
        if (obj.getSecond() == 59) {
            obj.setSecond(00);

            if (obj.getMinute() == 59) {
                obj.setMinute(00);

                if (obj.getHour() == 23) {
                    obj.setHour(00);
                } else {
                    obj.setHour(getHour() + 1);
                }

            } else {
                obj.setMinute(getMinute() + 1);
            }

        } else {
            obj.setSecond(getSecond() + 1);
        }
    }

//metodo recebe um objeto Time2 e lhe incrementa 1 minuto à sua data/hora
    public void incrementMinute(Time2 obj) {

        if (obj.getMinute() == 59) {
            obj.setMinute(00);

            if (obj.getHour() == 23) {
                obj.setHour(00);
            } else {
                obj.setHour(getHour() + 1);
            }

        } else {
            obj.setMinute(getMinute() + 1);
        }

    }

    //metodo recebe um objeto Time2 e lhe incrementa 1 hora à sua data/hora
    public void incrementHour(Time2 obj) {
        if (obj.getHour() == 23) {
            obj.setHour(00);
        } else {
            obj.setHour(getHour() + 1);
        }
    }

} // fim da classe Time2
