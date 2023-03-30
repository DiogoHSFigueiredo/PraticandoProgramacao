/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap10;

/**
 *
 * @author Diogo
 */
public abstract class Mamiferos extends Animal {

    //variaveis de classe
    private final String formaAlimentacao;

    //construtor sem argumentos
    //public Mamiferos();
    //construtor com argumentos
    public Mamiferos(String nome, String respiracao, String alimentacao, String locomocao, double peso, String formaAlimentacao) {
        super(nome, respiracao, alimentacao, locomocao, peso);
        this.formaAlimentacao = formaAlimentacao;

    }
    
    public String getFormaAlimentacao(){
        return formaAlimentacao;
    }

}
