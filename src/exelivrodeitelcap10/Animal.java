/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap10;

/**
 *
 * @author Diogo
 */
public abstract class Animal {

    //declaracao de variaveis de classe
    private final String nome;
    private final String respiracao;
    private final String alimentacao;
    private final String locomocao;
    private final double peso;
    
    //construtor sem argumentos
   // public Animal();

    //construtor com argumentos
    public Animal(String nome, String respiracao, String alimentacao, String locomocao, double peso) {
        this.nome = nome;
        this.respiracao = respiracao;
        this.alimentacao = alimentacao;
        this.locomocao = locomocao;
        this.peso = peso;
    }
    
    //metodos de acesso as variaveis de classe
    public final String getNome(){
        return nome;
    }
    public final String getRespiracao(){
        return respiracao;
    }
    public final String getAlimentacao(){
        return alimentacao;
    }
    public final String getLocomocao(){
        return locomocao;
    }
    

    
}
