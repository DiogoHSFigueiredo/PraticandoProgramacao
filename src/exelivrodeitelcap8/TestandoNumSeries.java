/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap8;

/**
 *
 * @author Diogo
 */
public class TestandoNumSeries {

    public static void main(String[] args) {

        ObjetosNumSerie Mercedes = new ObjetosNumSerie();
        ObjetosNumSerie BMW = new ObjetosNumSerie();
        ObjetosNumSerie Audi = new ObjetosNumSerie();

        System.out.println("Este e o numero sequencial inicial " + ObjetosNumSerie.SeqInicial);

        System.out.println("O numero de serie do primeiro objeto e " + Mercedes.NumSerie());
        System.out.println("O numero de serie do primeiro objeto e " + BMW.NumSerie());
        System.out.println("O numero de serie do primeiro objeto e " + Audi.NumSerie());

       
    }

} // fim da classe
