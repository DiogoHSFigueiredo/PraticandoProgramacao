/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap8;

/**
 *
 * @author Diogo
 */
public class DateAndTime {

    private int hour; // 0-23
    private int minute; // 0-59
    private int second; // 0-59
    private int secondDaily; //0-86399 (segundos dentro de 24 horas)
    private int month;  //1-12
    private int day;    //1-31 conforme o mês
    private int year;   //qualquer ano

    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // construor sem argumento Time2:
    //Inicializa cada variavel de instancia para zero
    public DateAndTime() {
        this(1, 1, 1, 1, 1, 1); // invoca o construtor com 6 argumentos vazios.
    }

    //Construtor Time2: hora, minutos, segundos e data completa fornecidos
    public DateAndTime(int hour, int minute, int second, int month, int day, int year) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour mus be 0-23");
        }
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minutes must be 0-59");
        }
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }
        //verifica se mês está no intervalo
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException("month (" + month + ") mus be 1-12");
        }

        //verifica se day está no intervalo para month
        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        }

        //verifica se year é valido, não negativo
        if (year < 0) {
            throw new IllegalArgumentException("Year (" + year + ") out-of-range - no negative values");
        }
        this.month = month;
        this.day = day;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
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

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //Converte em String no formato de data/hora universal (HH:MM:SS)
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d %s %d - %d - %d ", getHour(), getMinute(), getSecond(), " Data: ", getDay(), getMonth(), getYear());
    }

    //Converte em String no formato padrão de data/hora (H:MM:SS AM ou PM)
    @Override
    public String toString() {
        return String.format("%d:%02d:%02d %s %s %d - %d - %d", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12), getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"), " Data: ", getDay(), getMonth(), getYear());
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

    //método recebe um objeto DateAndTime e lhe incrementa 1 segundo à sua data/hora
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

//metodo recebe um objeto DateAndTime e lhe incrementa 1 minuto à sua data/hora
    public void incrementMinute(DateAndTime obj) {

        if (obj.getMinute() == 59) {
            obj.setMinute(00);

            if (obj.getHour() == 23) {
                obj.setHour(00);
                obj.nextDay();

            } else {
                obj.setHour(getHour() + 1);
            }

        } else {
            obj.setMinute(getMinute() + 1);
        }

    }

    //metodo recebe um objeto DateAndTime e lhe incrementa 1 hora à sua data/hora
    public void incrementHour(DateAndTime obj) {
        if (obj.getHour() == 23) {
            obj.setHour(00);
            obj.nextDay();

        } else {
            obj.setHour(getHour() + 1);
        }
    }

    //Metodo que incrementa um dia a data e avanca um mes ou ano caso seja necessario conforme calendario
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

} // fim da classe DateAndTime

