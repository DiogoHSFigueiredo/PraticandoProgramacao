/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap10;

/**
 *
 * @author Diogo
 */
public class Cachorro extends Mamiferos {

    //variaveis de instancia
    private String somEmitido;
    private String raca;
    private String tipoPelo;
    private String brinquedoPreferido;

    //construtor sem argumento
    public Cachorro() {

    }

    //construtor com argumentos
    public Cachorro(String nome, String respiracao, String alimentacao, String locomocao, double peso, String formaAlimentacao, String somemitido, String raca, String tipoPelo, String brinquedoPreferido) {
        super(nome, respiracao, alimentacao, locomocao, peso, formaAlimentacao);
        this.somEmitido = somemitido;
        this.raca = raca;
        this.tipoPelo = tipoPelo;
        this.brinquedoPreferido = brinquedoPreferido;
    }

    //metodo exclusivo da classe
    public String getsomEmitido() {
        return somEmitido;
    }

}
