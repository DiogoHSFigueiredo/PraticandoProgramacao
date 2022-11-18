/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap8;

/**
 *
 * @author Diogo
 */
public class Date2 {

    private int mes;
    private int dia;
    private int ano;
    private String nomeMes;
    private int diasAno;

//construtor recebe 3 parametros e inicializa 1 formato de data: DD/MM/YYYY
    public Date2(int dia, int mes, int ano) {

        //validacao das entradas de argumentos
        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("Intervalo de meses 1 - 12");
        }
        //Considerando todos os meses com 31 dias pela dinamica do exercicio
        if (dia < 0 || dia > 31) {
            throw new IllegalArgumentException("Intervalo de dias de 1 - 31");
        }
        if (ano < 0) {
            throw new IllegalArgumentException("Ano nao pode ser negativo");
        }

        this.mes = mes;
        this.dia = dia;
        this.ano = ano;

        System.out.printf("%s %02d:%02d:%02d", "Voce criou a Data: ", this.dia, this.mes, this.ano);
    }

//construtor recebe 3 parametros e inicializa a data no formato: "Julho 14, 1992".
    public Date2(String mes, int dia, int ano) {

        //Considerando todos os meses com 31 dias pela dinamica do exercicio
        if (dia < 0 || dia > 31) {
            throw new IllegalArgumentException("Intervalo de dias de 1 - 31");
        }
        if (ano < 0) {
            throw new IllegalArgumentException("Ano nao pode ser negativo");
        }

        this.nomeMes = mes;
        this.dia = dia;
        this.ano = ano;

        System.out.printf("%s %s %02d, %02d", "Voce criou a Data: ", this.nomeMes, this.dia, this.ano);

    }

//construtor recebe 2 parametros e inicializa a data no formato dias/ano: "200/2022"
    public Date2(int diasAno, int ano) {

        if (diasAno < 0 || diasAno > 365) {
            throw new IllegalArgumentException("Intervalo de dias de 1 - 31");
        }
        if (ano < 0) {
            throw new IllegalArgumentException("Ano nao pode ser negativo");
        }

        this.diasAno = diasAno;
        this.ano = ano;
        
        System.out.printf("%s %02d, %02d", "Voce criou a Data: ", this.diasAno, this.ano);
    }
}
